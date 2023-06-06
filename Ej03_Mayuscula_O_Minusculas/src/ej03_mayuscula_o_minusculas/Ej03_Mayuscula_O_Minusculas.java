
package ej03_mayuscula_o_minusculas;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ej03_Mayuscula_O_Minusculas {

    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String nombre = leer.nextLine();
        String nombreMayusculas = toUpperCase(nombre);
        String nombreMinusculas = toLowerCase(nombre);
        System.out.println("La frase en mayusculas es: " + nombreMayusculas);
        System.out.println("La frase en minusculas es: " + nombreMinusculas);
        
    }
    
}
