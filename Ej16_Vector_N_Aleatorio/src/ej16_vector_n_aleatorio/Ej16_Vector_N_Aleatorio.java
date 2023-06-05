
package ej16_vector_n_aleatorio;

import java.util.Scanner;

public class Ej16_Vector_N_Aleatorio {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del arreglo: ");
        int dimension = leer.nextInt();
        
        int[] arreglo = new int[dimension];
        
        CargarArreglo(arreglo,dimension);
        MostrarArreglo(arreglo,dimension);        
    }

    public static void CargarArreglo(int[] a, int d)   {
         
        for (int i = 0; i < d; i++)   {
            a[i] = (int) (Math.random() * 100);
        }
    }
    
     public static void MostrarArreglo(int[] a, int d)  {
        
        System.out.print("|");
        for (int i = 0; i < d; i++) {
            System.out.print(a[i]+"|");
        }
        System.out.println(" ");
    }   
    
}
