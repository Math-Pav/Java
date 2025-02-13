class Employe {
    protected String nom;

    public Employe(String nom) {
        this.nom = nom;
    }

    public void travailler() {
        System.out.println(nom + " travaille à l'école.");
    }
}

class Enseignant extends Employe {
    public Enseignant(String nom) {
        super(nom);
    }

    @Override
    public void travailler() {
        System.out.println(nom + " enseigne aux élèves.");
    }
}

class Directeur extends Employe {
    public Directeur(String nom) {
        super(nom);
    }

    @Override
    public void travailler() {
        System.out.println(nom + " gère l'école et prend des décisions importantes.");
    }
}

class PersonnelAdministratif extends Employe {
    public PersonnelAdministratif(String nom) {
        super(nom);
    }

    @Override
    public void travailler() {
        System.out.println(nom + " gère les dossiers et l'administration.");
    }
}

public class Exo3 {
    public static void main(String[] args) {
        Employe e1 = new Enseignant("M. Dupont");
        Employe e2 = new Directeur("Mme Martin");
        Employe e3 = new PersonnelAdministratif("Mlle Leroy");

        e1.travailler();
        e2.travailler();
        e3.travailler();
    }
}