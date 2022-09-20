import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println("Addition: "+num1+" + "+num2+" = "+(num1+num2));
        System.out.println("Subtraction: "+num1+" - "+num2+" = "+(num1-num2));
        System.out.println("Multiplication: "+num1+" * "+num2+" = "+(num1*num2));
        System.out.println("Division: "+num1+" / "+num2+" = "+((float)num1/(float)num2));
    }
}
