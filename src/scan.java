import java.util.Scanner;
public class scan {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Hello " + name + ", you are " + age + " years old.");

            scanner.close(); // Always good to close the scanner when done
        }
    }
