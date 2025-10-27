import java.util.Scanner;

public class Exercise04_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the length from the center to a vertex
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        // Calculate the side length using s = 2r * sin(π / 5)
        double s = 2 * r * Math.sin(Math.PI / 5);

        // Calculate the area using Area = (5 * s^2) / (4 * tan(π / 5))
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        // Display the result rounded to two decimal places
        System.out.printf("The area of the pentagon is %.2f\n", area);
    }
}