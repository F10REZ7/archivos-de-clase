package co.edu.tdea;
import java.util.Scanner;
public class EjcDosVectores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numR;
        double numerosReales;
        int numPar=0;
        int imp=0;
        double PromPar=0;
        double PromImpar=0;
        double sumaPar=0;
        double sumaImpar=0;
        do {
            System.out.println("Ingrese el numero de numeros reales que desea ingresar debe ser entre 1 y 100: ");
            numR=sc.nextInt();
        } while (numR<=0 || numR>100);

        double [] par=new double[numR];
        double [] impar=new double[numR];
        for (int i = 1; i <= numR; i++) {
            System.out.println("Ingresa los numeros: ");
            numerosReales=sc.nextDouble();
            if (numerosReales%2==0) {
                par[numPar]=(double) numerosReales;
                numPar++;
            } else{
                impar[imp]=(double) numerosReales;
                imp++;
            }
        }
        for (int i = 0; i < numR; i++) {
            sumaPar+=par[i];
        }
        for (int i = 0; i < numR; i++) {
            sumaImpar+=impar[i];
        }
        PromPar=sumaPar/numPar;
        PromImpar=sumaImpar/imp;
        System.out.println(PromPar);
        System.out.println(PromImpar);
    }
}

