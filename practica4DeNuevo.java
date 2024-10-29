import java.util.Scanner;
public class practica4DeNuevo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("el numero para su piramide:");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println();
            for (int j = i; j <=num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
        }
        sc.close();
    }
}