
package extra_ej24_sucecion_fibonacci;

import java.util.Scanner;

public class Extra_Ej24_Sucecion_Fibonacci {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("-------- Vector Fibonacci ------------ ");
        System.out.print("Ingrese la dimension del arreglo Fibonacci: ");
        int dimension = leer.nextInt();
        
        int[] vectorFibonacci = new int[dimension];
        
        CargarArregloFibonacci(vectorFibonacci,dimension);
        MostrarArreglo(vectorFibonacci,dimension);        
    }

    public static void CargarArregloFibonacci(int[] vF, int d)   {
         
        if (d > 2)  {
                vF[0] = 1;
                vF[1] = 1;
                for (int i = 2; i < d; i++)   {
                    vF[i] = vF[i-2]+vF[i-1];
                }
        }
        else {
            if (d == 1) {
                    vF[0] = 1;
            }
            else    {
                    vF[0] = 1;
                    vF[1] = 1;
            }
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
