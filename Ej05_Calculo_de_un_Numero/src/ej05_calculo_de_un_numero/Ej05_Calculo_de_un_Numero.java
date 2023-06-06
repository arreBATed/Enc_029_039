
package ej05_calculo_de_un_numero;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ej05_Calculo_de_un_Numero {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera: ");
        double numero = leer.nextFloat();
        double doble = numero * 2;
        double triple = numero * 3;
        double raiz2 = sqrt(numero);
        System.out.println("El doble del numero " + numero + " es " + doble + ", el triple es " + triple + " y la raiz cuadrada es " + raiz2);
         
    }
    
}
