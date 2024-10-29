import java.util.Scanner;
public class ejcs2 {
    public static void main(String[] args) {
        System.out.println("ingresa un numero entero positivo");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = n; i>=0; i--) {
                if(i==0){
                System.out.print(i+"." );
                } else {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.println("El número debe ser positivo");
            
        }
        sc.close();
    }
}
