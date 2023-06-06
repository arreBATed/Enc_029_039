
package ej20_cuadrado_magico;

import java.util.Scanner;


public class Ej20_Cuadrado_Magico {


    public static void main(String[] args) {
        
        int dimension = 3;
        int [][] cuadradoMagico = new int[dimension][dimension];
        
        System.out.println("Cargue los valore de la matriz...");
        CargarMatriz(cuadradoMagico,dimension);
        System.out.println("El cuadrado ingresado es...");
        MostrarMatriz(cuadradoMagico,dimension);
        if (esCuadradoMagico(cuadradoMagico,dimension)) {
                System.out.println("Es un cuadrado magicoooo!!!");
        }
        else    {
            System.out.println("No es un cuadrado magicoooo :( :( :( ");
        }    
    }
    
    public static void CargarMatriz(int[][] m, int d)   {
        
        int valor;
        boolean incorrecto;
        
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < d; i++)   {
            for (int j = 0; j < d; j++) {
                    System.out.print("Ingrese el valor (del 1 al 9) #"+(j+1)+" de la fila #"+(i+1)+": ");
                    valor = leer.nextInt();
                    if ((valor >= 1) && (valor <= 9))   {
                        m[i][j] = valor; 
                    }
                    else    {
                        incorrecto = true; 
                        do  {
                            System.out.println("El valor ingresado es inocorrecto.");
                            System.out.print("Ingrese nuevamente un valor (del 1 al 9): ");
                            valor = leer.nextInt();
                            if ((valor >= 1) && (valor <= 9))   {
                                m[i][j] = valor;
                                incorrecto = false;
                            }
                        } while (incorrecto);
                    }
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
    
    public static boolean esCuadradoMagico(int[][] m, int d)    {
        
        boolean magico;
        int sF, sC; 
        
        if (sumaDiagonalPrincipal(m,d)== sumaDiagonalInversa(m,d))    {
                int auxDiagonales = sumaDiagonalPrincipal(m,d);
                int cont = 1;
                magico = true;
                while ((cont < d) && magico)    {
                    sF = sumaFila(m,d,cont);
                    sC = sumaColumna(m,d,cont);
                    if ((sF == auxDiagonales) && (sC == auxDiagonales)) {
                            cont = cont + 1;
                    }
                    else    {
                        magico = false;
                    }
                }
        }
        else    {
            magico = false;
        }        
        return magico;
        
    }
    
    public static int sumaFila(int[][] m, int d, int f) {
        
        int sumaFila;
        
        sumaFila = 0;
        for (int i = 0; i < d; i++) {
            sumaFila = sumaFila + m[f][i];
        }
        return sumaFila;        
    }
    
    public static int sumaColumna(int[][] m, int d, int c) {
        
        int sumaColumna;
        
        sumaColumna = 0;
        for (int i = 0; i < d; i++) {
            sumaColumna = sumaColumna + m[i][c];
        }
        return sumaColumna;        
    }
    
    public static int sumaDiagonalPrincipal(int[][] m, int d)   {
        
        int sumaDiagonal;
        
        sumaDiagonal = 0;
        for (int i = 0; i < d; i++) {
            sumaDiagonal = sumaDiagonal + m[i][i];
        }
        return sumaDiagonal;
    }
    
    public static int sumaDiagonalInversa(int[][] m, int d)   {
        
        int sumaDiagonal;
        
        sumaDiagonal = 0;
        int cont = 0;
        for (int i = (d-1); i >= 0; i--) {
            sumaDiagonal = sumaDiagonal + m[cont][i];
            cont = cont + 1;
        }
        return sumaDiagonal;
    }
    
}
