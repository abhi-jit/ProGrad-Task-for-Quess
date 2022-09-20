import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int len = sc.nextInt();
        int []arr = new int[len];
        for (int i = 0;i<len;i++){
            System.out.println("Enter the elements:");
            arr[i] = sc.nextInt();
            arr[i]+=5;
        }
        for (int i = 0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
