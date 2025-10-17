public class meth {

//    public static int add(int a, int b){
//            return a+b;
//        }
//        static int sum=add(5,3);
//    public static void main(String[] args){
//        System.out.println(sum);
//    }


//    public static int sub(int a, int b){
//        return a-b;
//    }
//    static  int difference=sub(7,9);
//    public static void main(String[] args){
////        int difference=sub(7,9);
//        System.out.println("Difference: " +difference);
//    }


    public static int fact(int a){
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args){
        System.out.println("factorial of the  given number is: "+fact(5));
    }
    }
