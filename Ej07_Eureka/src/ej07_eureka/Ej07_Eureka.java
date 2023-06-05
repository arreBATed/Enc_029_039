
package ej07_eureka;

import java.util.Scanner;

public class Ej07_Eureka {

    public static void main(String[] args) {
        
        String eureka = "eureka";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra cualquiera: ");
        String palabra = leer.nextLine();
        if  (palabra.equals(eureka)) {
             System.out.println("Es la palabra magica!!!");
        }
        else    {
            System.out.println("No es la palabra magica!!!");
        }       
    }
    
}
