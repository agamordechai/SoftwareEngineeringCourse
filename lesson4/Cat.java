package lesson4;

public abstract class Cat {
    protected String color;
    protected String name;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void makeNoise();

    public abstract void run();

    @Override
    public String toString() {
        return "Color " + this.color + ", Name " + this.name;
    }
}
