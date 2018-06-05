import java.util.Scanner;

public class JakaCwiartka {
    public static void main(String[] args) {


        Scanner wartoscX = new Scanner(System.in);
        System.out.println("Podaj wartosc X: ");
        int X = wartoscX.nextInt();


        Scanner wartoscY = new Scanner(System.in);
        System.out.println("Podaj wartosc Y: ");
        int Y = wartoscX.nextInt();

        if(X > 0 && Y > 0) {

            System.out.printf("Punkt(%d, %d)leży w I ćwiartce układu współrzędnych", X, Y);
        }

        if(X < 0 && Y > 0) {

            System.out.printf("Punkt(%d, %d)leży w II ćwiartce układu współrzędnych", X, Y);
        }

        if(X < 0 && Y < 0) {

            System.out.printf("Punkt(%d, %d)leży w III ćwiartce układu współrzędnych", X, Y);
        }

        if(X > 0 && Y < 0) {

            System.out.printf("Punkt(%d, %d)leży w IV ćwiartce układu współrzędnych", X, Y);
        }

        if(X == 0 && Y == 0) {

            System.out.printf("Punkt(%d, %d)leży w  środku układu współrzędnych", X, Y);
        }

    }

    }
