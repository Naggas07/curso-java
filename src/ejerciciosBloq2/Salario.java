package ejerciciosBloq2;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        float horas, precioHora, salarioSemanal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantas horas semanales has trabajado? ");
        horas = entrada.nextFloat();

        System.out.println("Cuanto cobras a la hora? ");
        precioHora = entrada.nextFloat();

        salarioSemanal = precioHora * horas;

        System.out.println("Tu salario semanal es de: " + salarioSemanal);

        entrada.close();
    }

}