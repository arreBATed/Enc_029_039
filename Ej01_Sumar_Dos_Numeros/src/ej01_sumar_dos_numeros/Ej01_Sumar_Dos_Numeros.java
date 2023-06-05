/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01_sumar_dos_numeros;

import java.util.Scanner;

public class Ej01_Sumar_Dos_Numeros {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = leer.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("La suma del numero " + numero1 + " y el numero " + numero2+ " es " + resultado); 
        
    }
    
}
