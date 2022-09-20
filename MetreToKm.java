import java.util.Scanner;
public class MetreToKm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the distance in metres:");
        float m = s.nextFloat();
        System.out.println("The distance in Kilometres is "+m/1000f);
    }
}

