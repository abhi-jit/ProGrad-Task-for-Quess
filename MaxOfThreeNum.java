import java.util.Scanner;
public class MaxOfThreeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enther the first number:");
        int num1= s.nextInt();
        System.out.println("Enther the second number:");
        int num2= s.nextInt();
        System.out.println("Enther the third number:");
        int num3= s.nextInt();

        int temp;
        System.out.println("The greatest of "+num1+","+num2+" and "+num3+" is "+((((num1>num2)?num1:num2)<num3)?num3:(num1>num2)?num1:num2));
    }
}
