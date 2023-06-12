
package extra_ej22_cargar_matriz_aleatoria;

import java.util.Scanner;

public class Extra_Ej22_Cargar_Matriz_Aleatoria {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas de la matriz: ");
        int filas = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        int columnas = leer.nextInt();
        System.out.println();
        
        int[][] matriz = new int[filas][columnas];
        
        CargarMatriz(matriz,filas,columnas);
        MostrarMatriz(matriz,filas,columnas);        
    }

    public static void CargarMatriz(int[][] m, int f, int c)   {
         
        for (int i = 0; i < f; i++)   {
            for (int j = 0; j < c; j++) {
                m[i][j] = (int) (Math.random() * 100);
            }            
        }
    }
    
     public static void MostrarMatriz(int[][] m, int f, int c)  {
        
        for (int i = 0; i < f; i++)   {
            System.out.print("|");
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j]+"|");
            }
             System.out.println();
        }
    }
    
}
