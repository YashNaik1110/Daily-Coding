import java.util.Scanner;

class MultipleCheck{
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter First Number : ");
     int first = sc.nextInt();
     System.out.print("Enter Second Number : ");
     int second = sc.nextInt();

     if(first%second==0){
        System.out.println("First Number is "+first+" Multiple of Second Number "+ second);
     }else{
        System.out.println("First Number is not Multiple of Second Number ");
     } }
}