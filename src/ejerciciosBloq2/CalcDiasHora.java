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
        hours -= restHours;
        System.out.println(hours);
        days = Math.floor(hours / 24) % 7;
        hours -= Math.floor(hours / 24);
        System.out.println(hours);
        weeks = Math.floor((hours / 24) / 7);

        System.out.println(weeks + " semanas, " + days + " días y " + restHours + " horas.");

        entrada.close();

    }
}