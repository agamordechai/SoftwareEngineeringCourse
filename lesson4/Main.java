package lesson4;

public class Main {

    public static void main(String[] args) {
        SiamiCat siamiCat = new SiamiCat("mitzi", "gray","tuna");
        StreetCat streetCat = new StreetCat("kitzi", "black",23);

        System.out.println(siamiCat.toString());
        siamiCat.makeNoise();
        siamiCat.run();

        System.out.println("\n"+streetCat.toString());
        streetCat.makeNoise();
        streetCat.run();

        Chita chita = new Chita("Chit", "yellow", 0.85, 6);
        System.out.println("\n"+chita.toString());
        chita.makeNoise();
        chita.eatingAnimals();
        chita.run();
        System.out.println(chita.toString());
    }
}
