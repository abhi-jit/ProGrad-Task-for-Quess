import java.util.Scanner;
public class InsurancePolicy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marital status: (married/single) ");
        String mar_st= s.nextLine();

        if(mar_st.equalsIgnoreCase("married"))
            System.out.println("You are insured by the company!! You just got safety!!");
        else if(mar_st.equalsIgnoreCase("single")){
            System.out.println("Enter your gender (M/F) and age: ");

            char gen= s.next().charAt(0);
            byte age = s.nextByte();

            if((gen=='m'||gen=='M') && age>=30)
                System.out.println("You are insured");
            else if ((gen=='f'||gen=='F') && age>=25)
                System.out.println("You are insured by the company!! You just got safety!!");
            else
                System.out.println("Sorry!! You do not fit the insurance criteria");

            }
        }
    }
