import java.util.Scanner;
public class ejcs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa el numeor del factorial que quieres ver");
        int n=sc.nextInt();
        int factorial=1;
        String secuencia="";
        if (n>0) {
            for(int i=1; i<=n; i++) {
                factorial*=i;
                secuencia+="*";
                secuencia+=i;
            }
            System.out.println(n + "!--->" +secuencia+" = "+factorial);
        }else{
            System.out.println("1");
        }
        sc.close();
    }
}
