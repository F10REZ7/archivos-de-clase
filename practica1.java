import java.util.Scanner;
public class practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero de inicio: ");
        int n = sc.nextInt();
        System.out.println("Ingresa en el que quiere terminar");
        int f = sc.nextInt();
        int suma = 0;
        for (int i = n; i <= f; i++) {
            if (i%2 == 0) {
                suma +=i;
                System.out.print(suma+ " ");
            }
        }
        sc.close();
    }
}
