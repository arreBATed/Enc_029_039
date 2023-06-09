
package extra_ej18_sumar_elementos_vector;

import java.util.Scanner;

public class Extra_Ej18_Sumar_Elementos_Vector {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("------- Sumar elementos de vector ---------- ");
        System.out.print("Ingrese el tamaño del vector: ");
        int dimension = leer.nextInt();
        System.out.println(); 
        
        int[] vector = new int[dimension];
        
        CargarArreglo(vector,dimension);
        MostrarArreglo(vector,dimension); 
        System.out.println("La suma de los "+dimension+" elementos del vector es "+sumaElementosVector(vector,dimension));
        
    }

    public static void CargarArreglo(int[] v, int d)   {
        
        Scanner leer = new Scanner(System.in); 
        for (int i = 0; i < d; i++)   {
            System.out.print("Ingrese el #"+(i+1)+" elemento: ");
            v[i] = leer.nextInt();
            System.out.println();
        }
    }
    
    public static void MostrarArreglo(int[] v, int d)  {
        
        System.out.print("|");
        for (int i = 0; i < d; i++) {
            System.out.print(v[i]+"|");
        }
        System.out.println(" ");
    }
     
    public static int sumaElementosVector(int[] v, int d)   {
        
        int total;
        
        total = 0;
        for (int i = 0; i < d; i++) {
            total = total + v[i];
        }
        return total;
    }
    
}
