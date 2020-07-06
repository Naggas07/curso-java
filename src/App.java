import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!, How are you?"); // coment de una linea
        /*
         * coment de varias lienas
         * 
         */

        // variables

        byte entero = 127;
        short entero2 = 32767;
        int entero3 = 2000000000;
        float decimal = 3.45f;

        char caracter = 'a';

        boolean decision = false;

        // dato de tipo no primitivos

        Integer numeroInt = 33;

        String cadena = "Esto es una cadena de text";

        // Constantes

        final Integer numeroConst = 20;

        // entrada de y salida de datos

        Scanner entrada = new Scanner(System.in);
        int numeroEntrada;

        System.out.println("Itroduce un número: ");
        numeroEntrada = entrada.nextInt();

        System.out.println("variable a imprimir = " + numeroEntrada);

        float entradaFloat;
        System.out.println("Itroduce un número float: ");
        entradaFloat = entrada.nextFloat();

        System.out.println("variable a imprimir = " + entradaFloat);

        double entradaDouble;
        System.out.println("Itroduce un número double: ");
        entradaDouble = entrada.nextFloat();

        System.out.println("variable a imprimir = " + entradaDouble);

        String entradaCadena;
        // System.out.println("Itroduce la cadena: ");
        // entradaCadena = entrada.next(); // next solo guarda la cadena hasta el
        // espacio

        // System.out.println("variable a imprimir = " + entradaCadena);

        System.out.println("Itroduce la cadena2: ");
        entradaCadena = entrada.nextLine();// guarda toda la linea

        System.out.println("variable a imprimir = " + entradaCadena);

        char letra;

        System.out.println("introduce un caracter: ");
        letra = entrada.next().charAt(0);

        System.out.println("variable a imprimir = " + letra);

    }
}
