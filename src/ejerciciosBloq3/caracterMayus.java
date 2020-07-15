package ejerciciosBloq3;

import javax.swing.*;

public class caracterMayus {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Digita una letra:").charAt(0);

        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra es mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "La letra es minuscula");
        }
    }
}