package SpitalRoz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medic { //implements IActMedical  {
    private String nume;
    private String prenume;
    private String ID;
    private int varsta;
    private String sectie;
    private String sefSectie;
    //pt. met.
    private int totalOreLucrate;
    private int totalZileLucrate;
    private int totalPacienti;
    //constanta
    private final String NUME_SPITAL = "Spital Roz";
    //Buffer + list
    private StringBuffer tratament; 
    private ArrayList<String> medicamente;


    // Constructor 1
    public Medic(String nume, String prenume, String ID, int varsta, String sectie) {
        this.nume = nume;
        this.prenume = prenume;
        this.ID = ID; 
        this.varsta = varsta;
        this.sectie = sectie;
    }

    // Constructor 2 ~ sef sectie
    public Medic(String nume, String prenume, String ID, int varsta, String sectie, String sefSectie) {
        this.nume = nume;
        this.prenume = prenume;
        this.ID = ID; 
        this.varsta = varsta;
        this.sectie = sectie;
        this.sefSectie = sefSectie;
    }
    
    // Constructor 3 ~ pt. met.
    public Medic(String nume, String prenume, String ID, String sectie) {
        this.nume = nume;
        this.prenume = prenume;
        this.ID = ID;
        this.sectie = sectie;
        this.tratament = new StringBuffer();
        this.medicamente = new ArrayList<String>();
        this.totalOreLucrate = 0;
        this.totalZileLucrate = 0;
        this.totalPacienti = 0;
        }
    

 
    /* 
    // Constructor 4 ~ noua inst., copiere val. din ex.
    public Medic(Medic exemplu) {
        this.nume = exemplu.nume;
        this.prenume = exemplu.prenume;
        this.ID = exemplu.ID;
        this.varsta = exemplu.varsta;
        this.sectie = exemplu.sectie;
    }
    */

    // Metoda toString() 
   // @Override
    public String toString() {
    return "Medic{" +
            "nume: '" + nume + '\'' +
            ", prenume: " + prenume +
            ", ID: " + ID +
            ", varsta: " + varsta +
            ", sectie: " + sectie +
            ", tratament: " + tratament.toString() +
            ", medicamente: " + medicamente.toString() +
            '}';
    }

    // Accesare campuri private
    // Getter pt nume
    public String getNume() {
        return nume;
    }
    // Getter pt nume
    public String getPreume() {
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
    public void ID(String ID) {
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
/* 
    public void operatieRealizata() {
       System.out.println("Operatie realizata cu succes.");
       // Logger.log("."); //
    }
*/


    //   M E T O D E   \\

    //Calcul ore lucrate de fiecare medic
    public void addOreLucrate(int oreLucrate) {
        if (oreLucrate > 0) {
            totalOreLucrate += oreLucrate;
            System.out.println(oreLucrate + " ore adaugate. Total ore lucrate: " + totalOreLucrate);
        } else {
            System.out.println("Introducere invalida. Orele lucrate trebuie sa fie un numar pozitiv.");
        }
    }

    public int getTotalOreLucrate() {
        return totalOreLucrate;
    }

    //Calcul zile lucrate de fiecare medic
    public void addZileLucrate(int zileLucrate) {
        if (zileLucrate > 0) {
            totalZileLucrate += zileLucrate;
            System.out.println(zileLucrate + " zile adaugate. Total zile lucrate: " + totalZileLucrate);
        } else {
            System.out.println("Introducere invalida. Zilele lucrate trebuie sa fie un numar pozitiv.");
        }
    }

    public int getTotalZileLucrate() {
        return totalZileLucrate;
    }
    
    //Numar pacienti tratati de fiecare medic
    public void addPaccientiTratati(int pacienti) {
        if (pacienti > 0) {
            totalPacienti += pacienti;
            totalZileLucrate++;
        } else {
            System.out.println("Introducere invalida. Pacientii tratati trebuie sa fie un numar pozitiv.");
        }
    }

    public double calculMediePacientiTratati() {
        if (totalZileLucrate > 0) {
            return (double) totalPacienti / totalZileLucrate;
        } else {
            System.out.println("Eroare. Adauga pacienti!");
            return 0;
        }
    }


     
    public static void cautareMedicDupaNume(List<Medic> medici, String numeCautat) {
        for (Medic medic : medici) 
        { if (medic.nume.equals(numeCautat) || medic.prenume.equals(numeCautat)) 
            {
                System.out.println("Medicul a fost gasit:");
                System.out.println("Nume: " + medic.nume);
                System.out.println("Prenume: " + medic.prenume);
                System.out.println("ID: " + medic.ID);
                System.out.println("Varsta: " + medic.varsta);
                System.out.println("Sectie: " + medic.sectie);
                return;
            }
        }
        System.out.println("Medicul cu numele " + numeCautat + " nu a fost gasit.");
    }

    // Metoda de clasa pt info spital
    public static void displayInfoSpital() {
        System.out.println("str. Lalelelor nr. 6");
    }



    // Metoda de instanta pt adaugarea unui singur medicament
    public void addMedicament(String medicament) {
        this.medicamente.add(medicament);
    }

    // Metoda de instanta pt afisarea tuturor medicamentelor
    public void displayMedicament() {
        for (String med : this.medicamente) { //parcurge fiecare elem. lista
            System.out.println(med);         //atribuie val. la St. med
        }
    }




    public static void main(String[ ] args) {
        Medic medic1 = new Medic("Barbu", "Ana", "2367", "Cardiologie");
        medic1.addOreLucrate(8);
        medic1.addOreLucrate(14);
        medic1.addOreLucrate(7);
        System.out.println("Acest medic a lucrat: " + medic1.getTotalOreLucrate() + " ore. \n");
        
        medic1.addZileLucrate(5);
        medic1.addZileLucrate(3);
        medic1.addZileLucrate(2);
        System.out.println("Acest medic a lucrat: " + medic1.getTotalZileLucrate() + " zile. \n");

        medic1.addPaccientiTratati(18);
        medic1.addPaccientiTratati(15);
        medic1.addPaccientiTratati(12);
        medic1.addPaccientiTratati(26);
        System.out.println("Acest medic a tratat: " + medic1.totalPacienti + " pacienti. \n");
        System.out.println("Acest medic a tratat: " + medic1.calculMediePacientiTratati() + " pacienti pe zi. \n");




        List<Medic> medici = new ArrayList<>();
        medici.add(new Medic("John", "Doe", "1122", 35, "Cardiologie"));
        medici.add(new Medic("Jane", "Smith", "2345", 40, "Dermatologie"));
        medici.add(new Medic("Michael", "Johnson", "3671", 45, "Neurologie"));

        cautareMedicDupaNume(medici, "Jane" );
        cautareMedicDupaNume(medici, "Johnson" );


        Medic.displayInfoSpital();
        
        // Metode instanta pt. adaugare medicament
        medic1.addMedicament("Paracetamol");
        medic1.addMedicament("Nurofen");

        // Afisare medicament prescris
        System.out.println("Medicament dat de Medic 1:");
        medic1.displayMedicament();

        // Adaugare tratament medic
        medic1.tratament.append("Diagnostic: Febra. ")
        .append("Reteta: Paracetamol si Nurofen.");

        // Afisare tratament medic
        System.out.println("Tratamentul scris de medic 1:");
        System.out.println(medic1.tratament.toString());
    

}
}