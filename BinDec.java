import java.util.Scanner;
public class BinDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("1. Binary to Decimal\n2. Decimal to Binary\n0. Exit");
        System.out.println("--------------------------------------");
        byte ch = sc.nextByte();
        do{
        int bin,dec;
        switch (ch) {
            case 1:
                System.out.println("--------------------------------------");
                System.out.println("Enter binary number");
                bin = sc.nextInt();
                int rem,temp=bin,i=0;
                dec=0;
                while (temp!=0) {
                    rem=temp%10;
                    if(rem==0 || rem==1) {
                        dec += rem * Math.pow(2, i);
                        temp /= 10;
                        i++;
                    }
                    else{
                        System.out.println("Input is not binary");
                        break;
                    }
                    if(temp==0){
                        System.out.println("Decimal equivalent of "+bin+" is "+dec);
                        System.out.println("--------------------------------------");
                    }
                }
                break;
            case 2:
                System.out.println("--------------------------------------");
                System.out.println("Enter a decimal number");
                int dec1= sc.nextInt();
                int temp1=dec1;
                int rem1,j=0,bin1=0;
                while(temp1!=0){
                    rem1=temp1%2;
                    bin1+=rem1*Math.pow(10,j);
                    temp1/=2;
                    j++;
                }
                System.out.println("The binary equivalent of "+dec1+" is "+bin1);
                System.out.println("--------------------------------------");
            }
            System.out.println("Enter another choice");
        ch = sc.nextByte();
        if(ch==0){
            System.out.println("Exiting......bye bye");
            System.out.println("--------------------------------------");
        }
        }while(ch!=0);
    }
}
