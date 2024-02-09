import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Find and print the length of the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        System.out.println("1. Length of the string: " + length);

        // 2. Convert the string to uppercase and print it
        String upperCaseString = inputString.toUpperCase();
        System.out.println("2. Uppercase string: " + upperCaseString);

        // 3. Convert the string to lowercase and print it
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("3. Lowercase string: " + lowerCaseString);

        // 4. Print the first character of the string
        char firstChar = inputString.charAt(0);
        System.out.println("4. First character of the string: " + firstChar);

        // 5. Print the last character of the string
        char lastChar = inputString.charAt(length - 1);
        System.out.println("5. Last character of the string: " + lastChar);

        // 6. Print the substring starting from the second character to the fifth character of the string
        String substring = inputString.substring(1, Math.min(5, length));
        System.out.println("6. Substring from second to fifth character: " + substring);

        scanner.close();
    }
}
