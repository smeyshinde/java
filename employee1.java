import java.util.Scanner;

class employee {
    Scanner sc= new Scanner(System.in);
    String fname;
    String lname;
    float salary;
  employee(){
    fname="";
    lname="";
    salary=0.0f;
  }
  void setdata(){
    System.out.print("enter the first name : ");
    fname=sc.nextLine();
    System.out.print("enter the last name : ");
    lname=sc.nextLine();
    System.out.print("enter the salary : ");
    salary=sc.nextFloat();
 
  }
  void getdata(){
    float x=salary*0.1f;
    salary=x+salary;
    System.out.println("name is : "+fname+" "+lname+"\n"+"salary is : "+salary);
  }
 

public static void main(String[] args){
    employee a =new employee();
    employee b =new employee();
    a.setdata();
    a.getdata();
    b.setdata();
    b.getdata();
  }
}