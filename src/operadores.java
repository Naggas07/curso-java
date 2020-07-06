import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1, num2, suma, resta, mult, div, resto;

        System.out.println("Introduce 2 numeros: ");

        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        resto = num1 % num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + mult);
        System.out.println("La división es: " + div);
        System.out.println("El resto es: " + resto);

        entrada.close();

        // operadores de asignacion

        int numero = 10;

        numero += 5;

        System.out.println("datos: " + numero);

        // Math

        double raiz = Math.sqrt(9);

        System.out.println("la raiz cuadrada es: " + raiz);

        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);

        System.out.println("resultado -> " + resultado);

        double numero2 = 4.56;
        long resultado2 = Math.round(numero2);
        double random = Math.random();

        System.out.println(resultado2);
        System.out.println(random);
    }
}