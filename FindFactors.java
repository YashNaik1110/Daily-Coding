import java.util.Scanner;
class FindFactors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int a = sc.nextInt();

		System.out.println("Factors ");

		for(int i = 1 ; i<=a ; i++){
			if(a % i == 0){
				System.out.println(i + " ");
			}
		}
	}
}