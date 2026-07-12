import java.util.Scanner;
class VotingEligibilty{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Youre Age : ");
        int a = sc.nextInt();

        if(a >= 18){
            System.out.println("Youre Eligible for Vote ");
        }else{
            System.out.println("Youre not eligible for vote");
        }
    }
}