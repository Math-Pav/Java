public class Oiseau extends Animal {
    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        voler();
    }

    public void voler() {
        System.out.println(nom + " vole.");
    }
}
