package lesson6and7;

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

    public void plus(Rational other){
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
    }

    public void minus(Rational other){
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
    }

    public void multiply(Rational other){
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
    }

    public void divide(Rational other){
        if (this.denominator == 0 || other.numerator == 0)
            throw new ArithmeticException("Division by zero is not allowed");
        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;
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
