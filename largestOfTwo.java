import java.util.Scanner;

class largestOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number  :" );
        int first = sc.nextInt();
        System.out.print("Enter Second  Number  : ");
        int sec = sc.nextInt();

        if(first>sec){
            System.out.println("First Number is largest ");
        }else if(sec>first){
            System.out.println("Second Number is largest ");
        }else{
            System.out.println("Both number is equal");
        }
    }
}