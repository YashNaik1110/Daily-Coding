import java.util.Scanner;
class CheckPrime{
    public static void main(String[] args){
        System.out.print("Enter number to check Prime : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count  = 0 ;
        for(int i= 1 ; i<= num ; i++ ){
            if(num%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is Not Prime");
        }
    }
}