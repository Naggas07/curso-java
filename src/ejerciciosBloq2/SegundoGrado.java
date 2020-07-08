package ejerciciosBloq2;

import java.util.Scanner;

public class SegundoGrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, res1, res2;

        System.out.print("Introduce a: ");
        a = entrada.nextInt();

        System.out.print("Introduce b: ");
        b = entrada.nextInt();

        System.out.print("Introduce c: ");
        c = entrada.nextInt();

        res1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        res2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println("El primer resultado es: " + res1);
        System.out.println("El segundo resultado es: " + res2);

        entrada.close();

    }
}