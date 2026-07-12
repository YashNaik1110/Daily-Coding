import java.util.Scanner;

public class ConvYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int years = days / 365;
        days = days % 365;

        int months = days / 30;
        days = days % 30;

        System.out.println("Years = " + years);
        System.out.println("Months = " + months);
      
    }
}