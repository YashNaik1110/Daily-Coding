import java.util.Scanner;

class BasicCalculator{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first Digit : ");
     int a = sc.nextInt();
     System.out.println("Enter Operator (+ , - , * , /  ) : ");
     char ch = sc.next().charAt(0);
     System.out.println("Enter Second Digit : ");
    int b = sc.nextInt();

    switch(ch){
        case '+' :{ System.out.println("Addition of Two Number is " + (a+b));
        break;
        }
        case '-' :{ System.out.println("Subtraction of Two Number is " + (a-b));
        break;
        }
        case '*' :{ System.out.println("Multiplication of Two Number is " + (a*b));
        break;
        }
        case '/' :{ 
            if(b!=0){
                System.out.println("Division of Two Number is " + (a/b));
            }else{
                System.out.println("Its not divisible by 0");
            }
        break;
        }
       
    }

 }
}