import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the row size of the first matrix");
        int row1= sc.nextInt();
        System.out.println("Enter the column size of the first matrix");
        int col1= sc.nextInt();

        System.out.println("Enter the row size of the second matrix");
        int row2= sc.nextInt();
        System.out.println("Enter the column size of the second matrix");
        int col2= sc.nextInt();


        if(row1==row2 && col1==col2){
            int[][] mat1 =new int[row1][col1];

            System.out.println("Enter the elements of the first matrix;");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    mat1[i][j]= sc.nextInt();
                }
            }
            int[][] mat2 =new int[row2][col2];
            System.out.println("Enter the elements of the second matrix;");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    mat2[i][j]= sc.nextInt();
                }
            }
            System.out.println();

            System.out.println("Matrix 1: ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Matrix 2: ");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Sum of the matrices: ");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    System.out.print((mat1[i][j]+mat2[i][j])+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Difference of the matrices: ");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    System.out.print((mat1[i][j]-mat2[i][j])+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("The row and column of the two matrices should match");
    }
}
