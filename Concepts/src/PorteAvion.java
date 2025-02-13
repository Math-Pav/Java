import java.util.ArrayList;
import java.util.List;

public class PorteAvion {
    private List<Avion> avions;

    public PorteAvion() {
        avions = new ArrayList<>();
    }

    public void ajouterAvion(Avion avion) {
        avions.add(avion);
    }

    public void lancerAvions() {
        for (Avion avion : avions) {
            avion.decoller();
        }
    }
}

