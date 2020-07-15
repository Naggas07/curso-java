package ejerciciosBloq3;

import javax.swing.*;

public class NumsPares {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, num1 + " y " + num2 + " son números pares");
        } else {
            if (num1 % 2 != 0 && num2 % 2 != 0) {
                JOptionPane.showMessageDialog(null, num1 + " y " + num2 + " son números impares");
            } else {
                if (num1 % 2 == 0) {
                    JOptionPane.showMessageDialog(null, num1 + "  es par y " + num2 + " es impar");
                } else {
                    JOptionPane.showMessageDialog(null, num2 + "  es par y " + num1 + " es impar");
                }
            }
        }
    }
}