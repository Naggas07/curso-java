package ejerciciosBloq3;

import javax.swing.JOptionPane;

public class mensajeNotas {
    public static void main(String[] args) {
        int nota;
        String message;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota de 0 a 10"));

        if (nota < 0 || nota > 10) {
            message = "La nota no es correcta";
        } else if (nota < 5) {
            message = "Insuficiente";
        } else if (nota < 6) {
            message = "Suficiente";
        } else if (nota < 7) {
            message = "Bien";
        } else if (nota < 9) {
            message = "Notable";
        } else {
            message = "Sobresaliente";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}