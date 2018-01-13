public class Main {

    public static void main(String[] args) {

        Uczen uczen = new Uczen();
        uczen.setImie("Ania");
        uczen.setNazwisko("Kowalska");

       // int[] ocenyJakoTablica = uczen.getOceny();

       /* for (int i = 0; i < 3; i++){
             uczen.getOceny()[i] = (int)Math.random()*5;}*/


    uczen.ustawOceny();


        System.out.println(uczen.getImie() +" "+ uczen.getNazwisko()+ " " + uczen.getOceny());


      /*  System.out.println(uczen.getOceny()[0]);
        System.out.println(uczen.getOceny()[1]);
        System.out.println(uczen.getOceny()[2]);*/

        System.out.println("Srednia = " + uczen.srednia());
        System.out.println("Najwyższa ocena = " + uczen.maxOcena());
        System.out.println("Najniższa ocena = " + uczen.minOcena());


    }
}
