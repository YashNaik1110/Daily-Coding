import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check its Even OR Odd : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Its Even Number " + num);
        }
        else{
            System.out.println("Its Odd Number "+ num);
        }
   }
}