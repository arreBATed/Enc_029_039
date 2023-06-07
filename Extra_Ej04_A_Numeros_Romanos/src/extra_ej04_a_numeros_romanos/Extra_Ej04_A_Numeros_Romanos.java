
package extra_ej04_a_numeros_romanos;

import java.util.Scanner;

public class Extra_Ej04_A_Numeros_Romanos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("------- Pasar de Decimal a Romano ---------- ");
        System.out.print("Ingrese un numero del 1 al 10 para convertir: ");
        int decimal = leer.nextInt();
        System.out.println();
        if ((decimal >= 0) && (decimal <= 10)) {
                DeDecimalARomano(decimal);
        }
        else    {
            System.out.print("El numero no cumple las condiciones solicitados. Mucha gracias por utilizar este programa.");
        }
    }
    
    public static DeDecimalARomano(int d) {
        
        switch (d)  {
            case 1: 
                    System.out.println("El numero en romano es I");
                    break;
            case 2: 
                    System.out.println("El numero en romano es II");
                    break;
            case 3: 
                    System.out.println("El numero en romano es III");
                    break;
            case 4: 
                    System.out.println("El numero en romano es IV");
                    break;
            case 5: 
                    System.out.println("El numero en romano es V");
                    break;
            case 6: 
                    System.out.println("El numero en romano es VI");
                    break;
            case 7: 
                    System.out.println("El numero en romano es VII");
                    break;
            case 8: 
                    System.out.println("El numero en romano es VIII");
                    break;
            case 9: 
                    System.out.println("El numero en romano es IX");
                    break;
            default:
                    System.out.println("El numero en romano es X");
        }
    }
    
}
