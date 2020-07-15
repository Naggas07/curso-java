package ejerciciosBloq3;

import javax.swing.*;

public class sueldoTrabajo {
    public static void main(String[] args) {
        int horas, sueldo;

        horas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas has trabajado?"));

        if (horas > 40) {
            sueldo = (40 * 16) + ((horas - 40) * 20);
        } else {
            sueldo = horas * 16;
        }

        JOptionPane.showMessageDialog(null, "El sueldo correspondiente es: " + sueldo);

    }
}