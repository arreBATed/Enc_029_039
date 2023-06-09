
package extra_ej20_cargando_aleatoriamente_vector;

import java.util.Scanner;

public class Extra_Ej20_Cargando_Aleatoriamente_Vector {

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
