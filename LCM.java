import java.util.Scanner;

class LCM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter a Second Number : ");
        int b  = sc.nextInt();

        int  max = (a>b)?a:b ;

        while(true){
            if( max % a == 0 && max % b == 0){
                System.out.println("LCM : "+ max);
                break;
            }
            max++;
        }
    }
}