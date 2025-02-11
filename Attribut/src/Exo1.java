public class Exo1 {
    public static void main(String[] args) {
        Livre livre = new Livre("Le Petit Prince");
        System.out.println("Titre initial : " + livre.getTitre());
        livre.setTitre("Les Misérables");
        System.out.println("Titre modifié : " + livre.getTitre());
    }
}
