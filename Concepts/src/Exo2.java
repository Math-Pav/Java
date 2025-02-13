public class Exo2 {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("Tesla Model S", "Rouge", 799.99);
        voiture1.afficherDetails();
        voiture1.setPrix(12000);
        System.out.println("\nAprès modification :");
        voiture1.afficherDetails();
    }
}