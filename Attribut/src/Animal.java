public class Animal {
    protected String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public void afficherNom() {
        System.out.println("Nom de l'animal : " + nom);
    }

    public static void main(String[] args) {
        Chien chien = new Chien("Dexter");
        chien.afficherNom();
        chien.aboyer();
    }
}

class Chien extends Animal {
    
    public Chien(String nom) {
        super(nom);
    }

    public void aboyer() {
        System.out.println(nom + " aboie !!!");
    }
}