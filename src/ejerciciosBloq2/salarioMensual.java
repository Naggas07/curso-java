package ejerciciosBloq2;

import java.util.Scanner;

public class salarioMensual {

    public static void main(String[] args) {
        final int salario = 1000, comision = 150;
        int coches;
        float precioCoche, total;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos coches ha vendido?: ");
        coches = entrada.nextInt();

        System.out.println("Precio de los coches?: ");
        precioCoche = entrada.nextFloat();

        total = salario + (coches * comision) + (precioCoche * 0.05f);

        System.out.println("El salario total es: " + total);

        entrada.close();
    }
}