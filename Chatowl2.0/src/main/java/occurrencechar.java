import java.util.Scanner;

public class occurrencechar {

	public static void main(String[] args) {
		// Initialize the string
        String str = "Madhusmita";

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a character
        System.out.print("Enter a character to count its occurrences: ");
        char s = sc.next().charAt(0);

        // Initialize the count to zero
        int count = 0;
     // Loop through the string and count occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                count++;
            }
        }

        // Output the result
        System.out.println("The character '" + s + "' appears " + count + " times in the string \"" + str + "\".");

        // Close the scanner to prevent resource leak
        sc.close();

	}

}
