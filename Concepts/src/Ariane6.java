class Ariane6 extends Fusee {

    public Ariane6(double poids) {
        super("Ariane 6", poids);
    }

    public void pousser() {
        super.lancer(); 
        System.out.println(this.nom + "La fusée Ariane 6 commence son lancement avec une poussée spécifique.");
        separationEtages(); 
    }

    public void separationEtages() {
        System.out.println(this.nom + "Les étages de la fusée Ariane 6 se séparent après le lancement.");
    }
}
