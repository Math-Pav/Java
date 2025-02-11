public class Voiture {
    private String marque;
    private double prix;
    private int annee;
    
    // Constructeur
    public Voiture(String marque, double prix,int annee) {
        this.marque = marque;
        this.prix = prix;
        this.annee = annee;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }


    public String getMarque() {
        return marque;
    }

    public int getAnnee() {
        return annee;
    }


    public double getPrix() {
        return prix;
    }
    
    public void afficherInfo() {
 	  System.out.println("Marque: " + marque);
    System.out.println("Prix: " + prix);
    System.out.println("Annee: " + annee);
    }

    public static void main(String[] args) {
        Voiture v = new Voiture("Toyota", 25000,2000);
        v.afficherInfo();
    }
}

