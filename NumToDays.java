import java.util.Scanner;
public class NumToDays {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num= s.nextInt();

        NumToDays nd= new NumToDays();
        nd.Month(num);
        nd.Date(num);
    }
    public void Month(int num){
        int months=num/30;
        System.out.println("Months is "+months);
    }
    public void Date(int num){
        int date=num%30;
        System.out.println("Remaining days "+date);
    }
}

