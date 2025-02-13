public class Exo7 {

    public static class Fusee {
        public String name;
        public double poids;

        public Fusee(String name, double poids) {
            this.name = name;
            this.poids = poids;
            System.out.println("Fusée " + name + " créée, Poids : " + poids + " kg.");
        }

        public void decoller() {
            System.out.println("La fusée " + this.name + " est en phase de lancement");
        }
    }

    public static class Arianne6 extends Fusee {
        public Arianne6(String name, double poids) {
            super(name, poids); 
        }

       public void separationDesEtages(){
            System.out.println(this.name + " Separation des Etages");
       }
       public void pousseeSpecifiques(){
            System.out.println(this.name + " Poussée Spécifique");
       }

       @Override
       public void decoller() {
        super.decoller();
        pousseeSpecifiques();
        separationDesEtages();
       }
    }

    public static void main(String[] args) {

        Fusee ariane6 = new Arianne6("Ariane6", 500000);

        ariane6.decoller();
    }
}