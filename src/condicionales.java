import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class condicionales {

    public static void main(String[] args) {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero:"));

        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es distinto de 5");
        }
    }

}