package ejerciciosBloq2;

import java.util.Scanner;

public class CalcDiasHora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double hours, days, weeks, restHours;

        System.out.println("Introduce el número total de horas: ");
        weeks = 0;
        days = 0;

        hours = entrada.nextDouble();
        restHours = hours % 24;
        days = Math.floor(hours / 24) % 7;
        weeks = Math.floor(days / 7);

        System.out.println(weeks + " semanas, " + days + " días y " + restHours + " horas.");

        entrada.close();

    }
}