import java.util.Scanner;
public class ThirdAngle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first angle of the triangle in degrees:");
        float ang1= s.nextFloat();
        System.out.println("Enter the second angle in degrees:");
        float ang2= s.nextFloat();
        System.out.println("The third angle is "+(180-(ang1+ang2))+" degrees");
    }
}
