package ejerciciosBloq3;

import javax.swing.*;

public class numerosIgualesMayor {
    public static void main(String[] args) {
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero:"));

        if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "los numeros" + numero1 + " y " + numero2 + " son iguales");
        } else {
            if (numero1 > numero2) {
                JOptionPane.showMessageDialog(null, numero1 + " es mayor que " + numero2);
            } else {
                JOptionPane.showMessageDialog(null, numero2 + " es mayor que " + numero1);
            }
        }

    }
}