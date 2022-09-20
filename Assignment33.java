import java.util.Scanner;
public class Assignment33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the number of rows you want to print:");
        int n =sc.nextInt();
        for1:for(i=1;i<=n;i++){
            for2:for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        int k=0;
        for(i=1;i<=7;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+k+" ");
            }
            System.out.println();
            k+=i;
        }
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Enter the number of rows you want to print:");
        int m =sc.nextInt();
        for(i=1;i<=m;i++){
            for(j=1;j<=i;j++){
                System.out.print(m-j+1+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }
}