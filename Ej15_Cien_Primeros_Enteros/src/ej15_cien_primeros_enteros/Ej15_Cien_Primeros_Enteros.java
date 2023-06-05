
package ej15_cien_primeros_enteros;

public class Ej15_Cien_Primeros_Enteros {

    public static void main(String[] args) {
        
        int[] vector = new int [10];
        
        CargarArreglo(vector);
        MostrarArreglo(vector);
        MostrarArregloOrdenInverso(vector);   
            
    }
    
    public static void CargarArreglo(int[] a)   {
         
        for (int i = 0; i < 10; i++)   {
            a[i] = (int) (Math.random() * 100);
        }
    }
    
    public static void MostrarArregloOrdenInverso(int[] a)  {
        
        System.out.print("|");
        for (int i = 9; i >= 0; i--) {
            System.out.print(a[i]+"|");
        }
        System.out.println(" ");
    }

    public static void MostrarArreglo(int[] a)  {
        
        System.out.print("|");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]+"|");
        }
        System.out.println(" ");
    }
}
