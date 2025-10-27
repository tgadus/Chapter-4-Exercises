import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for number of sides and side length
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // Calculate the area using the formula: (n × s²) / (4 × tan(π / n))
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        // Display the result
        System.out.println("The area of the polygon is " + area);
    }
}