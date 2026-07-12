
import java.util.Scanner;

class SmallestOfThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number  :" );
        int first = sc.nextInt();
        System.out.print("Enter Second  Number  : ");
        int sec = sc.nextInt();
        System.out.print("Enter Third Number  : ");
        int third = sc.nextInt();

        if(first<=sec&& first<=third){
            System.out.println("First Number is Samllest ");
        }else if(sec<=first && sec<=third){
            System.out.println("Second Number is Smallest ");
        }else if(third<=first&& third<=sec){
            System.out.println("Third number is Samllest ");
        }else{
            System.out.println("All Numbers are eqauls");
        }
    }
}