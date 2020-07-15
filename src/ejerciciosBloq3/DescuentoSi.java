package ejerciciosBloq3;

import javax.swing.*;

public class DescuentoSi {
    public static void main(String[] args) {
        float entrada, resultado;

        entrada = Float.parseFloat(JOptionPane.showInputDialog("introduce el importe:"));

        resultado = (entrada > 300) ? (entrada * 8 / 10) : entrada;

        JOptionPane.showMessageDialog(null, "el importe original era " + entrada + " y el cliente paga " + resultado);
    }
}