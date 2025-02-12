public class Exo4 {
    public static void main(String[] args) {
        Compteur c1 = new Compteur();
        c1.incrementer(5);
        Compteur.afficherCompteur(c1);

        c1.incrementer(10);
        Compteur.afficherCompteur(c1);
    }
}
