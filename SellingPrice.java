import java.util.Scanner;
public class SellingPrice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the price per item and quantity:");
        float price = s.nextFloat();
        int quant = s.nextInt();
        if(quant>=10)
            price *= 0.9f;
        System.out.println("Final amount is "+(price*quant));
    }
}
