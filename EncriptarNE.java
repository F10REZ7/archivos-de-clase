package co.edu.tdea; 

import java.util.Scanner; 

public class EncriptarE { 
    public static void main(String[] args) { /
        Scanner sc = new Scanner(System.in); 
        int opcion; 

        do { 
            System.out.println("Seleccione una opcion:"); 
            System.out.println("1. Encriptar"); .
            System.out.println("2. Desencriptar"); 
            System.out.println("3. Salir"); 
            opcion = sc.nextInt(); 
            sc.nextLine(); // Limpia el buffer de entrada para evitar problemas al leer lineas despues.

            String texto; // Declara una variable para almacenar el texto a encriptar o desencriptar.
            String resultado; // Declara una variable para almacenar el resultado de la encriptacion o desencriptacion.

            switch (opcion) { 
                case 1: // encriptar.
                    System.out.print("Ingrese el texto a encriptar: "); 
                    texto = sc.nextLine(); 
                    resultado = ""; // Inicializa la variable resultado como una cadena vacia.
                    for (int i = 0; i < texto.length(); i++) { // Recorre cada caracter del texto.
                        String letra = texto.substring(i, i + 1); // Extrae un caracter del texto.
                        if (letra.matches("[a-zA-Z]")) { // Comprueba si el caracter es una letra.
                            int numero = letra.toLowerCase().codePointAt(1) - 'a' ; // Convierte la letra a minuscula y obtiene su numero.
                            resultado += numero + " "; // Añade el numero al resultado.
                        } else {
                            resultado += letra + " "; // Añade el caracter original para caracteres no alfabeticos.
                        }
                    }
                    System.out.println("Texto encriptado: " + resultado.trim()); // Muestra el texto encriptado sin espacios adicionales.
                    break; // Termina este caso.

                case 2: // desencriptar.
                    System.out.print("Ingrese el texto a desencriptar: "); // Solicita al usuario que ingrese el texto.
                    texto = sc.nextLine(); // Lee la linea de texto ingresada.
                    resultado = ""; // Inicializa la variable resultado como una cadena vacia.
                    String[] numeros = texto.split(" "); // Divide el texto en partes usando el espacio como separador.
                    for (String numStr : numeros) { // Recorre cada parte del texto dividido.
                        if (numStr.matches("\\d+")) { // Verifica si la parte es un numero.
                            int numero = Integer.parseInt(numStr); // Convierte la cadena a un numero entero.
                            String letra = String.valueOf((char) ('a' + (numero - 1))); // Convierte el numero de vuelta a letra.
                            resultado += letra; // Añade la letra al resultado.
                        } else {
                            resultado += numStr + " "; // Añade la parte original para caracteres no numericos.
                        }
                    }
                    System.out.println("Texto desencriptado: " + resultado.trim()); // Muestra el texto desencriptado sin espacios adicionales.
                    break; 

                case 3: 
                    System.out.println("Saliendo del programa."); 
                    break; // Termina este caso.

                default: 
                    System.out.println("Opcion invalida. Por favor, intente de nuevo."); 
            }
        } while (opcion != 3); // Continua el bucle mientras la opcion no sea 3.

        sc.close(); 
    }
}
