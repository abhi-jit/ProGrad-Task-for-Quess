import java.util.Scanner;
public class ConditionalOperator3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the percentage:");
        float perc= s.nextFloat();
        System.out.println((perc>40)?"You have passed":"You have failed");
    }
}
