import java.text.SimpleDateFormat;
import java.util.Date;

public class Date {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Afficher la date au format spécifié
        System.out.println(formatter.format(date));  // Ex : 10/02/2025 14:30:12
    }
}

