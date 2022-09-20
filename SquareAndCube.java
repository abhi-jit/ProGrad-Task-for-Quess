import java.util.Scanner;
public class SquareAndCube {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=s.nextInt();
        System.out.println("Square of the number is "+(int)Math.pow(num,2)+" and Cube of the number is "+ (int)Math.pow(num,3));
    }
}
