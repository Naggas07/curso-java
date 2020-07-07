package ejerciciosBloq2;

import java.util.Scanner;

public class calificacionFInal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float participacion, ex1, ex2, exFinal, calificacion;

        System.out.println("Cual es la calificacion de paticipacion? ");
        participacion = entrada.nextFloat();
        System.out.println("Cual es la calificacion del primer examen? ");
        ex1 = entrada.nextFloat();
        System.out.println("Cual es la calificacion del segundo examen? ");
        ex2 = entrada.nextFloat();
        System.out.println("Cual es la calificacion del examen final? ");
        exFinal = entrada.nextFloat();

        participacion *= 0.10f;
        ex1 *= 0.25f;
        ex2 *= 0.25f;
        exFinal *= 0.4f;

        calificacion = participacion + ex1 + ex2 + exFinal;

        System.out.println((participacion) + " " + (ex1) + " " + (ex2) + " " + (exFinal));

        System.out.println("La calificacion final es: " + calificacion);
        entrada.close();

    }
}