import java.util.Scanner;

public class bb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = 0;

        System.out.print("Enter a divisor: ");
        while (true) {
            String input = scanner.next();
            try {
                divisor = Integer.parseInt(input);
                if (divisor == 0) {
                    System.out.print("Divisor cannot be zero! Enter again: ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Invalid input! Enter a valid integer: ");
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            while (true) {
                String input = scanner.next();
                try {
                    int num = Integer.parseInt(input);
                    int result = num / divisor;
                    System.out.println("Result: " + result);
                    break;
                } catch (Exception e) {
                    System.out.print("Invalid input! Enter a valid integer: ");
                }
            }
        }

        scanner.close();
    }
}
