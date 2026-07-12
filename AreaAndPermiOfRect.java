import java.util.Scanner;

class AreaAndPermiOfRect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length  : ");
        double length = sc.nextDouble();
        System.out.print("Enter Width : ");
        double width = sc.nextDouble();

        double area = length*width;
        double perimiter = 2*(length+width);
        System.err.println("Area Of Reactangle : "+ area);
        System.err.println("Perimiter of Reactangle : "+ perimiter);
    }
}