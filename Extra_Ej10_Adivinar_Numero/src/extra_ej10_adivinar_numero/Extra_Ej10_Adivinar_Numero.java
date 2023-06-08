
package extra_ej10_adivinar_numero;

import java.util.Scanner;


public class Extra_Ej10_Adivinar_Numero {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);  
        System.out.println("------- Adivine el numero del 0 al 10 ---------- ");
        AdivineElNumero();
    }
    
    public static void AdivineElNumero()    {
        
        int numeroAzar, numero;
        
        Scanner leer = new Scanner(System.in); 
        boolean noAcerto = true;
        do  {
            System.out.println(".. pensando un numero.. ");
            numeroAzar = (int) (Math.random() * 11);
            System.out.print("Ingrese un numero, a ver si me lo adivina: ");
            numero = leer.nextInt();
            System.out.println();
            if (numeroAzar == numero)   {
                noAcerto = false;
            }
            else
                System.out.println("Mmmnop... ese no era el numero que tengo en mente. Intente de nuevo...");
        }  while (noAcerto);
        System.out.println("Bieenn!! Acertasteeee!!.. Felicitaciones...");
    }
    
}
