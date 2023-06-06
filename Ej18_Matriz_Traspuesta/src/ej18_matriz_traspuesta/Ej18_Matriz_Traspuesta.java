
package ej18_matriz_traspuesta;

public class Ej18_Matriz_Traspuesta {


    public static void main(String[] args) {
        
        int dimension = 4;
        
        int [][] matriz = new int[dimension][dimension];
        
        CargarMatriz(matriz,dimension);
        MatrizTraspuesta(matriz,dimension);
    }
    
    public static void CargarMatriz(int[][] m, int d)   {
         
        for (int i = 0; i < d; i++)   {
            for (int j = 0; j < d; j++) {
                m[i][j] = (int) (Math.random() * 10);
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
    
    public static void MatrizTraspuesta(int[][] m, int d)  {
    
        int[][] matrizAux = new int[d][d];
        
        System.out.println("La matriz A es...");
        MostrarMatriz(m,d);
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                matrizAux[j][i] = m[i][j];
            }
        }
        System.out.println("La matriz B (TRASPUESTA) es...");
        MostrarMatriz(matrizAux,d);
    }
}
