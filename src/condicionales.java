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

        switch (numero) {
            case 5:
                JOptionPane.showMessageDialog(null, "El numero es 5");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El numero es 4");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El numero es 3");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El numero es 2");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "El numero es 1");
                break;
        }
    }

}