import java.util.Scanner;
public class FindProfit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the selling price per item ");
        float sp= s.nextFloat();
        System.out.println("Enter the cost price per item");
        float cp= s.nextFloat();
        System.out.println("The profit by selling an item is " +(sp-cp));
    }
}
