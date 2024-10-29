//cree un programa que encripte y desencripte el texto ingresado por el usuario, que tenga un menu en el que se elija encriptar, desencriptar y salir y que despues de terminar la opcion elegida vuelva a aparecer el menu
// encriptar se debe ingresa el texto ingresado con base para cada letra ingresada sea la siguiente en el abecedario, ejemplo si hay un a se pone b, si e sb se pone c y asi consecutivamente
//z seria a, y el desencripte seria al revez, de la letra que se coloque sera la anterir, si es b, se coloca a, si es c, se coloca b... y si es a se coloca z

package co.edu.tdea;
import java.util.Scanner;
public class Encriptar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nMenu;
        String PalabraEnc;
        String PalabraDes;
        String [] VB=new String[nMenu];
        String [] VE=new String[nMenu];
        do {
            System.out.println("1. Encriptar");
            System.out.println("2. Desencriptar");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opcion que desea elegir del menu (1, 2 o 3): ");
            nMenu=sc.nextInt();
            if (nMenu==1) {
                System.out.println("Ingrese el numero ");
            }
        } while (nMenu>3 || nMenu<1);
        String [] VB=new String[nMenu];
        String [] VE=new String[nMenu];

        
    }
}
