class Fusee {

    protected String nom;
    protected double poids;

    public Fusee(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
        System.out.println("Fusée " + nom + " créée, Poids : " + poids + " kg.");
    }

    public void lancer() {
        System.out.println("La fusée " + nom + " est en phase de lancement.");
    }
}