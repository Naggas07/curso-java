package ejerciciosBloq3;

import javax.swing.*;

public class multipl10 {
    public static void main(String[] args) {
        int numero;
        String message;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero:"));

        message = (numero % 10 == 0) ? "Es multiplo de 10" : "no es multiplo de 10";

        JOptionPane.showMessageDialog(null, numero + " " + message);
    }
}