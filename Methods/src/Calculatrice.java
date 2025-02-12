public class Calculatrice {

    public double add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }

    /*
    exemple du code au dessus sans raccourci
     * public double add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
     */

    public double sous(int a, int b) { return a - b; }
    public double sous(double a, double b) { return a - b; }

    public double multi(int a, int b) { return a * b; }
    public double multi(double a, double b) { return a * b; }

    public double divid(int a, int b) { return (double) a / b; }
    public double divid(double a, double b) { return a / b; }

    public double mod(int a, int b) { return a % b; }
    public double mod(double a, double b) { return a % b; }

    public double effectuerOperation(String operation, double a, double b) {
        double result = switch (operation) {
            case "addition" -> add(a, b);
            case "soustraction" -> sous(a, b);
            case "multiplication" -> multi(a, b);
            case "division" -> divid(a, b);
            case "modulo" -> mod(a, b);
            default -> throw new IllegalArgumentException("Opération inconnue");
        };

        System.out.println("Résultat : " + result);
        switch ((int) result) {
            case 42:
                System.out.println("🌟 Vous avez trouvé la réponse ultime à la vie, l'univers et tout le reste ! 🌟");
                break;
            default:
                break;
        }
        return result;
    }
}

