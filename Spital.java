package SpitalRoz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spital {
    private static Spital instance;
    private static final Logger LOGGER = Logger.getLogger(Spital.class.getName());

    // Private constructor to prevent instantiation from outside
    private Spital() {
    }

    public static synchronized Spital getInstance() {
        if (instance == null) {
            instance = new Spital();
            LOGGER.log(Level.INFO, "Instanta spital creata.");
        }
        return instance;
    }

    public void intereneazaPacient(int numarPacientiInternati) {
        LOGGER.log(Level.INFO, "Pacienti internati: " + numarPacientiInternati);
    }

    public void externeazaPacient(int numarPacientiExternati) {
        LOGGER.log(Level.INFO, "Pacienti externati: " + numarPacientiExternati);
    }

    public static void main(String[ ] args) {
        Spital spital = new Spital();

        spital.intereneazaPacient(10);
        spital.externeazaPacient(6);
        try {
            Thread.sleep(6000); // Delay for 6000 milliseconds (6 seconds)
        } catch (InterruptedException e) {
            LOGGER.log(Level.SEVERE, "Thread interrupted", e);
            Thread.currentThread().interrupt();
        }
        spital.intereneazaPacient(7);
        spital.externeazaPacient(5);
    }

}
