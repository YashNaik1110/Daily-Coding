import java.util.Scanner;

class PercentageCal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter youre Marks Of Subject ");
        System.out.print("Mathematics : ");
        double math = sc.nextDouble();
        System.out.print("Social Science : ");
        double ss = sc.nextDouble();
        System.out.print("English : ");
        double eng = sc.nextDouble();
        System.out.print("Science : ");
        double sci = sc.nextDouble();
        System.out.print("Marathi : ");
        double marathi = sc.nextDouble();

        double add = math+ss+eng+sci+marathi;
        double percentage = (add/500)*100;

        System.out.println("Total Percentage : "+ percentage);
    }
}