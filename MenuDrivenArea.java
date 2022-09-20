import java.util.Scanner;
public class MenuDrivenArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1. Area of a Circle\n 2. Area of a Square\n 3. Area of a Rectangle\n 4. Area of a Triangle");
        byte ch = sc.nextByte();

        switch(ch){
            case 1:
                System.out.println("Enter the radius of the circle");
                float rad= sc.nextFloat();
                System.out.println("The area of the circle is "+(Math.PI *rad*rad));
                break;
            case 2:
                System.out.println("Enter one side of the square");
                float side= sc.nextFloat();
                System.out.println("The area of the square is "+(side*side));
                break;
            case 3:
                System.out.println("Enter the sides of the rectangle");
                float len= sc.nextFloat();
                float bread= sc.nextFloat();
                System.out.println("The area of the rectangle is "+(len*bread));
                break;
            case 4:
                System.out.println("Enter the 3 sides of the triangle ");
                float a= sc.nextFloat();
                float b= sc.nextFloat();
                float c= sc.nextFloat();
                float s=(a+b+c)/2;
                System.out.println("The area of the triangle is "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                break;
            default:
                System.out.println("Invalid choice mate!!");


        }
    }
}
