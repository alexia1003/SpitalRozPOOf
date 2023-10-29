
package SpitalRoz;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract class Asistent {
    private String nume;
    private String prenume;
    private int varsta;
    private static final Logger LOGGER = Logger.getLogger(Asistent.class.getName());

    public Asistent(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        LOGGER.log(Level.INFO, "Asistent: Nume - " + nume + ", Prenume - " + prenume + ", Varsta - " + varsta);
    }

    // Metode get
    public String getNume() {
        LOGGER.log(Level.INFO, "getNume()   " + this.nume);
        return nume;
    }
    public String getPrenume() {
        LOGGER.log(Level.INFO, "getPrenume()   " + this.nume);
        return prenume;
    }
    public int getVarsta() {
        LOGGER.log(Level.INFO, "getVarsta()  " + this.nume);
        return varsta;
    }
  
    // Metode abstracte
    public abstract void actMedical(); 

    // Metode
    public void incepeActivitatea() {
        LOGGER.log(Level.INFO, "Asistentul a inceput activitatea.");
    }

    public void terminaActivitatea() {
        LOGGER.log(Level.INFO, "Asistentul a terminat activitatea.");
    }

    public void controlMedical() {
        LOGGER.log(Level.INFO, "Asistentul efectueaza consultatii medicale.");
    }

    public void oferaAjutor() {
        LOGGER.log(Level.INFO, "Asistentul ofera suport pacientilor.");
    }

    public static void main(String[ ] args) {
      //  
    }
}