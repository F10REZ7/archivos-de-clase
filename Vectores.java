package co.edu.tdea;
import java.util.Random;
public class Vectores {
    public static void main(String[] args) {
        //Crear vector de datos enteros de tamaño de 5 posiciones
        int [] numEnteros=new int[5];

        System.out.println(numEnteros.length);//muestra el numero del tamaño del vector

       //Asignar valores a las posiciones
       numEnteros[1]=0;//Asigno el valor 0 al vector en la posicion 1
       numEnteros[0]=1;
       numEnteros[2]=3;
       numEnteros[3]=4;
       numEnteros[4]=5;

       System.out.println(numEnteros[4]);//imprimir una posicion del vector

        //impriir todo el vector
        // se requiere recorrer tdoas las posiciones del vector

        for (int i = 0; i < numEnteros.length; i++) {
            System.out.println(numEnteros[i]);
        }

        Random random=new Random();
        for (int i = 0; i < numEnteros.length; i++) {
            int num=random.nextInt(100)+1;
            numEnteros[i]=num;
            System.out.println(numEnteros[i]);
        }
    }
}
