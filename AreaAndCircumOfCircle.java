import  java.util.Scanner;
class AreaAndCircumOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Radius Of circle  : ");
        double radius = sc.nextDouble();
        double pi = 3.14;

        double area = pi*radius*radius;
        double circumference = 2*pi*radius;
        System.err.println("Area Of Circle: "+ area);
        System.err.println("Circumference of circle : "+ circumference);
    }
}