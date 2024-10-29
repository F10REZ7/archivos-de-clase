package co.edu.tdea; // Define el paquete al que pertenece la clase.

import java.util.Scanner; // Importa la clase Scanner para leer entrada del usuario.

public class EncriptarE { // Define una clase pública llamada EncripteTres.
    public static void main(String[] args) { // Método principal donde inicia la ejecución del programa.
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario.
        int opcion; // Declara una variable entera para almacenar la opción seleccionada.

        do { // Inicia un bucle que continuará hasta que se elija salir.
            System.out.println("Seleccione una opción:"); // Muestra un mensaje en consola.
            System.out.println("1. Encriptar"); // Opción para encriptar texto.
            System.out.println("2. Desencriptar"); // Opción para desencriptar texto.
            System.out.println("3. Salir"); // Opción para salir del programa.
            opcion = sc.nextInt(); // Lee la opción seleccionada por el usuario.
            sc.nextLine(); // Limpia el buffer de entrada para evitar problemas al leer líneas después.

            String texto; // Declara una variable para almacenar el texto a encriptar o desencriptar.
            String resultado; // Declara una variable para almacenar el resultado de la encriptación o desencriptación.

            switch (opcion) { // Inicia un bloque que ejecuta diferentes acciones según la opción seleccionada.
                case 1: // Si el usuario selecciona 1, encriptar.
                    System.out.print("Ingrese el texto a encriptar: "); // Solicita al usuario que ingrese el texto.
                    texto = sc.nextLine(); // Lee la línea de texto ingresada.
                    resultado = ""; // Inicializa la variable resultado como una cadena vacía.
                    for (int i = 0; i < texto.length(); i++) { // Recorre cada carácter del texto.
                        String letra = texto.substring(i, i + 1); // Extrae un carácter del texto.
                        if (letra.matches("[a-zA-Z]")) { // Comprueba si el carácter es una letra.
                            int numero = letra.toLowerCase().codePointAt(0) - 'a' + 1; // Convierte la letra a minúscula y obtiene su número.
                            resultado += numero + " "; // Añade el número al resultado.
                        } else {
                            resultado += letra + " "; // Añade el carácter original para caracteres no alfabéticos.
                        }
                    }
                    System.out.println("Texto encriptado: " + resultado.trim()); // Muestra el texto encriptado sin espacios adicionales.
                    break; // Termina este caso.

                case 2: // Si el usuario selecciona 2, desencriptar.
                    System.out.print("Ingrese el texto a desencriptar: "); // Solicita al usuario que ingrese el texto.
                    texto = sc.nextLine(); // Lee la línea de texto ingresada.
                    resultado = ""; // Inicializa la variable resultado como una cadena vacía.
                    String[] numeros = texto.split(" "); // Divide el texto en partes usando el espacio como separador.
                    for (String numStr : numeros) { // Recorre cada parte del texto dividido.
                        if (numStr.matches("\\d+")) { // Verifica si la parte es un número.
                            int numero = Integer.parseInt(numStr); // Convierte la cadena a un número entero.
                            String letra = String.valueOf((char) ('a' + (numero - 1))); // Convierte el número de vuelta a letra.
                            resultado += letra; // Añade la letra al resultado.
                        } else {
                            resultado += numStr + " "; // Añade la parte original para caracteres no numéricos.
                        }
                    }
                    System.out.println("Texto desencriptado: " + resultado.trim()); // Muestra el texto desencriptado sin espacios adicionales.
                    break; // Termina este caso.

                case 3: // Si el usuario selecciona 3, salir.
                    System.out.println("Saliendo del programa."); // Muestra un mensaje de salida.
                    break; // Termina este caso.

                default: // Si la opción no es 1, 2 o 3.
                    System.out.println("Opción inválida. Por favor, intente de nuevo."); // Muestra un mensaje de error.
            }
        } while (opcion != 3); // Continúa el bucle mientras la opción no sea 3.

        sc.close(); // Cierra el objeto Scanner para liberar recursos.
    }
}
