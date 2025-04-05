package lesson4;

public class SiamiCat extends Cat {
    protected String food;

    public SiamiCat(String name, String color, String food) {
        super(name, color);
        this.food = food;
    }

    @Override
    public void makeNoise() {
        System.out.println("meow im a siami cat");
    }

    @Override
    public void run() {
        System.out.println("siami cat " + name + " running");
    }

    @Override
    public String toString() {
        return super.toString() + ", Food " + food + ".";
    }
}
