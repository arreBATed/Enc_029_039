
package extra_ej15_elija_operacion;

import java.util.Scanner;

public class Extra_Ej15_Elija_Operacion {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);  
        System.out.println("------- Elijiendo la operacion aritmetica ---------- ");
        System.out.print("Ingrese el primer numero: ");
        double numeroA = leer.nextDouble();
        System.out.println();
        System.out.print("Ingrese el segundo numero: ");
        double numeroB = leer.nextDouble();
        System.out.println();
        System.out.println("Ingrese la operacion a realizar con estos numeros: ");
        System.out.println("1.- Suma. ");
        System.out.println("2.- Resta. ");
        System.out.println("3.- Multiplicacion. ");
        System.out.println("4.- Division. ");
        System.out.print("Elija el numero de opcion (1~4): ");
        int opcion = leer.nextInt();
        System.out.println();
        switch (opcion) {
            case 1:
                    System.out.println("La suma de los dos numero es "+sumarNumeros(numeroA,numeroB));
                    break;
            case 2:
                    System.out.println("La resta de los dos numero es "+restarNumeros(numeroA,numeroB));
                    break;
            case 3: 
                    System.out.println("La multiplicacion entre los dos numero es "+multiplicarNumeros(numeroA,numeroB));
                    break;
            case 4:
                    System.out.println("La division entre los dos numero es "+divisionNumeros(numeroA,numeroB));
                    break;
            default:
                    System.out.println("Esa opcion no existe.. una lastima. Gracias por utilizar este programa");                    
        }       
    }
    
    public static double sumarNumeros(double a, double b)  {
      
        double resultado;
                
        resultado = a + b;
        return resultado;                
    }

    public static double restarNumeros(double a, double b)  {
      
        double resultado;
                
        resultado = a - b;
        return resultado;                
    }
    
    public static double multiplicarNumeros(double a, double b)  {
      
        double resultado;
                
        resultado = a * b;
        return resultado;                
    }
    
    public static double divisionNumeros(double a, double b)  {
      
        double resultado;
                
        resultado = a / b;
        return resultado;                
    }
     
}
