import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
         System.out.println("===Find Simple Interest ===");
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter Principle ( initial amount borrowed or invested) : ");
         double p = sc.nextDouble();
         
         System.out.print("Enter Rate Of Interest : ");
         double r = sc.nextDouble();
         
         System.out.print("Duration Or Time  in Years : ");
         double t = sc.nextDouble();    
         double simpleInterest = (p * r * t) / 100;
         double totalAmount = p + simpleInterest;
         System.out.println("Simple Interest is : " + simpleInterest);
         System.out.println("Total Amount (Principal + Interest) is : " + totalAmount);

    }
}
