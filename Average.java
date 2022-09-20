import java.util.Scanner;
public class Average {
        public static void main(String[] args) {
             Average obj = new Average();
             obj.Avg();
        }
        public void Avg(){
                Scanner s = new Scanner(System.in);

        System.out.println("Enter the Java mark");
        byte m1 = s.nextByte();
        System.out.println("Enter the Python mark:");
        byte m2 = s.nextByte();
        System.out.println("Enter the C mark:");
        byte m3 = s.nextByte();

        float averageMarks = (m1 + m2 + m3) / 3f;
        System.out.println("Average Marks is:" + averageMarks);
        }
}
