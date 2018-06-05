import java.util.Scanner;

public class WyswietlanieImion {

    public static void main(String[] args) {

        String[] Imiona = new String[5];

        for (int i = 0; i < Imiona.length; i++) {


            Scanner imie = new Scanner(System.in);
            System.out.println("Podaj imię: ");
            Imiona[i] = imie.next();

        }


    }

}
