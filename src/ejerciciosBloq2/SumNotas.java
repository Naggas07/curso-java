package ejerciciosBloq2;

import java.util.Scanner;

public class SumNotas {
    public static void main(String[] args) {
        float cal1, cal2, cal3, sum;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce 3 calificaciones :");

        cal1 = entrada.nextFloat();
        cal2 = entrada.nextFloat();
        cal3 = entrada.nextFloat();

        sum = cal1 + cal2 + cal3;

        System.out.println("La suma de las calificaciones es: " + sum);

        entrada.close();
    }
}