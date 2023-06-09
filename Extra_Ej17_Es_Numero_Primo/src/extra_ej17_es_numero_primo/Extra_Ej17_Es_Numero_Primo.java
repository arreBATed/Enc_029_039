
package extra_ej17_es_numero_primo;

import java.util.Scanner;

public class Extra_Ej17_Es_Numero_Primo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("------- Verificar Numero Primo ---------- ");
        System.out.print("Ingrese un numero entero cualquiera: ");
        int numero = leer.nextInt();
        System.out.println(); 
        if (esNumeroPrimo(numero))  {
                 System.out.println("Es un numero PRIMO !!!!");
        }
        else    {
                System.out.println("NO es un numero PRIMO !!!!");
        }        
    }
    
    public static boolean esNumeroPrimo(int n)  {
        
        boolean primocidad;
        
        int numAux = (n - 1);
        primocidad = true;
        while ((numAux > 1) && (primocidad)) {
            if ((n % numAux) == 0)  {
                primocidad = false;
            }
            else   {
                numAux = numAux - 1;
            }
        }
        return primocidad;
    }
    
    
}
