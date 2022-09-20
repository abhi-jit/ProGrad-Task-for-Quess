import java.util.Scanner;
public class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("1. Fibonacci Sequence\n2. IsPrime\n3. Factors of a given number\n4. Check Armstrong\n5. Prime factors\n6. Reverse");
        System.out.println("--------------------------------------");
        byte ch = sc.nextByte();


        switch (ch) {

            case 1:
                System.out.println("--------------------------------------");
                System.out.println("Enter the limit");
                int lim = sc.nextInt();
                int f_0 = 0, f_1 = 1, fib_i;
                System.out.print("Fibonacci sequence upto " + lim + " terms: " + f_0 + " " + f_1);
                for (int i = 2; i <= lim; i++) {
                    fib_i = f_0 + f_1;
                    System.out.print(" " + fib_i);
                    f_0 = f_1;
                    f_1 = fib_i;
                }
                System.out.println("--------------------------------------");
                break;

            case 2:
                System.out.println("--------------------------------------");
                Looping obj = new Looping();
                System.out.println("Enter the number");
                int prim = sc.nextInt();
                if (obj.isPrime(prim))
                    System.out.println(prim + " is Prime");
                else
                    System.out.println(prim + " is not Prime");
                break;

            case 3:
                System.out.println("--------------------------------------");
                System.out.println("Enter the number");
                int number = sc.nextInt();
                System.out.print("Factors of " + number + " are: ");
                for (int i = 1; i <= (int)(Math.sqrt(number)); ++i) {
                    if (number % i == 0) {
                        System.out.print(i + " "+number/i+" ");
                    }
                }
                System.out.println("--------------------------------------");
                break;
            case 4:
                System.out.println("--------------------------------------");
                System.out.println("Enter the number");
                int arm = sc.nextInt();
                int temp = arm, num, sum = 0;
                while (temp != 0) {
                    num = temp % 10;
                    sum += Math.pow(num, 3);
                    temp = temp / 10;
                }
                if (sum == arm)
                    System.out.println(arm + " is Armstrong");
                else
                    System.out.println(arm + " is not Armstrong");
                System.out.println("--------------------------------------");
                break;
            case 5:
                System.out.println("--------------------------------------");
                System.out.println("Enter the number");
                Looping obj1= new Looping();
                int f = sc.nextInt();
                if(!obj1.isPrime(f)) {
                    System.out.println("Prime factors of "+f+" are: ");
                    for (int i = 1; i <= f / 2; ++i) {
                        if (f % i == 0) {
                            if (obj1.isPrime(i))
                                System.out.print(i + " ");
                        }
                    }
                }
                else
                    System.out.println(f+" is Prime. So prime factors of "+f+" are "+1+" and "+f);
                System.out.println("--------------------------------------");
                break;
        }
    }

    public boolean isPrime(int prim) {

        if (prim == 0 || prim == 1) {
            return false;
        }
        int l = prim / 2;
        for (int i = 2; i <= l; i++) {
            if (prim % i == 0) {
                return false;
            }
        }
        return true;
    }
}

