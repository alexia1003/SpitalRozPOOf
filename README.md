# Aplicație SpitalRoz

Aplicația SpitalRoz este un program bazat pe Java conceput pentru gestionarea informațiilor și noțilelor medicale personale. Include mai multe clase care facilitează introducerea datelor, stocarea și interacțiunea utilizatorilor.

## Interfață IMainFrame

Interfața „IMainFrame” include o semnătură a metodei „login ( )`. Oferă un model pentru clase pentru a implementa metoda `logină ( )` în conformitate cu cerințele lor specifice.
Scop: Interfața IMAinFrame specifică comportamentul unui cadru principal, care conține o singură metodă, autentificare ( ), care este menită să gestioneze funcționalitatea de conectare.. 

## Main Class
Scop: Clasa MainClass conține metoda principală care inițiază aplicația.. Funcționalitate: utilizează metoda SwingUtilities.invokeLater ( ) pentru a crea o instanță a clasei MainFrame, asigurându-se că componentele Swing sunt create și modificate în mod sigur și adecvat dintr-un singur fir de expediere a evenimentelor.. 

## MedicSauAsistent Class
Scop: Clasa MedicSauAsistent reprezintă un membru al personalului medical și conține diverse proprietăți și metode pentru gestionarea informațiilor personalului medical.. 
Funcționalitate: include constructori pentru crearea de obiecte, getters și setatori de personal medical pentru accesarea și modificarea proprietăților membrilor, precum și metode suplimentare de gestionare a operațiunilor legate de personalul medical..

## MainFrame Class
Scop: Clasa MainFrame reprezintă interfața grafică principală pentru aplicație.. 
Funcționalitate: include componente pentru introducerea utilizatorului, cum ar fi un meniu derulant, câmpuri de text, o casetă de selectare și butoane. De asemenea, inițializează și folosește clasa MedicSauAsistent pentru a gestiona datele personalului medical.. 

## Window0 Class
Clasa `Window0` servește ca o clasă abstractă, extinzând `JFrame` și afișează un mesaj.
// oferind o structură pentru gestionarea unei liste de șiruri.
// Include metode pentru scrierea datelor într-un fișier și gestionarea listei de matrice.
Scop: clasa Window0 este o clasă abstractă care servește ca bază pentru alte clase de ferestre.. 
Funcționalitate: conține o metodă abstractă de scriereDataToFile ( ) și include o metodă toString ( ) pentru afișarea datelor în fereastră..

## Window1 Class

Clasa „Window1” extinde `JFrame` și oferă o interfață pentru introducerea informațiilor medicale personale. Colectează date precum numele, prenumele, ID-ul și departamentul și transmite aceste date unei instanțe din clasa „Window2”. Include funcționalitate pentru gestionarea erorilor dacă orice câmp este lăsat gol.
Scop: Clasa Window1 gestionează o fereastră specifică pentru afișarea și preluarea informațiilor medicale personale.. 
Funcționalitate: include componente precum câmpuri de text și butoane pentru colectarea informațiilor despre membrii personalului medical. De asemenea, se ocupă de validarea datelor de intrare.. 

## Window2 Class

Clasa `Window2` extinde clasa abstractă `Window0` și oferă o interfață pentru introducerea și stocarea notelor legate de pacient. Permite utilizatorului să adauge note despre pacienți și informații importante. Datele introduse sunt salvate într-un fișier și un mesaj de confirmare este afișat la trimiterea cu succes a datelor.
Scop: clasa Window2 gestionează o fereastră pentru a lua note legate de informațiile despre pacienți.. 
Funcționalitate: permite utilizatorilor să introducă și să salveze note despre pacienți. De asemenea, include metode pentru scrierea datelor într-un fișier și afișarea unui dialog de confirmare.. 

## Window3 Class

Clasa `Window3` extinde clasa `JDialog` și servește ca fereastră de dialog de confirmare. Afișează un mesaj și oferă un buton pentru utilizator pentru a-și confirma acțiunea. La apăsarea butonului, aplicația înregistrează ora curentă când a fost apăsat butonul.
Scop: Clasa Window3 gestionează o fereastră de dialog de confirmare cu un buton „Da” și înregistrează evenimentul de apăsare a butonului pe consolă.. Funcționalitate: creează un dialog de confirmare cu un mesaj specific și înregistrează ora la apăsarea butonului.. 

## WindowS Class 
Scop: clasa WindowS gestionează o fereastră care afișează date dintr-un fișier text.. 
Funcționalitate: citește datele dintr-un fișier și le afișează într-o zonă de text din fereastră. De asemenea, se asigură că este creată o singură instanță a ferestrei ( Modelul de design al scheletului ).


