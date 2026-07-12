import java.util.Scanner;

class CheckCharacter{
    public static void main(String[] args) {
        System.out.print("Enter a Character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if((ch>='A'&& ch<='Z')||(ch>='a' && ch<='z')){
            System.out.println("Character is Alphabet");

        }else if(ch>=1 && ch<=9){
            System.out.println("Chracter is digit");
        }else{
            System.out.println("Special Character");
        }
    }
}