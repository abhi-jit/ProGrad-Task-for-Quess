import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Table of the number\n2. Sum upto given number\n3. Power function\n0. Exit");
        int ch = sc.nextInt();
        if (ch != 0) {
            switch (ch) {
                case 1:
                    System.out.println("Enter a number");
                    int n = sc.nextInt();
                    Recursion.table(n, 1);
                    break;
                case 2:
                    System.out.println("Enter the number");
                    int m= sc.nextInt();
                    int res;
                    res=Recursion.suM(m);
                    System.out.println("Sum of natural numbers upto "+m+" is "+res);
                    break;
                case 3:
                    System.out.println("Enter base");
                    int base=sc.nextInt();
                    System.out.println("Enter exponent");
                    int exp=sc.nextInt();
                    int pow;
                    pow=Recursion.Power(base,exp);
                    System.out.println(base+" to the power "+exp+" is "+pow);
            }
        }
        else
            System.out.println("Exiting program....");
    }

            public static void table ( int n, int i){
                if(i==10)
                    System.out.println(i + " * " + n + " = " + (n * i));
                else if(i<10) {
                    System.out.println(i + " * " + n + " = " + (n * i));
                    table(n, i + 1);
                }
            }
            public static int suM(int n){
                if(n==0)
                    return 0;
                else
                    return n+suM(n-1);
            }
            public static int Power(int base, int exp){
                if(exp==0)
                    return 1;
                else return base*Power(base,exp-1);
            }

        }