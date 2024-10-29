import java.util.Scanner;
public class ejcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el numero de filas q desea ver:");
        int n=sc.nextInt();
        if (n>0){
            for (int i=1; i<=n; i++) {
                for (int j=0; j<i; j++) {
                    int num=(2*(i-j)-1);
                    System.out.print(num+"");
                }
                System.out.println();
            }
        } else {
            
            System.out.println("El numero de filas debe ser mayor a 0.");
        }
        sc.close();
    }
}
