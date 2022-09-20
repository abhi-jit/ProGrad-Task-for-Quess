import java.util.Scanner;
public class MenuDriven2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println(" 1. Even or odd\n 2. Positive or negative\n 3. Maximum of two\n 4. Days to months and remaining days");
        System.out.println("--------------------------------------");
        byte ch = sc.nextByte();

        switch (ch){
            case 1:
                System.out.println("--------------------------------------");
                System.out.println("Enter the number");
                int num = sc.nextInt();
                if((num & 1)==1)
                    System.out.println(num+ " is Odd");
                else
                    System.out.println(num+" is Even");
                System.out.println("--------------------------------------");
                break;
            case 2:
                System.out.println("--------------------------------------");
                System.out.println("Enter the number");
                float n = sc.nextFloat();
                if(n>0)
                    System.out.println(n+" is Positive");
                else if(n<0)
                    System.out.println(n+ " is Negative");
                else
                    System.out.println(n+" Is neither positive nor negative");
                System.out.println("--------------------------------------");
                break;
            case 3:
                System.out.println("--------------------------------------");
                System.out.println("Enter two numbers:");
                int num1= sc.nextInt();
                int num2= sc.nextInt();
                if(num1!=num2) {
                    System.out.println("Maximum of " + num1 + " and " + num2 + " is " + ((num1 < num2) ? num2 : num1));
                }
                else
                    System.out.println("The numbers are equal");
                System.out.println("--------------------------------------");
                break;
            case 4:
                System.out.println("--------------------------------------");
                System.out.println("Enter the Number of Days");
                int days= sc.nextInt();
                System.out.println((days/30)+" Months and "+(days%30)+" days");
                System.out.println("--------------------------------------");
                break;
            default:
                System.out.println("Invalid choice mate!!");

        }
    }
}
