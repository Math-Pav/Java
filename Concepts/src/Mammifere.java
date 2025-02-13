public class Mammifere extends Animal {
    public Mammifere(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        marcher();
    }

    public void marcher() {
        System.out.println(nom + " marche.");
    }
}
