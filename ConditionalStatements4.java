import java.util.Scanner;

    public class ConditionalStatements4 {

        // Control flow stmt .... conditional .. looping ... jumping

        // Conditional ... simple if ... if else ... nested if... else if ladder ...
        public static void main(String[] args) {

            byte age;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age");
            age=sc.nextByte();

            if(age>=18)
            {
                boolean havingVotingCard;
                System.out.println("Do you have your voting card ? (yes/no)");
                sc.nextLine();
                String str = sc.nextLine();
                // smita == SMITA

                if(str.equalsIgnoreCase("yes"))
                    havingVotingCard =true;
                else
                    havingVotingCard=false;

                if(havingVotingCard)
                    System.out.println("You can VOTE");
                else
                    System.out.println("You need create your voting card");
            }
            else
            {
                System.out.println("Sorry you can not Vote... You need to wait "+ (18-age) + " years");
            }

        }
    }
