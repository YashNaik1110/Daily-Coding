import java.util.Scanner;
class VowelCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character to check Vowel Or Consonant : ");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U'){
            System.out.println("Youre Character is Vowel ");
        }else{
            System.out.println("Youre Character is Consonant ");
        }
    }
}