
package ej10_limite_positivo;

import java.util.Scanner;

public class Ej10_Limite_Positivo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int suma = 0;  
        System.out.println("Ingrese un numero cualquiera como tope de las sumas: ");
        int numeroTope = leer.nextInt();
        System.out.println("Ingrese un numero cualquiera para sumar: ");
        int numero = leer.nextInt();
        suma = suma + numero;
        while (suma <= numeroTope)    {
            System.out.println("Ingrese otro numero cualquiera para sumar: ");
            numero = leer.nextInt();
            suma = suma + numero;
        }
        System.out.println("La suma " + suma + " supero el limite de " + numeroTope );
    }
    
}
