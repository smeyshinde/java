import java.util.Scanner;

class employee2
 {
   String name;
  void  displayCommonData(){
    System.out.println("name : omkar ");
    System.out.println("address : sangli ");
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. manager login");
            System.out.println("2. developer login");
            System.out.println("3. programer login");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                manager m=new manager();
                m.displayCommonData();
                m.displayManagerData();
            } else if (choice == 2) {
                developer d= new developer();
                d.displayCommonData();
                d.displayDeveloperData();
            }else if(choice == 3){
                programer p=new programer();
                p.displayCommonData();
                p.displayProgrammerData();
            }
        } while (choice != 3);

        sc.close();
    }
 }

 class manager extends employee2{
   void  displayManagerData(){
        System.out.println("job title :Manager "); 
        System.out.println("salary : 1000000 RS");
        }
 }
 class developer extends employee2{
    void displayDeveloperData(){
      System.out.println("job title : Developer");
      System.out.println("salary : 100000 RS");
    }
 }
 class programer extends employee2{
    void displayProgrammerData(){
        System.out.println("job title : Programer");
        System.out.println("salary : 100000000000 RS");
    }
   
 }
 