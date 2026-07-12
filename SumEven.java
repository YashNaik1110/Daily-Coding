import java.util.Scanner;

class SumEven{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter n Number to Sum of Even Number and Odd Number  : ");
       int num = sc.nextInt();
        int evenSum= 0;
        int oddSum=0 ;
        for(int i = 0 ; i<=num ; i++){
            if(i%2==0){
                evenSum +=i;
            }
            else{
                oddSum +=i;
            }
        }
        System.out.println("Sum of even Number is : "+ evenSum);
        System.out.println("Sum of odd Number is : "+ oddSum);
    }
}