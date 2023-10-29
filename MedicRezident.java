package SpitalRoz;

public class MedicRezident extends Medic  {
    private int anSpecializare;
    private String numeSpecializare;



    // Constructor 1
    public MedicRezident(String nume, String prenume, String ID, int varsta, String sectie, int anSpecializare) {
        super(nume, prenume, ID, varsta, sectie);
        this.anSpecializare = anSpecializare;
        
    }

    // Constructor 2
    public MedicRezident(String nume, String prenume, String ID, String numeSpecializare) {
        super(nume, prenume, ID);
        this.numeSpecializare = numeSpecializare;
        
    }

    // Constructor 3 ~ noua inst., copiere val. din ex.
    //public MedicRezident(MedicRezident exemplu) {
    //    this.anSpecializare = exemplu.anSpecializare;
    //    this.numeSpecializare = exemplu.numeSpecializare;

    
    // Metoda toString() 
   // @Override
    public String toString() {
    return "Medic{" +
           "nume: " + super.getNume() +
           // ", prenume: " + getPreunume() +
           // ", ID: " + getID() +
           // ", varsta: " + getVarsta() +
           // ", sectie: " + getSectie() +
            ", anSpecializare=" + anSpecializare + 
            ", numeSpecializare=" + numeSpecializare +
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



    // Other methods, getters, and setters
    //@Override
    public void actMedical() {
        System.out.println("Act medical realizat.");
    }





    public static void main(String[ ] args) {
        //Medic h = new Medic();

        
        System.out.println("HI");
        

    }

}