import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = sc.nextDouble();
        System.out.print("Enter the height:");
        double height = sc.nextDouble();

        Rectangle rect = new Rectangle(width,height);

        System.out.println("Your Rectangle \n "+ rect.display());
        System.out.println("Perimeter: "+rect.getPerimeter());
        System.out.println("Area: "+rect.getArea());
    }
}
