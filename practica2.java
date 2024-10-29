
import java.util.Scanner;
import java.util.Random;
public class practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random=new Random();
        int numeroAleatorio=random.nextInt(100)+1;
        System.out.println("Adivina el numero de 1 a 100");
        int numeroIntentos=0;
        
        while (true) {

            System.out.println("Ingrese un numero entero: ");
            int n = sc.nextInt();
            numeroIntentos++;
            if (n>numeroAleatorio) {
                System.out.println("el numero es menor ");
            }else if (n<numeroAleatorio) {
                System.out.println("El numeor es mayor");
            }else{
                System.out.println("Adivinaste el numero en " + numeroIntentos + " intentos.");
                break;  // Sale del bucle y finaliza la ejecución del programa
            }
        }
        sc.close();
    }
}
