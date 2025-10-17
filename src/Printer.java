public class Printer {

        // Overloaded methods with different parameter types and counts
        public void print(String message) {
            System.out.println("String: " + message);
        }

        public void print(int number) {
            System.out.println("Integer: " + number);
        }

        public void print(String message, int number) {
            System.out.println("String and Integer: " + message + ", " + number);
        }

        public static void main(String[] args) {
            Printer p = new Printer();
            p.print("Hello");
            p.print(10);
            p.print("Age", 25);
        }
    }
