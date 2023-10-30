package SpitalRoz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spital {
    private static Spital instance;
    private int numarMedici;    //nr. total medici angajati
    private int numarAsistenti; //nr. total asistenti angajati
    private static final Logger LOGGER = Logger.getLogger(Spital.class.getName());

    // Constructor privat pt. a preveni instantierea din exterior
    private Spital() {
    }

    public static synchronized Spital getInstance() {
        if (instance == null) {
            instance = new Spital();
            LOGGER.log(Level.INFO, "Instanta spital creata.");
        }
        return instance;
    }

    public void angajeazaMedic(int numarMediciAngajati) {
        numarMedici += numarMediciAngajati;
        LOGGER.log(Level.INFO, "Medici angajati: " + numarMediciAngajati);
    }

    public void angajeazaAsistent(int numarAsistentiAngajati) {
        numarAsistenti += numarAsistentiAngajati;
        LOGGER.log(Level.INFO, "Asistenti angajati: " + numarAsistentiAngajati);
    }

    public void calculTotalAngajati() {
        LOGGER.log(Level.INFO, "Total angajati: \nMedici ~ " + numarMedici + ", Asistenti ~ " + numarAsistenti);
    }

    public static void main(String[ ] args) {
        Spital spital = new Spital();

        spital.angajeazaMedic(1);
        spital.angajeazaAsistent(4);
        try {
            Thread.sleep(6000); // Delay for 6000 milliseconds (6 seconds)
        } catch (InterruptedException e) {
            LOGGER.log(Level.SEVERE, "Thread interrupted", e);
            Thread.currentThread().interrupt();
        }
        spital.angajeazaMedic(3);
        spital.angajeazaAsistent(2);
        try {
            Thread.sleep(6000); // Delay for 6000 milliseconds (6 seconds)
        } catch (InterruptedException e) {
            LOGGER.log(Level.SEVERE, "Thread interrupted", e);
            Thread.currentThread().interrupt();
        }
        spital.calculTotalAngajati(); // Calculeaza toti angajatii
    }

}
