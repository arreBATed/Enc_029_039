
package ej09_comienza_con_a;

import java.util.Scanner;

public class Ej09_Comienza_con_A {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra cualquiera: ");
        String palabra = leer.nextLine();
        if ((palabra.startsWith("a")) || (palabra.startsWith("A")))   {
                System.out.println("La palabra comienza con la condicion!!!");
        }
       else {
                System.out.println("La palabra NO comienza con la condicion!!!");
        } 
    }
}
