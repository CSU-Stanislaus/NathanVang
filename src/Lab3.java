import java.util.Scanner;
import java.io.PrintStream;

class ControlStatementsLab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Control Statements Challenge ===");

        System.out.print("1) Enter an integer to test even/odd: ");
        int n1 = readInt(sc);
        System.out.println("   isEven? " + isEven(n1));

        System.out.print("2) Enter two integers (a then b) to find the max:\n   a = ");
        int a = readInt(sc);
        System.out.print("   b = ");
        int b = readInt(sc);
        System.out.println("   max: " + maxOfTwo(a, b));

        System.out.print("3) Enter a score (0-100) to get letter grade: ");
        int score = readInt(sc);
        System.out.println("   letter grade: " + gradeLetter(score));

        System.out.print("4) Enter an integer for FizzBuzz (single value): ");
        int fb = readInt(sc);
        System.out.println("   result: " + fizzBuzzOne(fb));

        System.out.print("5) Enter n to sum from 1..n: ");
        int n = readInt(sc);
        System.out.println("   sum 1..n: " + sum1toN(n));

        System.out.print("6) Enter n to compute n! (while loop): ");
        int nf = readInt(sc);
        System.out.println("   n! = " + factorial(nf));

        System.out.print("7) Enter text to reverse: ");
        String toReverse = sc.nextLine();
        System.out.println("   reversed: " + reverseString(toReverse));

        System.out.print("8) Enter text to count vowels: ");
        String vowelStr = sc.nextLine();
        System.out.println("   vowel count: " + countVowels(vowelStr));

        System.out.print("9) Enter an integer for its 1..10 multiplication table: ");
        int mt = readInt(sc);
        System.out.println(multiplicationTable(mt));

        System.out.print("10) Enter a number 1-7 (1=Mon ... 7=Sun): ");
        int dayNum = readInt(sc);
        System.out.println("   day: " + dayNameSwitch(dayNum));

    }

    // --- Utility Method ---
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

    // --- Implementations ---

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int maxOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static String gradeLetter(int score) {
        if (score < 0 || score > 100) return "Invalid";
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    public static String fizzBuzzOne(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        else if (n % 3 == 0) return "Fizz";
        else if (n % 5 == 0) return "Buzz";
        else return String.valueOf(n);
    }

    public static int sum1toN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n) {
        if (n < 0) return -1; // invalid input
        long result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static String multiplicationTable(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(n + " x " + i + " = " + (n * i) + "\n");
        }
        return sb.toString();
    }

    public static String dayNameSwitch(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid day";
        }
    }
}