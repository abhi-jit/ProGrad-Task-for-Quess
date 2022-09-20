import java.util.Scanner;
public class Circle {
    static final float pi = 3.141592f;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius:");
        float rad = s.nextFloat();

        Circle obj = new Circle();
        obj.area(rad);
        obj.peri(rad);

    }
    public float area(float radius){

        float area = (pi * radius * radius);
        System.out.println("Area of the circle is: " + area);
        return area;
    }
    public float peri(float radius){

        float peri = (2 * pi * radius);
        System.out.println("Perimeter of the circle is: " + peri);
        return peri;
    }
}
