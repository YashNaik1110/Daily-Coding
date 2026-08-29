import java.util.Scanner;

public class BalancedNumber {

    static boolean isBalanced(int number) {

        String num = String.valueOf(number);
        int length = num.length();

        int leftSum = 0;
        int rightSum = 0;

        int middle = length / 2;

        // Sum of left half
        for (int i = 0; i < middle; i++) {
            leftSum += num.charAt(i) - '0';
        }

        // Sum of right half
        for (int i = (length + 1) / 2; i < length; i++) {
            rightSum += num.charAt(i) - '0';
        }

        return leftSum == rightSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isBalanced(number)) {
            System.out.println(number + " is a Balanced Number.");
        } else {
            System.out.println(number + " is NOT a Balanced Number.");
        }

        sc.close();
    }
}