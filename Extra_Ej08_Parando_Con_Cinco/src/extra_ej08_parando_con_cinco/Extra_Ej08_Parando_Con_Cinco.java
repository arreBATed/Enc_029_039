
package extra_ej08_parando_con_cinco;

import java.util.Scanner;

public class Extra_Ej08_Parando_Con_Cinco {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);  
        System.out.println("------- Cantidad de NO 5 ---------- ");
        DetenerEnMultiploDeCinco();
    }
    
    public static void DetenerEnMultiploDeCinco() {
        
        int aux, cont; 
        
        Scanner leer = new Scanner(System.in);
        cont = 0;
        do  {
                System.out.print("Ingrese un numero cualquiera: ");
                aux = leer.nextInt();
                System.out.println();
                if ((aux % 5) != 0)   {
                    cont = cont + 1;
                }
        } while ((aux % 5) != 0);
        System.out.print("Ingreso "+cont+" numero antes de ingresar el numero "+aux+", multiplo de 5.");
    }
    
}
