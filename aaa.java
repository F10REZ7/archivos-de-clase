package co.edu.tdea;
import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        palabra = palabra.toLowerCase();
        

        System.out.println("Palabra original: " + palabra);
        
        // Verificar si cada carácter es una vocal o no
        System.out.print("Caracteres de la palabra: ");
        for (char c : palabra.toCharArray()) {
            if (esVocal(c)) {
                System.out.print(c + " (vocal), ");
            } else {
                System.out.print(c + " (no vocal), ");
            }
        }
        System.out.println(); // Salto de línea
        
        // Imprimir la palabra en inverso
        String palabraInversa = new StringBuilder(palabra).reverse().toString();
        System.out.println("Palabra invertida: " + palabraInversa);
       
    }
    
    // Método para verificar si un carácter es una vocal
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
