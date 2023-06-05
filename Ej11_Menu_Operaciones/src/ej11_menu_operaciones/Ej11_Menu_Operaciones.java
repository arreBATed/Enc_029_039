
package ej11_menu_operaciones;

import java.util.Scanner;

public class Ej11_Menu_Operaciones {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primero de los numeros para operar: ");
        int numeroA = leer.nextInt();
        while (numeroA < 0)  {
                System.out.println("El numero ingresado no es postivo, ingrese correctamente el primero de los numeros para operar: ");
                numeroA = leer.nextInt();  
        }
        System.out.println("Ingrese el segundo de los numeros para operar: ");
        int numeroB = leer.nextInt();
        while (numeroB < 0)  {
                System.out.println("El numero ingresado no es postivo, ingrese correctamente el primero de los numeros para operar: ");
                numeroB = leer.nextInt();  
        }
        menuOpciones(numeroA,numeroB);
    }
    
    public static void menuOpciones(int a, int b)    {
           
        int opcion;
        int resultado;
        String confirmacion;
        
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("MENU ");
            System.out.println("1. Sumar ");
            System.out.println("2. Restar ");
            System.out.println("3. Multiplicar ");
            System.out.println("4. Dividir ");
            System.out.println("5. Salir ");
            System.out.println("Elija opcion: "); 
            opcion = leer.nextInt();
            switch (opcion)   {
                case 1:
                        resultado = sumarNumeros(a,b);
                        System.out.println("La suma de " + a + " mas " + b + " es " + resultado);
                        break;
                case 2:
                        resultado = restarNumeros(a,b);
                        System.out.println("La resta de " + a + " menos " + b + " es " + resultado);
                        break;
                case 3:
                        resultado = multiplicarNumeros(a,b);
                        System.out.println("La multiplicacion de " + a + " por " + b + " es " + resultado);
                        break;
                case 4:
                        resultado = dividirNumeros(a,b);
                        System.out.println("La division de " + a + " por " + b + " es " + resultado);
                        break;
                case 5:
                        System.out.println("Estas seguro (s/n): ");
                        confirmacion = leer.nextLine();
                        if (confirmacion.equals("s")) {
                                System.out.println("Gracias por utilizar este programas. Nos vemos!");
                        } else  {
                            opcion = 0;
                        }
                        System.out.println("Gracias por utilizar este programas. Nos vemos!");
                        break;
                default:
                         System.out.println("La opcion ingresada no es corecta. Intentelo nuevamente...");
            }
        }   while (opcion != 5);
    }
    
    public static int sumarNumeros(int a, int b)  {
        
            int suma;
            
            suma = a + b;
            return suma;      
        
    }
    
    public static int restarNumeros(int a, int b)  {
        
            int resta;
            
            resta = a - b;
            return resta; 
    }
 
    public static int multiplicarNumeros(int a, int b)  {
        
            int multiplo;
            
            multiplo = a - b;
            return multiplo; 
    }
    
    public static int dividirNumeros(int a, int b)  {
        
            int division;
            
            division = a / b;
            return division;
    }
    
}
