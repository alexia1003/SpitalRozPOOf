package SpitalRoz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicSauAsistent  {
    private String nume;
    private String prenume;
    private String ID;
    private int varsta;
    private String sectie;
    private String sefSectie;



    // Constructor 1
    public MedicSauAsistent(String nume, String prenume, String ID, int varsta, String sectie) {
        this.nume = nume;
        this.prenume = prenume;
        this.ID = ID; 
        this.varsta = varsta;
        this.sectie = sectie;
    }

    // Constructor 2 ~ sef sectie
    public MedicSauAsistent(String nume, String prenume, String ID, int varsta, String sectie, String sefSectie) {
        this.nume = nume;
        this.prenume = prenume;
        this.ID = ID; 
        this.varsta = varsta;
        this.sectie = sectie;
        this.sefSectie = sefSectie;
    }
    


    // Metoda toString() 
   // @Override
    public String toString() {
    return "Medic sau Asistent {" +
            "nume: '" + nume + '\'' +
            ", prenume: " + prenume +
            ", ID: " + ID +
            ", varsta: " + varsta +
            ", sectie: " + sectie +
            ", sefSectie: " + sefSectie +
            '}';
    }

    // Accesare campuri private
    // Getter pt nume
    public String getNume() {
        return nume;
    }
    // Getter pt nume
    public String getPrenume() {
        return prenume;
    }
    // Getter pt ID
    public String getID() {
        return ID;
    }
    // Getter pt varsta
    public int getVarsta() {
        return varsta;
    }
    // Getter pt sectie
    public String getSectie() {
        return sectie;
    }
    // Getter pt sef sectie
    public String getSefSectie() {
        return sefSectie;
    }
    

    // Setare campuri private
    // Setter pt nume
    public void setNume(String nume) {
        this.nume = nume;
    }
    // Setter pt nume
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    // Setter pt ID
    public void setID(String ID) {
        this.ID = ID;
    }
    // Setter pt varsta
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    // Setter pt sectie
    public void setSectie(String sectie) {
        this.sectie = sectie;
    }
     // Setter pt sef sectie
    public void setSefSectie(String sefSectie) {
        this.sefSectie = sefSectie;
    }


}