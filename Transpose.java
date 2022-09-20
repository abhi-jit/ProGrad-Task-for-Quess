import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the first matrix");
        int row= sc.nextInt();
        int col= sc.nextInt();
        int[][] mat =new int[row][col];

        System.out.println("Enter the elements of the matrix;");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]= sc.nextInt();
            }
        }

        int[][] transMat =new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                transMat[i][j]=mat[j][i];
            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpose of the Matrix : ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
