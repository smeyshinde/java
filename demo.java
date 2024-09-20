import java.util.Scanner;
public class demo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" start");
        int a,b,c;
        System.out.print("enter no 1: ");
        a=sc.nextInt();
        System.out.print("enter no 2: ");
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.print("c  : "+c);
        }
        catch(ArithmeticException e){
            System.out.println("error dived by zero");
        }

        //task 2
        int[] arr=new int[5];
        int[] ans=new int[5];
        System.out.println("Enter 5 no :");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the dived no :");
        int d=sc.nextInt();
        try{
            for(int i=0;i<5;i++){
                ans[i]=arr[i]/d;
            }
            System.out.println("ans : ");
            for (int i=0;i<5;i++){
                System.out.print(" "+ans[i]);
            }
        }
        catch(ArithmeticException e){
            System.out.println("error dived by zero");
        }
        System.out.println(" ");
        System.out.println(" end");
    }
}
