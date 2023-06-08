package extra_ej07_maximo_minimo_promedio;

import java.util.Scanner;

public class Extra_Ej07_Maximo_Minimo_Promedio {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);  
        System.out.println("------- Calculando Maximo, Minimo y Promedio ---------- ");
        System.out.print("Ingrese la cantidad de numeros a procesar: ");
        int cantNumeros = leer.nextInt();
        System.out.println();
        MaximoMinimoPromedio(cantNumeros); 
    }
    
    public static void MaximoMinimoPromedio(int c)  {
        
        double aux ;
        
        Scanner leer = new Scanner(System.in); 
        double promedio = 0;
        double minimo = 0;
        double maximo = 0; 
        int cont = 1;
        while (cont <= c)    {
            System.out.print("Ingrese el #"+cont+" numero: ");
            aux = leer.nextDouble();
            if (cont == 1)  {
                minimo = aux;
                maximo = aux;
            }
            promedio = promedio + aux;
            System.out.println();
            if (minimo >= aux)   {
                    minimo = aux;
            }
            if (maximo <= aux)  {
                    maximo = aux;
            }
            cont = cont + 1;
        }
        promedio = promedio / c;
        System.out.println("De la secuencia, el numero minimo es "+minimo+", el numero maximo "+maximo+" y el promedio es "+promedio);
    }
    
}
