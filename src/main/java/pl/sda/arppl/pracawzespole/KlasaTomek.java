package pl.sda.arppl.pracawzespole;

import java.util.Scanner;

public class KlasaTomek {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imie");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();
        System.out.println("Wpisz swoje nazwisko");
        String nazwisko = scanner.next();
        System.out.println("Wpisz swoj numer buta");
        int numerButa = scanner.nextInt();

        System.out.println("oj, " + imie + " " +nazwisko + " ale masz nogę! Twój rozmiar to " +numerButa +" !? ");

    }
}
