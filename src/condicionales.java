import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class condicionales {

    public static void main(String[] args) {
        int numero, dato = 5;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero:"));

        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es distinto de 5");
        }

        mensaje = (numero == dato) ? "El numero es 5" : "El numero es distinto de 5";
        JOptionPane.showMessageDialog(null, mensaje);

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
            default:
                JOptionPane.showMessageDialog(null, "El numero no esta en el rango de 1 a 5");
        }
    }

}