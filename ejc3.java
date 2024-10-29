import java.util.Scanner;

public class ejc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese un número del 1 al 10 para ver las tablas de multiplicar:");
        int n = sc.nextInt();
        
        // Verifica si el número está dentro del rango válido
        if (n < 1 || n > 10) {
            System.out.println("El número ingresado es inválido, por favor ingrese uno válido entre 1 y 10.");
        } else {
            System.out.println("Tabla del " + n);
            for (int i = 0; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }
        sc.close();
    }
}
