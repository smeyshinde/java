import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Person {
    String name;
    String BOD;
    float height;
    float weight;
    String address;
    void calculateAge(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter height: ");
        height = sc.nextFloat();
        System.out.print("Enter weight: ");
        weight = sc.nextFloat();
        System.out.print("Enter address: ");
        address = sc.next();
        System.out.print("Enter BOD (yyyy-MM-dd): ");
        BOD = sc.next();
        LocalDate birthdate = LocalDate.parse(BOD);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        int ageYears = age.getYears();
        System.out.println("Age is: " + ageYears);
    }
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Address: " + address);
        System.out.println("BOD: " + BOD);
    }
}

class Student extends Person {
    int roll_No;
    float marks1, marks2, avg;
    void getData(Scanner sc) {
        System.out.print("Enter roll number: ");
        roll_No = sc.nextInt();
        System.out.print("Enter marks for first subject: ");
        marks1 = sc.nextFloat();
        System.out.print("Enter marks for second subject: ");
        marks2 = sc.nextFloat();
        avg = (marks1 + marks2) / 2; // Calculate average of the marks
    }
    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + roll_No);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Average Marks: " + avg);
    }
}

class Employee extends Student {
    int empId;
    float salary;
    float tax;  
    void calculateTax(Scanner sc) {
        System.out.print("Enter emp ID: ");
        empId = sc.nextInt();
        System.out.print("Enter salary: ");
        salary = sc.nextFloat();
        System.out.print("Enter tax percent: ");
        tax = sc.nextFloat();
        float taxAmount = salary * (tax / 100);
        System.out.println("Tax amount: " + taxAmount);
    }
    void displayEmployee() {
        displayStudent();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

public class Stu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Student login");
            System.out.println("2. Employee login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                Student s = new Student();
                s.calculateAge(sc);
                s.getData(sc);
                s.displayStudent();
            } else if (choice == 2) {
                Employee e = new Employee();
                e.calculateAge(sc);
                e.getData(sc);
                e.calculateTax(sc);
                e.displayEmployee();
            }
        } while (choice != 3);

        sc.close();
    }
}
