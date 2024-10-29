import java.util.Scanner;
public class practica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numeroq ue quieres para tu piramide: ");
        int n=sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n ; j++) {
                System.out.print(" ");
            }
            for (int z=1; z<=i; z++) {
                System.out.print(i);
            }
            System.out.println();
        }   
        sc.close();
    }
}
