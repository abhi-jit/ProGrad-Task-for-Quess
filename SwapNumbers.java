import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a = s.nextInt();
        System.out.println("Enter Second number1:");
        int b = s.nextInt();

        SwapNumbers sn= new SwapNumbers();
        sn.swap(a,b);
    }
    public void swap(int a,int b){

        int c=a+b;

        a=c-a;
        b=c-a;
        System.out.println("After swapping: ");
        System.out.println("First number is "+a+" Second number is "+b);
    }
}
