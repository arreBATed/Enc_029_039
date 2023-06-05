
package ej19_matriz_antisimetrica;

import java.util.Scanner;

public class Ej19_Matriz_Antisimetrica {

    public static void main(String[] args) {
      
        int dimension = 3;
        int [][] matriz = new int[dimension][dimension];
        int [][] matrizAsimetrica = new int[dimension][dimension];
        
        System.out.println("Cargue la primera de las matrices....");
        CargarMatriz(matriz,dimension);
        System.out.println("Ahora cargue la segunda matriz para comprobar si es asimetrica...");
        CargarMatriz(matrizAsimetrica,dimension);
        if (esMatrizAsimetrica(matriz,matrizAsimetrica,dimension))  {
             System.out.println("Es una matriz asimetricaaaa!!!");
        }
        else    {
            System.out.println("No es una matriz asimetricaaaa :( :(");
        }
    }
    
    public static void CargarMatriz(int[][] m, int d)   {
        
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < d; i++)   {
            for (int j = 0; j < d; j++) {
                System.out.print("Ingrese el valor #"+(j+1)+" de la fila #"+(i+1)+": ");
                m[i][j] = leer.nextInt();
                System.out.println(" ");
            }
        }
    }
    
    public static void MostrarMatriz(int[][] m, int d)   {
         
        for (int i = 0; i < d; i++)   {
            for (int j = 0; j < d; j++) {
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    
    public static boolean esMatrizAsimetrica(int[][] m, int[][] mT, int d)  {
    
        boolean asimetrica; 
        int[][] matrizAux = new int[d][d];
        
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                matrizAux[j][i] = (m[i][j]) * (-1);
            }
        }
        int fila = 0;
        int columna = 0;
        asimetrica = true;
        while ((asimetrica) && (fila < d))    {
            while ((asimetrica) && (columna < d))   {
                if ((matrizAux[fila][columna]) == (mT[fila][columna]))  {
                     columna = columna +1;
                }
                else    {
                    asimetrica = false;
                }
            }
            fila = fila + 1;          
        }        
        return asimetrica;
    }
}
