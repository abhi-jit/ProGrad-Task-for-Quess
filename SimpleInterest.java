import java.util.Scanner;
public class SimpleInterest {
    static final float r=7.50f;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(("Enter the principal amount: "));
        float p = s.nextFloat();
        System.out.println("Enter the time period in years: ");
        int n = s.nextInt();

        System.out.println("The simple interest of the amount "+p+" for "+n+" years is "+p*((r*n)/100f)+" and the final amount is "+p*(1+(r*n)/100f));
    }
}
