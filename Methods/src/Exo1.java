public class Exo1 {
    public static void main(String[] args) {
        Addition addition = new Addition(10, 10);
        int resultat = addition.calculerSomme();
        System.out.println("La somme est: " + resultat);
    }
}
