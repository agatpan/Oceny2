
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class CzytaniePliku {

    TreeSet<Uczen> odczytajPlik() throws IOException {

        ClassLoader classLoader = this.getClass().getClassLoader();
        String filePath = classLoader.getResource("plik.txt").getFile();
        File plik = new File(filePath); //lub zamiast filePath ("resources/plik.txt");

        plik.getAbsolutePath();

        boolean czyPlikIstnieje = plik.exists();
        System.out.println(czyPlikIstnieje);

        List<String> linie = Files.readAllLines(plik.toPath());

        List<Uczen> uczniowie = new ArrayList<>();
        Map<Integer, Uczen> uczniowieJakoMapa = new HashMap<>();
        int numer = 1;

        for (String l : linie) {
            // System.out.println(l);

            String[] liniaPodzielona = l.split(",");
            String imie = liniaPodzielona[0];
            String nazwisko = liniaPodzielona[1];
            String o = liniaPodzielona[2];


            Uczen uczen = new Uczen();
            uczen.setNumerUcznia(numer);
            uczen.setImie(liniaPodzielona[0]);
            uczen.setNazwisko(liniaPodzielona[1]);

            String stringOceny = liniaPodzielona[2].trim();

            String[] oceny = stringOceny.split(",");
            for (String ocena : oceny) {
                int ocenaJakoInt = Integer.parseInt(ocena);
                uczen.getOceny().add(ocenaJakoInt);
            }

            /*uczen.getOceny()[0] = Integer.parseInt(liniaPodzielona[2].trim());  to dotyczy tabeli
            uczen.getOceny()[1] = Integer.parseInt(liniaPodzielona[3].trim());
            uczen.getOceny()[2] = Integer.parseInt(liniaPodzielona[4].trim());*/

            uczniowie.add(uczen);
            uczniowieJakoMapa.put(numer, uczen);
            numer++;
        }

        Uczen uczenZListy = uczniowie.get(0);

        Uczen uczenZMapy = uczniowieJakoMapa.get(1);

        TreeSet<Uczen> uczenWgImienia = new TreeSet<>(uczniowie);

        






        System.out.println(uczenZListy);
        System.out.println(uczenZMapy);


        System.out.println("nieposortowani : " + uczniowie);
        System.out.println("posortowani : " + uczenWgImienia);

    }
}
