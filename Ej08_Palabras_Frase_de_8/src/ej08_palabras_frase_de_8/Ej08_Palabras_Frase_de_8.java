
package ej08_palabras_frase_de_8;

import java.util.Scanner;

public class Ej08_Palabras_Frase_de_8 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase cualquiera: ");
        String palabra = leer.nextLine();
        if (palabra.length() == 8)   {
                System.out.println("La frase o palabra cumple con la condicion!!!");
        }
        else    {
                System.out.println("La frase o palabra NO cumple con la condicion!!!");
        }
    }  
}
