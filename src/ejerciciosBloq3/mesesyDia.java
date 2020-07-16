package ejerciciosBloq3;

import javax.swing.JOptionPane;

public class mesesyDia {
    public static void main(String[] args) {
        int dia, mes, anio;
        String message;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes:"));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año:"));

        if (mes <= 0 || mes > 12) {
            message = "mes incorrecto";
        } else {
            if (mes == 2 && (dia > 28 || dia <= 0)) {
                message = "dias del mes incorrectos";
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 0 && dia > 30)) {
                message = "dias del mes incorrectos";
            } else if (dia <= 0 && dia > 31) {
                message = "dias del mes incorrectos";
            } else {
                message = "fecha correcta";
            }
        }

        JOptionPane.showMessageDialog(null, message);
    }
}