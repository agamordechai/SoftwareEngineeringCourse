package lesson6;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public boolean greaterThan(Rational other) {
        return this.numerator * other.denominator > this.denominator * other.numerator;
    }

    public boolean equals(Rational other) {
        return this.numerator * other.denominator == this.denominator * other.numerator;
    }

    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
