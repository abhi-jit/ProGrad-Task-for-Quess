import java.util.Scanner;
public class CharToUnicode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the charecter ");
        char ch = s.nextLine().charAt(0);

        CharToUnicode obj = new CharToUnicode();
       int res= obj.unicode(ch);
        System.out.println("Unicode of the input is "+res );
    }
    public int unicode(char ch){
        int b= (int)ch;
       // System.out.println("Unicode of the input is "+b);
        return b;
    }
}
