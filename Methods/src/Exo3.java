public class Exo3 {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        calc.effectuerOperation("addition", 20, 22);
        calc.effectuerOperation("soustraction", 50, 7);
        calc.effectuerOperation("multiplication", 34, 7);
        calc.effectuerOperation("division", 58, 7);
        calc.effectuerOperation("modulo", 45, 7);
    }
}