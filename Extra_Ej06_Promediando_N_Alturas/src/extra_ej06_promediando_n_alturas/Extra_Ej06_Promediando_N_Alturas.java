
package extra_ej06_promediando_n_alturas;

import java.util.Scanner;

public class Extra_Ej06_Promediando_N_Alturas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);  
        System.out.println("------- Promediando N Alturas ---------- ");
        System.out.print("Ingrese la cantidad de altura a promediar: ");
        int cantAlturas = leer.nextInt();
        System.out.println();
        System.out.println("El promedio de alturas es: "+promediandoAlturas(cantAlturas)); 

    }
    
    public static double promediandoAlturas(int c) {
     
        double promedio, aux; 
        
        promedio = 0;
        Scanner leer = new Scanner(System.in);    
        for (int i = 1; i <= c; i++)   {
                System.out.print("Ingrese la #"+i+" altura: ");
                aux = leer.nextDouble();
                promedio = promedio + aux;
                System.out.println();
        }
        promedio = promedio / c;
        return promedio; 
    }
    
}
