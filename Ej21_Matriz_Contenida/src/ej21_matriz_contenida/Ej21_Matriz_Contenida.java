
package ej21_matriz_contenida;

import java.util.Scanner;

public class Ej21_Matriz_Contenida {

    public static void main(String[] args) {
        
        int dimensionGrande= 10;
        int [][] matrizGrande = new int[dimensionGrande][dimensionGrande];
        int dimensionChica= 3;
        int [][] matrizChica = new int[dimensionChica][dimensionChica];
        
        CargarMatrizGrande(matrizGrande,dimensionGrande);
        MostrarMatriz(matrizGrande,dimensionGrande);
        System.out.println("Cargue los valore de la matriz...");
        CargarMatrizChica(matrizChica,dimensionChica);
        HallarMatrizContenida(matrizGrande,dimensionGrande,matrizChica,dimensionChica);       
    }
    
     public static void CargarMatrizGrande(int[][] m, int d)   {
         
        for (int i = 0; i < d; i++)   {
            for (int j = 0; j < d; j++) {
                m[i][j] = (int) (Math.random() * 10);
            }
        }
    }   
    
    public static void CargarMatrizChica(int[][] m, int d)   {
        
        int valor;
        boolean incorrecto;
        
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < d; i++)   {
            for (int j = 0; j < d; j++) {
                    System.out.print("Ingrese el valor (del 1 al 9) #"+(j+1)+" de la fila #"+(i+1)+": ");
                    valor = leer.nextInt();
                    if ((valor >= 0) && (valor <= 9))   {
                        m[i][j] = valor; 
                    }
                    else    {
                        incorrecto = true; 
                        do  {
                            System.out.println("El valor ingresado es inocorrecto.");
                            System.out.print("Ingrese nuevamente un valor (del 1 al 9): ");
                            valor = leer.nextInt();
                            if ((valor >= 0) && (valor <= 9))   {
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
    
    public static boolean matricesIguales(int[][] m1, int[][] m2, int d)    {
    
        boolean iguales;
        int i, j; 
        
            iguales = true;
            i = 0;
            while (iguales && (i < d)) {
                j = 0;
                while (iguales && (j < d))  {
                    if (m1[i][j] == m2[i][j])   {
                        j = j + 1;
                    }
                    else    {
                        iguales = false;
                    }
                }
                i = i + 1;
            }        
        return iguales;    
    }
    
    public static void HallarMatrizContenida(int[][] mG, int dG, int[][] mC, int dC)   {
    
        int auxX, auxY, posX, posY, i, j = 0;  
        int[][] matrizAux = new int[dC][dC]; 
        
        int topeMatrizMayor = dG - dC;
        boolean presente = false; 
        i = 0;
        while (!(presente) && (i <= topeMatrizMayor))    {
            j = 0;
            posX = i;
            while (!(presente) && (j <= topeMatrizMayor))    {
                    auxX = 0;
                    while (auxX < dC)    {
                        auxY = 0;
                        posY = j;
                        while (auxY < dC)    {
                            matrizAux[auxX][auxY] = mG[posX][posY];
                            auxY = auxY + 1;
                            posY = posY + 1;
                        }
                        auxX = auxX + 1;
                        posX = posX + 1;
                    }
                    if (matricesIguales(mC,matrizAux,dC))  {
                            presente = true;
                    }
                    else    {
                            j = j + 1;
                    }
            }
            if (!(presente))    {
                    i = i + 1;
            }  
        }
        if (presente)   {
                System.out.println("La matriz que ingreso esta contenida en la matriz mayor!!");
                System.out.println("La ubicacion es (fila/columna): "+i+"/"+j+"; "+i+"/"+(j+1)+"; "+i+"/"+(j+2)+"; "+(i+1)+"/"+j+"; "+(i+1)+"/"+(j+1)+"; "+(i+1)+"/"+(j+2)+"; "+(i+2)+"/"+j+"; "+(i+2)+"/"+(j+1)+"; "+(i+2)+"/"+(j+2));
        }
        else   {
                System.out.println("La matriz que ingreso no esta contenida en la matriz mayor :( :(");
        }
    }
    
}
    