import java.util.Scanner;

class AbsoluteNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Youre Number : ");
        int num = sc.nextInt();

        if(num<0){
            num = -num;
        }
        System.out.println("Absolute Number is : "+ num);
    }
}