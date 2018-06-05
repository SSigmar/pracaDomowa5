public class LicznikNaDwiePetle {

    public static void main(String[] args) {

        double koniec = 3;
        double licznik = 0;

        while(licznik < koniec) {

          licznik +=0.1;
            System.out.println(licznik);

        }

        do {

            licznik += 0.1;
            System.out.println(licznik);

        } while(licznik < koniec);


    }

}
