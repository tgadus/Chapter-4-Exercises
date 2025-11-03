import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hex = input.next().toUpperCase();

        if (hex.length() == 1 && "0123456789ABCDEF".contains(hex)) {
            int decimal = Integer.parseInt(hex, 16);
            String binary = String.format("%4s", Integer.toBinaryString(decimal)).replace(' ', '0');
            System.out.println("The binary value is " + binary);
        } else {
            System.out.println("Invalid input");
        }
    }
}