package lesson6and7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String resultStr = null;
        while (true) {
            try {
                System.out.println("Enter the numerator and denominator for the first rational number (e.g., 1 2):");
                resultStr = reader.readLine();
                int r11 = Integer.parseInt(resultStr);
                resultStr = reader.readLine();
                int r12 = Integer.parseInt(resultStr);
                resultStr = reader.readLine();
                int r21 = Integer.parseInt(resultStr);
                resultStr = reader.readLine();
                int r22 = Integer.parseInt(resultStr);
                Rational r1 = new Rational(r11, r12);
                Rational r2 = new Rational(r21, r22);
                System.out.println("Rational 1: " + r1);
                System.out.println("Rational 2: " + r2);

                if (r1.greaterThan(r2)) {
                    System.out.println(r1 + " is greater than " + r2);
                } else if (r1.equals(r2)) {
                    System.out.println(r1 + " is equal to " + r2);
                } else {
                    System.out.println(r1 + " is less than " + r2);
                }
                r1.reduce();
                r2.reduce();
                System.out.println("Reduced Rational 1: " + r1);
                System.out.println("Reduced Rational 2: " + r2);

                break; // Exit the loop after successful execution
            } catch (IOException e) {
                System.out.println("Error reading input: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter valid rational numbers.");
            }
        }
    }
}