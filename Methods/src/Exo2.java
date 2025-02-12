public class Exo2 {
    public static void main(String[] args) {
        Personne personne = new Personne("Jean Dupont", 30, "123 Rue Principale");

        System.out.println("Avant changement du nom :");
        personne.afficherNom();
        personne.modifierNom("Pierre Durand");
        System.out.println("Après changement du nom :");
        personne.afficherNom(); 
        System.out.println("Résultat final :");
        personne.afficherNom();
        personne.afficherAdresse(); 
        personne.afficherAge();
    }
}
