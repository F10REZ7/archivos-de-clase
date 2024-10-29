
import java.util.Scanner;

public class EjcNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de a: ");
        double a=sc.nextDouble();
        System.out.println("Ingresa el valor de b: ");
        double b=sc.nextDouble();
        System.out.println("Ingresa el valor de c: ");
        double c=sc.nextDouble();
        if(a>0) {
            double potencia=Math.pow(b,2);
            double raiz=Math.sqrt(potencia -4*a*c);
            System.out.println("x1: " + -b+raiz/2*a);
            System.out.println("x1: " + -b*-raiz/2*a);
            
        }else {
        	 System.out.println("ERROR. el numero ingresadeo para a es invalido ponga uno diferente a 0");
        }
        sc.close();
    }
}
