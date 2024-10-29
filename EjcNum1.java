
import java.util.Scanner;

public class EjcNum1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para ver el dia de la semana ");
        int num = sc.nextInt();
        if (num>7) {
            System.out.println("El numero es mayor al esperado, por favor use los numeros validos");
        }
        if(num>0){
        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
        
            case 2:
                System.out.println("Martes");
                break;
                
            case 3:
                System.out.println("Miercoles");
                break;
            
            case 4:
                System.out.println("Jueves");
                break;
            
            case 5:
                System.out.println("Viernes");
                break;
            
            case 6:
                System.out.println("Sabado");
                break;
            
            case 7:
                System.out.println("Domingo");
                break;
        }

        } else {
            System.out.println("ERROR. El numero ingresado no es valido.");
        }
        sc.close();
    }
}
