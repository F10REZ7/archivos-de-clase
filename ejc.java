
import java.util.Scanner;
public class ejc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base:");
        float base=sc.nextFloat();
        System.out.println("Ingrese el exponente: ");
        float ex=sc.nextFloat();
        double resultado=Math.pow(base,ex);
        if (ex>0){
            System.out.println(resultado);
        }
        if (ex==0){
            System.out.println("1");
        }
        if (ex<0){
            double resultadoNegativo=Math.pow(base,-ex);
            System.out.println(1/resultadoNegativo); 
        }
        sc.close();
    }
}
