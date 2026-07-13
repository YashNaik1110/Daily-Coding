import java.util.Scanner;

class SpyNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int sum = 0 ;
        int product = 1 ;

        while(num>0){
        	int digit = num%10;

        	sum+=digit;
        	product*=digit;

        	num /=10;
        }
        if(sum == product){
        	System.out.println("Its SpyNumber");
        }else{
        	System.out.println("Its Not SpyNumber");
        }
	}
}