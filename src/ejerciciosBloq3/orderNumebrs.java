package ejerciciosBloq3;

import javax.swing.*;

public class orderNumebrs {
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));

        if (num1 > num2 && num2 > num3) {
            JOptionPane.showMessageDialog(null, num1 + " > " + num2 + " > " + num3);
        } else {
            if (num1 > num3 && num3 > num2) {
                JOptionPane.showMessageDialog(null, num1 + " > " + num3 + " > " + num2);
            } else {
                if (num2 > num1 && num1 > num3) {
                    JOptionPane.showMessageDialog(null, num2 + " > " + num1 + " > " + num3);
                } else {
                    if (num2 > num3 && num3 > num1) {
                        JOptionPane.showMessageDialog(null, num2 + " > " + num3 + " > " + num1);
                    } else {
                        if (num3 > num1 && num1 > num2) {
                            JOptionPane.showMessageDialog(null, num3 + " > " + num1 + " > " + num2);
                        } else {
                            JOptionPane.showMessageDialog(null, num3 + " > " + num2 + " > " + num1);
                        }
                    }
                }
            }
        }

    }
}