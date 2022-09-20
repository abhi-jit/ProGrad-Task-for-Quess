import java.util.Scanner;
public class ArrayExtremes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayExtremes obj = new ArrayExtremes();
        obj.maxAndMin(arr);
        obj.secLarg(arr);
        obj.sort1(arr);
    }

    public void maxAndMin(int[] arr) {
        int max = arr[0], min = arr[0],flag=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
            else {
                flag+=1;
            }
        }
        if(flag<arr.length)
            System.out.println("Maximum of the array is " + max + " and minimum of array is " + min);
        else if (flag>=arr.length) {
            System.out.println("The array members are equal");
        }
        System.out.println();
    }

    public void secLarg(int[] arr) {
        int max = arr[0], temp=arr[0],flag=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                temp = max;
                max = arr[i];
            } else if (arr[i] < max) {
                temp = arr[i];
            }
            else {
                flag+=1;
            }
        }
        if(flag<arr.length)
            System.out.println("Second largest element is "+temp);
        else if (flag>=arr.length) {
            System.out.println("The array members are equal");
        }
        System.out.println();
    }

    public void sort1(int[] arr) {
        int temp1;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1;j++) {
                if (arr[j] > arr[j+1]) {
                    temp1 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp1;
                }
            }
        }

        System.out.println("The sorted array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

