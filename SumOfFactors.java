import java.util.Scanner;

class SumOfFactors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a = sc.nextInt();

		System.out.println("Factors Sum");
		int sum = 0 ;
		for(int  i = 1 ; i<=a ; i++){
			if(a%i==0){
			sum = sum+i;
			
		}
	}
		System.out.println(sum);
	}
}