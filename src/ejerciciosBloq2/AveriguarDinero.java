package ejerciciosBloq2;

import java.util.Scanner;

public class AveriguarDinero {

    public static void main(String[] args) {
        float user1, user2, user3, all;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuanto dinero tiene Guillermo?: ");
        user1 = entrada.nextFloat();
        user2 = user1 / 2;
        user3 = (user1 + user2) / 2;

        all = user1 + user2 + user3;

        System.out.println("Guillermo tiene " + user1 + ", Luis tiene " + ", Juan tiene " + user3
                + " y entre los 3 tienen " + all);

        entrada.close();
    }

}