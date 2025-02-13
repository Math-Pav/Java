public class Exo1 {
    public static void main(String[] args) {
        Animal tigre = new Mammifere("Tigre");
        Animal perroquet = new Oiseau("Perroquet");
        Animal cameleon = new Reptile("cameleon");

        tigre.manger();
        tigre.seDeplacer();

        perroquet.manger();
        perroquet.seDeplacer();

        cameleon.manger();
        cameleon.seDeplacer();
    }
}
