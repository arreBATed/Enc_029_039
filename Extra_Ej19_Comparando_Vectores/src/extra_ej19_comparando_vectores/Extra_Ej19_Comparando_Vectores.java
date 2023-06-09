package extra_ej19_comparando_vectores;

import java.util.Scanner;

public class Extra_Ej19_Comparando_Vectores {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("------- Comparando Vectores ---------- ");
        System.out.print("Ingrese el tamaño para los vectores: ");
        int dimension = leer.nextInt();
        System.out.println(); 
        
        int[] vector1 = new int[dimension];
        int[] vector2 = new int[dimension];
        
        System.out.println("Vamos a cargar los elementos del primer vector... ");
        CargarArreglo(vector1,dimension);
        MostrarArreglo(vector1,dimension); 
        System.out.println("Vamos a cargar los elementos del segundo vector... ");
        CargarArreglo(vector2,dimension);
        MostrarArreglo(vector2,dimension); 
        if (sonVectoresIguales(vector1,vector2,dimension))  {
                 System.out.println("Los vectores son IGUALES!!");
        }
        else    {
            System.out.println("Los vectores NO son IGUALES!!");
        }       
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
    
    public static boolean sonVectoresIguales(int[] v1, int[] v2, int d) {
        
        boolean iguales; 
        
        iguales = true;
        int cont = 0;
        while ((iguales) && (cont < d)) {
            if (v1[cont] == v2[cont])   {
                cont = cont + 1;
            }
            else    {
                iguales = false;
            }
        }
        return iguales;
    }
}
