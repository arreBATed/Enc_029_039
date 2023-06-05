
package ej06_es_par_o_impar;

import java.util.Scanner;

public class Ej06_Es_Par_o_Impar {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera para saber si es par o no: ");
        int numero = leer.nextInt();
        if ((numero % 2) == 0)  {
             System.out.println("El numero es PARRRRR!!!");
        }
        else    {
            System.out.println("El numero es IMPARRRRR!!!");
        }       
    }
    
}
