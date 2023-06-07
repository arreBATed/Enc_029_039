
package extra_ej03_comprobar_vocal;

import java.util.Scanner;

public class Extra_Ej03_Comprobar_Vocal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String vocal = leer.nextLine();
        vocal = vocal.toLowerCase();
        System.out.println();
        if (esVocal(vocal)) {
                System.out.print("La letra es una vocal!! ");
        }
        else    {
            System.out.print("La letra No es una vocal :( ");
        }
    }
    
    public static boolean esVocal(String v) {
        
        boolean vocal;
        
        vocal = false;        
        if ((v.equals("a")) || (v.equals("e")) || (v.equals("i")) || (v.equals("o")) || (v.equals("u")) )   {
                vocal = true;
        }
        return vocal;
    }
    
}
