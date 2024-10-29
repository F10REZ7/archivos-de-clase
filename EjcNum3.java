
import java.util.Scanner;

public class EjcNum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de su producto");
        double valor=sc.nextDouble();
        System.out.println("Ingrese su edad");
        double edad=sc.nextDouble();
        if(valor>20000) {
        	if(edad>=18 && edad<=30) {
        		System.out.println("El descuentop de su producto es de 20% y el total a pagar es " + valor*0.8 );
        	}        	if(edad>30) {
        		System.out.println("El descuentop de su producto es de 30% y el total a pagar es " + valor*0.7 );
        	}        	if(edad<18) {
        		System.out.println("El descuentop de su producto es de 25% y el total a pagar es " + valor*0.75 );
        	}
        }else {
        	System.out.println("no tiene descuento el total a pagar es: "+ valor);
        }
        sc.close();
    }
}
