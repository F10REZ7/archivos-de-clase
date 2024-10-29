import java.util.Scanner;

public class aaaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entero positivo
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        // Verificar que el número es positivo
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            // Calcular el factorial y construir la secuencia
            long factorial = 1;
            String secuencia = "";

            for (int i = 1; i <= numero; i++) {
                factorial *= i;
                if (i > 1) {
                    secuencia += " * ";
                }
                secuencia += i;
            }

            // Mostrar la secuencia y el resultado
            System.out.println("El factorial de " + numero + " es:");
            System.out.println(secuencia + " = " + factorial);
        }

        // Cerrar el scanner
        scanner.close();
    }
}


