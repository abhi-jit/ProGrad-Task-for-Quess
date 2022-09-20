import java.util.Scanner;
public class IsCharacterOrDigit {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input:");
        char ch= s.nextLine().charAt(0);
        if(Character.isAlphabetic(ch)){
            System.out.println(ch+" is an Alphabet");
        }
        else if (Character.isDigit(ch)){
            System.out.println(ch+" is a digit");
        }
        else{
            System.out.println("'"+ch+"'"+" is neither an Alphabet nor a digit");
        }
        
    }
}
