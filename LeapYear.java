import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Year to check Its Lear or not : ");
         int year = sc.nextInt();
         
         if((year%400 == 0) || (year%4==0 && year%100!=0)){
            System.out.println( year + "its leap year ");
         }else{
            System.out.println(year+"its not leap year");
         }
    }
}