abstract class Forme {
    public abstract double calculerSurface();
}

class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double calculerSurface() {
        return Math.PI * Math.pow(rayon, 2);
    }
}

class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double calculerSurface() {
        return largeur * hauteur;
    }
}

public class Exo4 {
    public static void main(String[] args) {
        Forme cercle = new Cercle(5);
        System.out.println("Surface du cercle : " + cercle.calculerSurface());

        Forme rectangle = new Rectangle(4, 6);
        System.out.println("Surface du rectangle : " + rectangle.calculerSurface());
    }
}