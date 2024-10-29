import java.util.Scanner;
public class practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena="Messi";
        String contrasenaIngresada;
        do {
            System.out.println("Ingresa la contrasena: ");
            contrasenaIngresada=sc.nextLine();
            if (!contrasenaIngresada.equals(contrasena)) {
                System.out.println("Contrasena incorrecta, intente de nuevo");
            }


        } while (!contrasenaIngresada.equals(contrasena)); 
        System.out.println("Contrasena correcta");
        sc.close();
    }
    
}
