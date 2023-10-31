package SpitalRoz;

public class MedicRezident extends Medic  {
    private int anSpecializare;
    private String numeSpecializare;

    // Constructor 0 !!!
    public MedicRezident(String nume, String prenume, String ID, String sectie) {
        super(nume, prenume, ID, sectie);
    }

    // Constructor 1
    public MedicRezident(String nume, String prenume, String ID, int varsta, String sectie, int anSpecializare, String numeSpecializare) {
        super(nume, prenume, ID, varsta, sectie);
        this.anSpecializare = anSpecializare;
        this.numeSpecializare = numeSpecializare;
    }

    
    // Metoda toString() 
   // @Override
    public String toString() {
    return "MedicRezident{" +
            "nume: '" + getNume() + '\'' +
            ", prenume: " + getPrenume() +
            ", ID: " + getID() +
            ", varsta: " + getVarsta() +
            ", sectie: " + getSectie() +
            ", anSpecializare: " + anSpecializare +
            ", numeSpecializare: " + numeSpecializare +
            '}';
    }

    // Accesare campuri private
    // Getter pt an specializare
    public int getAnSpecializare() {
        return anSpecializare;
    }
    // Getter pt nume specializare
    public String getNumeSpecializare() {
        return numeSpecializare;
    }

    // Setare campuri private
    // Setter pt an specializare
    public void setAnSpecializare(int anSpecializare) {
        this.anSpecializare = anSpecializare;
    }
    // Setter pt nume specializare
    public void setNumeSpecializare(String numeSpecializare) {
        this.numeSpecializare = numeSpecializare;
    }



    // alte metode
    //@Override
    public void actMedical() {
        System.out.println("Act medical realizat.");
    }

    // actualizeaza anul de specializare
    public void actualizareAnSpecializare(int nouAnSpecializare) {
        this.anSpecializare = nouAnSpecializare;
    }
    
    // afisare detalii medic rezident
    public void displayDetalii() {
        System.out.println("Nume: " + getNume() + " " + getPrenume());
        System.out.println("Specializare: " + getNumeSpecializare());
        System.out.println("An de specializare: " + getAnSpecializare());
    }
    


    public static void main(String[ ] args) {
        MedicRezident rezident1 = new MedicRezident("Smith", "John", "1234", "Chirurgie");
        System.out.println(rezident1.toString());
    
        rezident1.setAnSpecializare(2022);
        rezident1.setNumeSpecializare("Neurochirurgie");
        System.out.println(rezident1.toString());

        rezident1.actMedical();
        rezident1.actualizareAnSpecializare(2023);
        rezident1.displayDetalii();

        MedicRezident rezident2 = new MedicRezident("Smith", "Jenny", "5678", 45, "Ortopedie", 2023, "Ortopedie");
        rezident2.displayDetalii();
        System.out.println(rezident2.toString());
    }

}