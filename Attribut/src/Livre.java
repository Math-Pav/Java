 public class Livre {
    private String titre;

    public Livre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public static void main(String[] args) {
        Livre livre = new Livre("Le Petit Prince");
        System.out.println("Titre initial : " + livre.getTitre());
        livre.setTitre("Les Misérables");
        System.out.println("Titre modifié : " + livre.getTitre());
    }
}
