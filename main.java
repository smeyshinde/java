import java.util.Arrays;
import java.util.Scanner;
 class classroom{
  String student[];
  String name;
    classroom(String a,String s[]){
        name=a;
        student=s;
    }
    void getdata(){
        System.out.println("class name  : "+name);
        System.out.println("Student name  : "+Arrays.toString(student));
    }   
}
public class main{
    public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.err.println("enter number of student : ");
            int a=sc.nextInt();
            String abc[]=new String[a];
            System.err.println("enter student name : ");
            for(int i=0;i<a;i++){
                    abc[i]=sc.next();
            }
            classroom c=new classroom("final_year",abc);
            c.getdata();
    }
}