import javax.swing.*;

public class Zad2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Witaj Swiecie");
        String password = JOptionPane.showInputDialog(null,"Podaj Haslo");

        if ( password.equals("Akademia")   ){
            JOptionPane.showMessageDialog(null,"Podałeś poprawne hasło");
        }
        else{
            JOptionPane.showMessageDialog(null,"Podałeś niepoprawne hasło");
        }
        /*
            Program, który odczytuje hasło i sprawdza czy hasło to Akademia
            Jeśli hasło to Akademia to wypisuje komunikat gratulacje podałeś poprawne hasło
            a w przeciwnym wypadku podaje komunikat podałeś niepoprawne hasło
         */
    }
}
