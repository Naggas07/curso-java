import java.util.Scanner;

import javax.swing.JOptionPane;

public class arrays {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        int[] numeros2 = { 1, 2, 3, 4 };

        System.out.println(numeros[2]);
        System.out.println(numeros2[3]);

        int nElements;
        Scanner entrada = new Scanner(System.in);

        nElements = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de elementos"));

        char[] letras = new char[nElements];

        System.out.println("Digita elementos del array:");
        for (int i = 0; i < nElements; i++) {
            System.out.println(i + "caracter: ");
            letras[i] = entrada.next().charAt(0);
        }

        System.out.println("Los caracteres son:");
        for (int i = 0; i < nElements; i++) {
            System.out.println(i + " - " + letras[i]);
        }

        entrada.close();

    }
}