import java.util.Scanner;
public class suuitch {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();
        switch(number){
            case 1:
                System.out.println("number is 1");
                break;
            case 12:
                System.out.println("number is 12");
                break;
            default:
                System.out.println("number not on list");
        }
    }
}
