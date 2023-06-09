
package extra_ej13_escalera_numerica;

import java.util.Scanner;

public class Extra_Ej13_Escalera_Numerica {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);  
        System.out.println("------- Escalera Numerica ---------- ");
        System.out.print("Ingrese la cantidad de niveles: ");
        int niveles = leer.nextInt();
        System.out.println();
        EscaleraNumerica(niveles);
    
    }
    
    public static void EscaleraNumerica(int n)  {
        
        for (int i = 1; i <= n; i++)    {
            for (int j = 1; j<= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
