import java.util.Scanner;
public class looop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();
        for(int i = 0; i<=number; i++){
            System.out.println(i+ " is less than or equal to:" +number);
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("For loop iteration: " + i);
//        }

    }
}
