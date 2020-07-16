package ejerciciosBloq3;

import javax.swing.JOptionPane;

public class mesesOk {
    public static void main(String[] args) {
        int dia, mes, anio;
        String message;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes:"));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año:"));

        if (dia <= 0 || dia > 30) {
            message = "Dia incorrecto";
        } else if (mes <= 0 || mes > 12) {
            message = "Mes incorrecto";
        } else if (anio < 0) {
            message = "Año incorrecto";
        } else {
            message = "Fecha correcta";
        }

        JOptionPane.showMessageDialog(null, message);
    }

}