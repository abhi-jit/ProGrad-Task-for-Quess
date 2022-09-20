import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input the number");
        int num = s.nextInt();

        DigitSum dg= new DigitSum();
        dg.sumDig(num);
    }
    public void sumDig(int num){
        int Sum = num%10 + (num/10)%10 + (num/100);
        System.out.println("Sum of Digits is "+Sum);

    }
}
