package co.edu.tdea;
import java.util.Scanner;
public class Palabra {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Introduce la word");
       String palabra=sc.nextLine();

       palabra=palabra.toLowerCase();
        System.out.println("Su palabra es: "+ palabra);

        

        
    }
}
