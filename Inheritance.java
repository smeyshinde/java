import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Person {
    Scanner sc = new Scanner(System.in);
    String name;
    String DOB;
    String height;
    String weight;
    String address;
    int age1;

    public void Calculate_age(){
        System.out.println("Enter Your DOB: ");
        DOB= sc.next();
        LocalDate birthdate = LocalDate.parse(DOB);
        LocalDate currentdate = LocalDate.now();
        Period age = Period.between(birthdate,currentdate);
        age1 =age.getYears();
        System.out.println("Age is :"+ age1);
    }

}

class Student extends Person{
    String roll_no;
    float marks1;
    float marks2;
    float avg;
    public void Calculate_avg_mark(){
        System.out.println("Enter subject 1 mark: ");
        marks1= sc.nextFloat();
        System.out.println("Enter subject 2 mark: ");
        marks2= sc.nextFloat();
        avg= (marks1 + marks2)/2;
    }
    public void display_data_student(){
        System.out.println("Name: "+ name);
        System.out.println("DOB: "+DOB);
        System.out.println("Age: "+ age1);
        System.out.println("Height: "+ height);
        System.out.println("Height: "+ weight);
        System.out.println("Address: "+ address);
        System.out.println("Roll_no: "+ roll_no);
        System.out.println("Avg marks: "+avg);
    }
}

class Employee extends Person{
    int eid;
    float salary;
    float tax;
    float x;
    public void calculate_tax(){
        System.out.println("Enter your salary: ");
        salary= sc.nextFloat();
        System.out.println("Enter tax percent: ");
        tax= sc.nextFloat();
        x= salary*(tax/100);
    }
    public void display_data_employee(){
        System.out.println("Name: "+ name);
        System.out.println("DOB: "+DOB);
        System.out.println("Age: "+ age1);
        System.out.println("Height: "+ height);
        System.out.println("Weight: "+weight);
        System.out.println("Address: "+ address);
        System.out.println("Employee id : "+ eid);
        System.out.println("Tax on salary: : "+x);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        int choice;
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        Employee employee= new Employee();
        do {
            System.out.println("1.student login");
            System.out.println("2.Employee login");
            System.out.println("3.exit");
            System.out.println("Enter your choice: ");
            choice= sc.nextInt();
            if(choice == 1){
                System.out.println("Enter student name: ");
                student.name = sc.next();
                System.out.println("Enter student height: ");
                student.height= sc.next();
                System.out.println("Enter student weight: ");
                student.weight= sc.next();
                System.out.println("Enter Student address: ");
                student.address=sc.next();
                student.Calculate_age();
                student.Calculate_avg_mark();
                System.out.println("Enter roll num: ");
                student.roll_no= sc.next();

                System.out.println("type 1 to display data");
                int temp = sc.nextInt();
                if(temp==1){
                    student.display_data_student();
                }
            }

            else if(choice == 2){
                System.out.println("Enter Employee name: ");
                employee.name = sc.next();
                System.out.println("Enter Employee id: ");
                employee.eid = sc.nextInt();
                System.out.println("Enter Employee height: ");
                employee.height= sc.next();
                System.out.println("Enter Employee weight: ");
                employee.weight= sc.next();
                System.out.println("Enter Employee address: ");
                employee.address=sc.next();
                employee.Calculate_age();
                employee.calculate_tax();
                System.out.println("type 1 to display data");
                int temp = sc.nextInt();
                if(temp==1){
                    employee.display_data_employee();
                }
            }
        }
        while(choice!=4);
    }
}
