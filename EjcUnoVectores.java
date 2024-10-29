package co.edu.tdea;
import java.util.Scanner;
public class EjcUnoVectores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes=sc.nextInt();

        int [] vector=new int[numEstudiantes];
        for (int i = 0; i < numEstudiantes; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("Ingrese la nota de la asignatura " +j );
                vector[vector.length]=sc.nextInt();
            } 
            System.out.println(vector[i]);
        } 

    }
}
