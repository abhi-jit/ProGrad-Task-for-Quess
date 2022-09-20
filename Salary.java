import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Salary");
        float sal= s.nextFloat();
        float bonus;
        if(sal>=20000)
            bonus=sal*0.1f;
        else
            bonus=sal*0.2f;
        float TA=sal*0.1f,DA=sal*0.15f,HRA=sal*0.2f,PF=sal*0.12f;
        System.out.println("Your final salary of the employee is "+(sal+bonus+TA+DA+HRA-PF));
    }
}
