import java.util.Scanner;
public class Swapping {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print(" Enter First number : " );
        float num1=in.nextFloat();
        System.out.print(" Enter Second number : " );
        float num2=in.nextFloat();

        System.out.println("--Before swap--");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);

        // Value of first is assigned to temporary
        float temporary = num1;
        num1 = num2;
        num2= temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
    }
}
