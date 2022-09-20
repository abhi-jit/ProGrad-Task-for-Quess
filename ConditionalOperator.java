import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= s.nextInt();
        System.out.println("Enter the second number:");
        int num2= s.nextInt();
        if(num1!=num2) {
            System.out.println("Minimum of " + num1 + " and " + num2 + " is " + ((num1 > num2) ? num2 : num1));
        }
        else{
            System.out.println("The numbers are equal");
        }
    }
}
