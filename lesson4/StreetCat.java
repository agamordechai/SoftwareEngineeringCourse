package lesson4;

public class StreetCat extends Cat {
    protected int numOfFights;

    public StreetCat(String name, String color, int numOfFights) {
        super(name, color);
        this.numOfFights = numOfFights;
    }

    @Override
    public void makeNoise() {
        System.out.println("meow im a street cat");
    }

    @Override
    public void run() {
        System.out.println("street cat " + name + " running");
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of fights " + numOfFights + ".";
    }
}
