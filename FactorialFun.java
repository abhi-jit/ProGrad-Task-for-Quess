import java.util.Scanner;
public class FactorialFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("1.Factorial\n2.Multiplication Table\n3.Sum of all even numbers\n4.Power function");
        System.out.println("--------------------------------------");
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                System.out.println("--------------------------------------");
                System.out.println("Enter a number");
                int n= sc.nextInt();
                int fact=1;
                if(n<0)
                    System.out.println("Negative numbers does not have factorial");
                else if(n>0) {
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    System.out.println(n + "! = " + fact);
                }
                System.out.println("--------------------------------------");
                break;

            case 2 :
                System.out.println("--------------------------------------");
                System.out.println("Enter a number");
                int num = sc.nextInt();

                for(int j=1;j<=10;j++){
                    System.out.println(j+" * "+num+" = "+(j*num));
                }
                System.out.println("--------------------------------------");
                break;

            case 3:
                System.out.println("--------------------------------------");
                System.out.println("Enter a number");
                int m = sc.nextInt();
                int even_sum=0,k=2;
                while(k<=m){
                    even_sum+=k;
                    k+=2;
                }
                System.out.println("Sum of even numbers upto "+m+" is "+even_sum);
                System.out.println("--------------------------------------");
                break;
            default:
                System.out.println("Invalid Choice mate!!");
                break;

            case 4:
                System.out.println("--------------------------------------");
                System.out.println("Enter the base");
                int base= sc.nextInt();
                System.out.println("Enter the power");
                int pow=sc.nextInt();

                int res=1,l=1;
                do{
                   res=res*base;
                   l++;
                }while(l<=pow);
                System.out.println(base+" to the power "+pow+" is = "+res);
                System.out.println("--------------------------------------");

        }
    }
}
