
package ej17_cuantos_digitos_arreglo;

import java.util.Scanner;

public class Ej17_Cuantos_Digitos_Arreglo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del arreglo: ");
        int dimension = leer.nextInt();
        
        int[] arreglo = new int[dimension];
        
        CargarArreglo(arreglo,dimension);
        MostrarArreglo(arreglo,dimension); 
        CuantosDigitosEnElmentosArreglo(arreglo,dimension);
    }

    public static void CargarArreglo(int[] a, int d)   {
        
        int valor;
        boolean incorrecto;
        
        Scanner leer = new Scanner(System.in);      
        for (int i = 0; i < d; i++)   {
            incorrecto = true;
            do  { 
                System.out.println("Ingrese el #"+ (i + 1) +" elemento, valor de hasta 5 digitos: ");
                valor = leer.nextInt();
                if (valor < 1000000) {
                    a[i]  = valor;
                    incorrecto = false;
                }
                else {
                    System.out.println("El valor ingresado es incorrecto!!");
                }
            } while (incorrecto);
        }
    }
    
     public static void MostrarArreglo(int[] a, int d)  {
        
        System.out.print("|");
        for (int i = 0; i < d; i++) {
            System.out.print(a[i]+"|");
        }
        System.out.println(" ");
    }   
    
    public static int cuantosDigitos(int n) {
        
        int cuantos;
        
        cuantos = 1;
        while ((n/10) > 0) {
            cuantos= cuantos + 1;
            n = n / 10;                   
        }       
        return cuantos;
    }
    
    public static void CuantosDigitosEnElmentosArreglo(int[] a, int d)  {
        
        int cantidad;
        
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        for (int i = 0; i < d; i++) {
            cantidad = cuantosDigitos(a[i]);
            switch (cantidad)   {
                case 1:
                        d1 = d1 + 1;
                        break;
                case 2: 
                        d2 = d2 + 1;
                        break;
                case 3:
                        d3 = d3 + 1;
                        break;
                case 4:
                        d4 = d4 + 1;
                        break;
                default: 
                        d5 = d5 + 1;                         
            }
        System.out.println("El arreglo de " + d + " elementos posee...");
        System.out.println(d1 + " elementos con un digito");
        System.out.println(d2 + " elementos con dos digitos");
        System.out.println(d3 + " elementos con tres digitos");
        System.out.println(d4 + " elementos con cuatro digitos");
        System.out.println(d5 + " elementos con cinco digitos");
        }
    }
}
