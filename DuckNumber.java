import java.util.Scanner;

class DuckNumber{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to check Duck Number : ");
		int num = sc.nextInt();

		int temp = num ;
		boolean duck = false;

		while(temp>0){
			int digit = temp%10;

			if(digit == 0 ){
				duck = true ;

			}
			temp /=10;

		}
		if (duck) {
			System.out.println("Its Duck number");
		}else{
			System.out.println("Its Not Duck Number");
		}
	}
}