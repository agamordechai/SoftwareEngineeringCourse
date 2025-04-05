package lesson4;

public class Chita extends Cat implements EatingAnimalsable {
    protected double height;
    protected int numOfDevouredAnimals;

    public Chita(String name, String color, double height, int numOfDevouredAnimals) {
        super(name, color);
        this.height = height;
        this.numOfDevouredAnimals = numOfDevouredAnimals;
    }

    @Override
    public void makeNoise() {
        System.out.println("meow im a chita");
    }

    @Override
    public void run() {
        System.out.println("chita " + name + " running");
    }

    @Override
    public String toString() {
        return super.toString() + ", Height " + height + ", Number of devoured animals " + numOfDevouredAnimals + ".";
    }

    @Override
    public void eatingAnimals() {
        this.numOfDevouredAnimals++;
        System.out.println("chita " + name + " is eating animals");
    }
}
