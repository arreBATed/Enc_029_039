
package extra_ej02_intercambio_valores_variables;

import java.util.Scanner;

public class Extra_Ej02_Intercambio_Valores_Variables {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("----- Intercambio de Variables con un auxiliar --------- ");
        System.out.print("Ingrese el valor de la variable 'A': ");         
        int variableA = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese el valor de la variable 'B': ");         
        int variableB = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese el valor de la variable 'C': ");         
        int variableC = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese el valor de la variable 'D': ");         
        int variableD = leer.nextInt();
        System.out.println();
        MostrarVariables(variableA,variableB,variableC,variableD); 
        IntercambioVariables(variableA,variableB,variableC,variableD);
    }
    
    public static void MostrarVariables(int a, int b, int c, int d) {
        
        System.out.println("El valor de la variable 'A' es "+a); 
        System.out.println("El valor de la variable 'B' es "+b); 
        System.out.println("El valor de la variable 'C' es "+c); 
        System.out.println("El valor de la variable 'D' es "+d); 
        
    }
    
    public static void IntercambioVariables(int a, int b, int c, int d)  {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("... intercambiando variables...");
        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.print("Variables intercambiadas... desea ver? (s/n):");
        String opcion=leer.nextLine();
        opcion = opcion.toLowerCase();
        if (opcion.equals("s"))  {
                MostrarVariables(a,b,c,d); 
        }   
        System.out.print(".. gracias por utilizar el programa!");
            
    }
}
