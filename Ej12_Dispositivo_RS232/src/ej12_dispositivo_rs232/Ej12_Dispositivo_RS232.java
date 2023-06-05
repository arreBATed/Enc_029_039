
package ej12_dispositivo_rs232;

import java.util.Scanner;

public class Ej12_Dispositivo_RS232 {

    public static void main(String[] args) {
        
        String cadena;
        
        Scanner leer = new Scanner(System.in);
        boolean finalizarFlag = false; 
        int correctas = 0;
        int incorrectas = 0;
        do {
            System.out.println("Ingrese una cadena RS232 para determinar (5 elementos, &&&&& para finalizar): ");
            cadena = leer.nextLine();
            if (cadena.length() == 5)   {
                cadena = cadena.toUpperCase();
                if (cadenaFinalizarRS232(cadena))    {
                        finalizarFlag = true;
                }
                else    if (esRS232(cadena))    {
                            correctas = correctas + 1;
                        }
                        else {
                            incorrectas = incorrectas + 1;
                        }
            }
            else    {
                System.out.println("La cadena no cumple con las condiciones de tamaño.");
            }            
        }   while (!(finalizarFlag));
        System.out.println("Se finalizo la carga de las cadenas RS232. Fueron "+ correctas + " cadenas correctas y "+ incorrectas +" cadenas incorrectas.");
    }
    
    public static boolean cadenaFinalizarRS232(String c) {
        
        boolean resultado;
        
        String condicion = "&&&&&";
        resultado = (c.equals(condicion));
        return resultado;                
    }
    
    public static boolean esRS232(String c) {
        
        boolean resultado;
        
        String simboloIncio = "X";
        String simboloFinal = "O";
        int topeCadena = c.length() - 1;
        resultado = (simboloIncio.equals(c.substring(0,0))) && (simboloFinal.equals(c.substring(topeCadena,topeCadena)));
        return resultado;                
    }
    
}


