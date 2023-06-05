
package ej13_dibujar_cuadrado;

import java.util.Scanner;

public class Ej13_Dibujar_Cuadrado {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos: ");
        int elementos = leer.nextInt();
        for (int i = 1; i <= elementos; i++)    {
            if ((i == 1) || (i == elementos))   {
                for (int j = 1; j <= elementos; j++)    {
                    System.out.print(" * ");
                }
            }
            else    {
                System.out.print(" * ");
                for (int j = 2; j < elementos; j++)    {
                    System.out.print("   ");
                }
                System.out.print(" * ");   
            }
            System.out.println(" ");
        }    
    }
}
