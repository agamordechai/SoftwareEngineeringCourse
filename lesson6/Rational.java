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

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
