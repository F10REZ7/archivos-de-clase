package co.edu.tdea;

import java.util.Scanner;

public class EjcDosEnMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numR;
        double numerosReales;
        int numPar = 0;
        int numImpar = 0;
        double sumaPar = 0;
        double sumaImpar = 0;

        do {
            System.out.println("Ingrese el número de números reales que desea ingresar (debe ser entre 1 y 100): ");
            numR = sc.nextInt();
        } while (numR <= 0 || numR > 100);

        // Crear una matriz para almacenar los números ingresados
        double[][] numeros = new double[1][numR];

        for (int i = 0; i < numR; i++) {
            System.out.println("Ingresa el número " + (i + 1) + ": ");
            numeros[0][i] = sc.nextDouble();
            if (numeros[0][i] % 2 == 0) {
                sumaPar += numeros[0][i];
                numPar++;
            } else {
                sumaImpar += numeros[0][i];
                numImpar++;
            }
        }

        // Calcular los promedios
        double PromPar = (numPar > 0) ? sumaPar / numPar : 0;
        double PromImpar = (numImpar > 0) ? sumaImpar / numImpar : 0;

        // Mostrar los resultados
        System.out.println("Promedio de números pares: " + PromPar);
        System.out.println("Promedio de números impares: " + PromImpar);
    }
}
