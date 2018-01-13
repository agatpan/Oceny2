import java.util.ArrayList;
import java.util.List;

public class Uczen implements Comparable {


    private int numerUcznia;
    private String imie;
    private String nazwisko;
   // private double[] oceny = new double[3];
    private List<Integer> oceny = new ArrayList<>();

    public String getImie(){
        return imie;
    }

    public void setImie(String imie) {this.imie = imie; }

    public String getNazwisko(){
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {this.nazwisko = nazwisko; }

   /*public double[] getOceny (){                                   --to są getery i setery do tablicy
        return oceny;
    }

    public void setOceny(double[] oceny) {this.oceny = oceny; } */

    public void setNumerUcznia(int numerUcznia) {
        this.numerUcznia = numerUcznia;
    }

    void ustawOceny() {
        for (int i = 0; i < 3; i++){
             oceny.add((int)Math.random());
        }
    }

    public double srednia(){

        double suma = 0;

        for (int i = 0; i < oceny.size(); i++){
            suma += oceny.size();
        }
        return (suma / oceny.size());
    }

    public double maxOcena(){
        double max = 0;

        for (double ocena : oceny){
            if (ocena > max){
                max = ocena;
            }
        }
        return max;
    }

    public double minOcena(){
        double min = Integer.MAX_VALUE;

        for (double ocena : oceny){
            if (ocena < min){
                min = ocena;
            }
        }
        return min;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "numerUcznia=" + numerUcznia +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", oceny=" + oceny +
                '}';
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    @Override
    public int compareTo(Object o) {
        Uczen uczen = (Uczen) o;

        int wynikPorownania = imie.compareTo(uczen.getImie());
        return 0;
    }
}
