
package SpitalRoz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AsistentSef extends Asistent {
    public AsistentSef(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
    }

   // @Override
    public void actMedical() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Metoda neimplementata 'actMedical'");
    }

    public static void main(String[] args) {
        System.out.println("Salut");
    
        AsistentSef asistent = new AsistentSef("Popescu", "Maria", 25);
        asistent.incepeActivitatea();
        asistent.terminaActivitatea();
        asistent.controlMedical();
        asistent.oferaAjutor();
    }
    
}