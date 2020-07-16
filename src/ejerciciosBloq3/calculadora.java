package ejerciciosBloq3;

import javax.swing.JOptionPane;

public class calculadora {
    public static void main(String[] args) {
        int num1, num2;
        float resultado = 0;
        char tipo;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("intorduce el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("intorduce el primer numero: "));
        tipo = Character
                .toUpperCase(JOptionPane.showInputDialog("Introduce la primera letra de la operacion").charAt(0));

        switch (tipo) {
            case 'S':
                resultado = num1 + num2;
                break;
            case 'R':
                resultado = num1 - num2;
                break;
            case 'M':
                resultado = num1 * num2;
                break;
            case 'D':
                resultado = num1 / num2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operacion incorrecta");
        }

        JOptionPane.showMessageDialog(null, "la operación de " + tipo + " es de " + resultado);

    }
}