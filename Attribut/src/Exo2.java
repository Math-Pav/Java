public class Exo2 {
    public static void main(String[] args) {
        Livre2 livre = new Livre2("Le Petit Prince");
        System.out.println("Titre initial : " + livre.titre);
        livre.titre = "Les Misérables";
        System.out.println("Titre modifié : " + livre.titre);
    }
}
