public class Voiture {
    
    private String marque;

    public Voiture(String marque) {
        this.marque = marque;
    }

    public void afficherMarque() {
        System.out.println("Marque de la voiture : " + this.marque);
    }

    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("Tesla");
        voiture1.afficherMarque();
    }
}