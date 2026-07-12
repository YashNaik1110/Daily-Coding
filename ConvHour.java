import java.util.Scanner;

public class SecondsConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        seconds = seconds % 3600;

        int minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + seconds);
    }
}