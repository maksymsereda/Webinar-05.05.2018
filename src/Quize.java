import javax.swing.*;
import java.util.Random;

public class Quize {
    public static void main(String[] args) {
        /*
        Losujemy liczbę od 1 do 500
        Użytkownik wpisuje liczbę zgadywaną
        Jeśli liczba jest poprawana to pokazujemy komunikat gratuacje zgadłeś liczbę
        Jeśli liczba jest mniejsza to dajemy podpowiedź za mała liczba
        Jeśli liczba jest większa od wylosowanej to podajemy komunikat liczba za mała
        Użytkownik może próbować po raz kolejny wpisywać liczbę
        1) Jak wylosować liczbę.
        2) Jak odczytać liczbę użytkownika.
        3) Powtarzać opcje wpisowania liczb przez użytkownika.
        4) Pokazywać podpowiedzi użytkownikowi.

     */
        Random random = new Random();
        int secretNumber = random.nextInt(500) + 1;
        System.out.println(secretNumber);
        String secretString;
        int userNumber;
        // != różne
        do {
            secretString = JOptionPane.showInputDialog(null, "Zgadnij liczbę od 1 do 500");
            userNumber = Integer.parseInt(secretString);
            if (userNumber > secretNumber) {
                JOptionPane.showMessageDialog(null, "Podałeś liczbę za dużą");
            } else if (userNumber < secretNumber) {
                JOptionPane.showMessageDialog(null, "Podałeś liczbę za małą");
            }
        } while (userNumber != secretNumber);
        JOptionPane.showMessageDialog(null, "Gratulacje zgadłeś poprawną liczbę!");


    }
}
