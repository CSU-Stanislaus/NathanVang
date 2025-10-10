
import java.util.Scanner;

class StringManipulationChallenge {

   static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== String Manipulation Challenge ===");

        // 1) Upper / Lower / Trim
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String upper = stringToUpper(input);
        System.out.println("UPPER: " + upper);

        String lower = stringToLower(input);
        System.out.println("lower: " + lower);

        System.out.print("Enter a sentence with leading/trailing spaces: ");
        String spaced = sc.nextLine();
        String trimmed = stringTrim(spaced);
        System.out.println("trim : '" + trimmed + "'");

        // 2) Substring
        System.out.print("Enter a string to take a substring from: ");
        String subSource = sc.nextLine();
        System.out.print("Enter start index (int): ");
        int start = readInt(sc);
        System.out.print("Enter substring length (int): ");
        int len = readInt(sc);

        try {
            String sub = stringSubstring(subSource, start, len);
            System.out.println("substring: " + sub);
        } catch (Exception e) {
            System.out.println("substring: ERROR -> " + e.getMessage());
        }

        // 3) Search char
        System.out.print("Enter a string to search in: ");
        String searchIn = sc.nextLine();
        System.out.print("Enter the character to search for: ");
        String charStr = sc.nextLine();
        char target = (charStr.isEmpty() ? '\0' : charStr.charAt(0));
        int idx = searchChar(searchIn, target);
        System.out.println("index of '" + target + "': " + idx);

        // 4) Concat names
        System.out.print("Enter first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lName = sc.nextLine();
        String fullName = concatNames(fName, lName);
        System.out.println("Full name: " + fullName);

        System.out.println("=== Done. ===");
        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }

    public static String stringToUpper(String myString) {
        return myString.toUpperCase();
    }

    public static String stringToLower(String usersString) {
        return usersString.toLowerCase();
    }

    public static String stringTrim(String usersStringWithWhiteSpace) {
        return usersStringWithWhiteSpace.trim();
    }

    public static String stringSubstring(String x, int firstElement, int lengthOfSubstring) {
        if (x == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        if (firstElement < 0 || lengthOfSubstring < 0) {
            throw new IllegalArgumentException("Indices must be non-negative.");
        }
        if (firstElement + lengthOfSubstring > x.length()) {
            throw new IllegalArgumentException("Substring range is out of bounds.");
        }
        return x.substring(firstElement, firstElement + lengthOfSubstring);
    }

    public static int searchChar(String userInputString, char charUserWants) {
        if (userInputString == null) {
            return -1;
        }

        userInputString = stringTrim(userInputString);  // remove leading/trailing spaces
        return userInputString.indexOf(charUserWants);  // return index or -1
    }

    public static String concatNames(String fName, String lName) {
        if (fName == null || lName == null) {
            throw new IllegalArgumentException("First name and last name cannot be null.");
        }
        return fName + " " + lName;
    }
}