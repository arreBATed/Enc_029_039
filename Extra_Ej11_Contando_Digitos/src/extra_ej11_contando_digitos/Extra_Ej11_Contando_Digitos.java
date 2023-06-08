
package extra_ej11_contando_digitos;

import java.util.Scanner;

public class Extra_Ej11_Contando_Digitos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);  
        System.out.println("------- Contando los digitos de un numero ---------- ");
        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();
        System.out.println();
        System.out.println("El numero "+numero+" tiene "+cuantosDigitos(numero)+" digitos.");
    }
    
    public static int cuantosDigitos(int n) {
        
        int cantidadDigitos;
        
        cantidadDigitos = 1;
        while (n >= 10){
            n = n / 10;
            cantidadDigitos = cantidadDigitos + 1;
        }       
        return cantidadDigitos;       
    }
}
