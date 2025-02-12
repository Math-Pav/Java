public class Compteur {

    private int compteur;

    public void incrementer(int valeur) {
        compteur += valeur;
    }

    public static void afficherCompteur(Compteur c) {
        System.out.println("Valeur actuelle du compteur : " + c.compteur);
    }
}