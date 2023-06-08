
package extra_ej09_division_por_restas_sucesivas;

import java.util.Scanner;

public class Extra_Ej09_Division_Por_Restas_Sucesivas {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);  
        System.out.println("------- Division por Restas Sucesivas ---------- ");
        System.out.print("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese el divisor: ");
        int divisor = leer.nextInt();
        System.out.println();
        DivisionRestasSucesivas(dividendo,divisor); 
    }
    
    public static void DivisionRestasSucesivas(int a, int b)    {
        
        int resto = a;
        int resultado = 0;
        while (resto >= b)  {
            resultado = resultado + 1;
            resto = resto - b;
        }
        System.out.println("La division de "+a+" por "+b+" es "+resultado+" y resto "+resto);
    }
    
}
