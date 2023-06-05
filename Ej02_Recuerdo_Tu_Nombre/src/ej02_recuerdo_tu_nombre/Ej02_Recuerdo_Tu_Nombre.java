package ej02_recuerdo_tu_nombre;

import java.util.Scanner;

public class Ej02_Recuerdo_Tu_Nombre {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Aun recuerdo tu nombre.... te llamas " + nombre);
        
    }
    
}
