package ejerciciosBloq2;

import java.util.Scanner;

public class SumCuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, b, resultado;

        System.out.println("Introduce dos numeros: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();

        resultado = Math.pow(a, 2) + Math.pow(b, 2) + 2 * (a + b);

        System.out.println("El resultado es: " + resultado);

        entrada.close();

    }
}