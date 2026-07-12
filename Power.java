import java.util.Scanner;
class Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base : ");
        int base = sc.nextInt();
        System.out.println("Enter exponent of base : ");
        int exponent= sc.nextInt();
        int power = 1; 
        for(int i = 1 ; i<= exponent ; i++){
           power *=base;

        }
        System.out.println("Power  : " + power);
    }
}