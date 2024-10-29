package co.edu.tdea;

import java.util.Scanner;

public class EncripteTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Encriptar");
            System.out.println("2. Desencriptar");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            sc.nextLine(); 

            String texto;
            String resultado;

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el texto a encriptar: ");
                    texto = sc.nextLine();
                    resultado = "";
                    for (int i = 0; i < texto.length(); i++) {
                        String letra = texto.substring(i, i + 1);
                        if (letra.matches("[a-zA-Z]")) {
                            int numero = letra.toLowerCase().codePointAt(0) - 'a' + 1;
                            resultado += numero + " ";
                        } else {
                            resultado += letra + " "; // Espacio para caracteres no alfabéticos
                        }
                    }
                    System.out.println("Texto encriptado: " + resultado.trim());
                    break;

                case 2:
                    System.out.print("Ingrese el texto a desencriptar: ");
                    texto = sc.nextLine();
                    resultado = "";
                    String[] numeros = texto.split(" ");
                    for (String numStr : numeros) {
                        if (numStr.matches("\\d+")) {
                            int numero = Integer.parseInt(numStr);
                            String letra = String.valueOf((char) ('a' + (numero - 1)));
                            resultado += letra;
                        } else {
                            resultado += numStr + " "; // Espacio para caracteres no numéricos
                        }
                    }
                    System.out.println("Texto desencriptado: " + resultado.trim());
                    break;

                case 3:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 3);

        sc.close();
    }
}

