import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        String[] sets = {
            "1 3 5 7\n9 11 13 15\n17 19 21 23\n25 27 29 31",
            "2 3 6 7\n10 11 14 15\n18 19 22 23\n26 27 30 31",
            "4 5 6 7\n12 13 14 15\n20 21 22 23\n28 29 30 31",
            "8 9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31",
            "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31"
        };

        int day = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < sets.length; i++) {
            System.out.println("Is your birthday in this set?");
            System.out.println(sets[i]);
            System.out.print("Enter Y for Yes and N for No: ");
            char answer = Character.toUpperCase(input.next().charAt(0));

            if (answer == 'Y') {
                day += (int) Math.pow(2, i);
            }
        }

        System.out.println("Your birthday is on day " + day + "!");
    }
}