public class Exo5 {
    public static void main(String[] args) {
        PorteAvion porteAvion = new PorteAvion();

        Avion avionDeChasse = new AvionDeChasse();
        Avion avionDeTransport = new AvionDeTransport();

        porteAvion.ajouterAvion(avionDeChasse);
        porteAvion.ajouterAvion(avionDeTransport);

        porteAvion.lancerAvions();
    }
} 