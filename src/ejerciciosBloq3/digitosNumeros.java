package ejerciciosBloq3;

import javax.swing.JOptionPane;

public class digitosNumeros {
    public static void main(String[] args) {
        int numero, digitos;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero de 0 a 999:"));

        if (numero < 10) {
            digitos = 1;
        } else if (numero >= 100) {
            digitos = 3;
        } else {
            digitos = 2;
        }

        mensaje = numero + " tiene " + digitos + " digitos";

        JOptionPane.showMessageDialog(null, mensaje);
    }

}