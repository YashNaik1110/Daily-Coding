import java.util.Scanner;

class UpperLowerCase{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a charcater to check Upper case or LowerCase : ");
        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("Youre Character is UpperCase ");
        }else if(ch>='a'&& ch<='z'){
            System.out.println("Youre Character is LowerCase");
        }else{
            System.out.println("Not a Alphabet");
        }
    }
}