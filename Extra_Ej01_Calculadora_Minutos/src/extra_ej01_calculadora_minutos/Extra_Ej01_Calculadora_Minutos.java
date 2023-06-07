
package extra_ej01_calculadora_minutos;

import java.util.Scanner;

public class Extra_Ej01_Calculadora_Minutos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos a calcular: ");
        int cantMinutos = leer.nextInt();
        ReCalcularMinutos(cantMinutos);
    }
    
    public static void ReCalcularMinutos(int m) {
     
        
        int minRemanentes = m % 60;
        int cantHoras = m / 60;
        if (cantHoras > 0)  {
            if ((cantHoras / 24) > 0) {
                    int cantHorasRemanenetes = cantHoras % 24;
                    int cantDias = cantHoras / 24;
                    if (minRemanentes > 0)  {
                            if (cantHorasRemanenetes > 0) {
                                    System.out.print("Los "+m+" es igual a: "+cantDias+" dias, "+cantHorasRemanenetes+" horas y "+minRemanentes+" minutos.");
                            }
                            else    {
                                    System.out.print("Los "+m+" es igual a: "+cantDias+" dias y "+minRemanentes+" minutos.");
                            }                            
                    }
                    else    {
                        System.out.print("Los "+m+" es igual a: "+cantDias+" dias y "+cantHorasRemanenetes+" horas. ");
                    }                 
            }
            else    {
                System.out.print("Los "+m+" es igual a: "+cantHoras+" horas y "+minRemanentes+" minutos.");
            }
        }
        else {
            System.out.print("Los "+m+" no superan una hora siquiera!!");
        }
    }
    
}
