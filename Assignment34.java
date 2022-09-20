import java.util.Scanner;
public class Assignment34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int len = sc.nextInt();
        int []arr = new int[len];
        System.out.println("Enter the elements:");
        for (int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        Assignment34 obj = new Assignment34();
        obj.square(arr);
        obj.cube(arr);
        }
    public void cube(int[] arr) {
        System.out.println("Cube of the elements are: ");
        for (int j : arr) {
            System.out.print((int) Math.pow(j, 3) + " ");
        }
        System.out.println();
    }
    public void square(int[] arr){
        System.out.println("Square of the elements are: ");
        for (int j : arr) {
            System.out.print((int) Math.pow(j, 2) + " ");
        }
        System.out.println();
    }
}