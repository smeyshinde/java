import java.util.Scanner;
 class oprater{
      int arr[][]=new int [2][2];
      int arr1[][]=new int [2][2];
      int result[][]=new int[2][2];
      Scanner sc=new Scanner(System.in);
    void  getarray(){
      System.out.println("enter elment of first matrix : ");
      for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            arr[i][j]=sc.nextInt();
        }
      }
      System.out.println("enter elment of second matrix : ");
      for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            arr1[i][j]=sc.nextInt();
        }
      }
    }
    void display(){
      System.out.println("first matrix is : ");
      for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println("second matrix is : ");
      for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(arr1[i][j]+" ");
        }
        System.out.println();
      }
    }
    void add(){
        System.out.println("add : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
              result[i][j]=arr[i][j]+arr1[i][j];
               System.out.print(result[i][j]+ " ");
            }
            System.out.println();
          }
    }
    void sub(){
        System.out.println("sub : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
           result[i][j]=arr[i][j]-arr1[i][j];
               System.out.print(result[i][j]+" ");
            }
            System.out.println();
          }
    }
    void Mult(){
        System.out.println("mult : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    result[i][j]+=arr[i][k]*arr1[k][j];
                }
            }
          }
    }
    void print_mult(){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
          }
    }
    }
class matrix{
    public static void main(String[] args) {
        oprater a=new oprater();
        a.getarray();
        a.display();
        a.add();
        a.sub();
        a.Mult();
        a.print_mult();
    }
}
