public class Reptile extends Animal {
    public Reptile(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        ramper();
    }

    public void ramper() {
        System.out.println(nom + " rampe.");
    }
}
