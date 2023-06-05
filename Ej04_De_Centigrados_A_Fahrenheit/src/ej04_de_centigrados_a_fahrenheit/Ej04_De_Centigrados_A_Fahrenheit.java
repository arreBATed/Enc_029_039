
package ej04_de_centigrados_a_fahrenheit;

import java.util.Scanner;

public class Ej04_De_Centigrados_A_Fahrenheit {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados (C°) que desea convertir a Fahrenheito: ");
        float gradosC = leer.nextFloat();
        float gradosF = 32 + ((9 * gradosC)/5);
        System.out.println("Los grados centrigrados que ingreso es igual a " + gradosF + "°F");
    }
    
}
