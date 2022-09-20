import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("Enter the number of rows you want:");
        int rows= sc.nextInt();
        int [][]arr = new int[rows][];

        for(int i=0;i<rows;i++){
            System.out.println("Enter the length of row "+i);
            int col= sc.nextInt();

            arr[i]= new int[col];
        }
        for(int i=0;i<rows;i++){
            System.out.println("Enter the elements of row "+i);
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("Jagged Array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        for(int i=0;i<rows;i++){
            int sum1=0;
            for(int j=0;j<arr[i].length;j++){
                sum1+=arr[i][j];
            }
            System.out.println("Sum of row "+i+" is "+sum1);
        }
    }
}

