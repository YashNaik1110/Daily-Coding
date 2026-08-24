import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

        sc.close();
    }

    public static char findFirstNonRepeating(String text) {

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (current == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return current;
            }
        }

        return '\0';
    }
}