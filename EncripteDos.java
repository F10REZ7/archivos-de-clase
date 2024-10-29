package co.edu.tdea;

import java.util.Scanner;

public class EncripteDos {

 
    public static String encriptar(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            String letra = texto.substring(i, i + 1);
            if (letra.matches("[a-zA-Z]")) {
                // Encriptar
                if (letra.equals("z")) {
                    resultado.append("a");
                } else if (letra.equals("Z")) {
                    resultado.append("A");
                } else {
                    resultado.append((char) (letra.charAt(0) + 1));
                }
            } else {
                resultado.append(letra); 
            }
        }
        return resultado.toString();
    }

    // metodo para desencriptar el texto
    public static String desencriptar(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            String letra = texto.substring(i, i + 1);
            if (letra.matches("[a-zA-Z]")) {
                // Desencriptar
                if (letra.equals("a")) {
                    resultado.append("z");
                } else if (letra.equals("A")) {
                    resultado.append("Z");
                } else {
                    resultado.append((char) (letra.charAt(0) - 1));
                }
            } else {
                resultado.append(letra); 
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Encriptar");
            System.out.println("2. Desencriptar");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el texto a encriptar: ");
                    String textoAencriptar = scanner.nextLine();
                    String textoEncriptado = encriptar(textoAencriptar);
                    System.out.println("Texto encriptado: " + textoEncriptado);
                    break;
                case 2:
                    System.out.print("Ingrese el texto a desencriptar: ");
                    String textoAdesencriptar = scanner.nextLine();
                    String textoDesencriptado = desencriptar(textoAdesencriptar);
                    System.out.println("Texto desencriptado: " + textoDesencriptado);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
