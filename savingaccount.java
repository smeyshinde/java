import java.util.Scanner;
public class savingaccount{
    static float  annualinterestrate;    
    float accbal;
    float interest;
    public  savingaccount(float  balance){
            this.accbal=balance;
    }  
    void set(){
        System.out.println(" Balance before 4% interest :"+accbal);
    }                                                                                        
   void calculate(){
    this.interest=(float)(accbal * annualinterestrate/12)/100;
   }
   void display(){
    System.out.println("Interest rate :"+annualinterestrate);
    System.out.println("Interest rate per month :"+interest);
    System.out.println("Total  :"+(accbal+interest)); 
   }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the account balance : ");
        float balance=sc.nextFloat();
        savingaccount s1=new savingaccount(balance);
        savingaccount.annualinterestrate=4;
        s1.set();
        s1.calculate();
        s1.display();
    }
}