
package extra_ej04_descuento_por_socio;

import java.util.Scanner;

public class Extra_Ej04_Descuento_Por_Socio {

    public static void main(String[] args) {
            
        Scanner leer = new Scanner(System.in);
        System.out.println("------- Descuento segun Socio ---------- ");
        System.out.print("Ingrese el tipo de socio (A,B o C): ");
        String tipoSocio = leer.nextLine();
        tipoSocio = tipoSocio.toLowerCase();
        System.out.println();
        System.out.print("Ingrese el importe del tratamiento: ");
        double costoTramiento = leer.nextDouble();
        System.out.println();
        System.out.print("El nuevo importe con el descuento segun el socio es de: $"+descuentoSocio(tipoSocio,costoTramiento));
        
    }
    
    public static double descuentoSocio(String s, double c)    {
        
        double resultado;
        
        switch (s) {
            case "a":
                    resultado = c - (c * 0.5);
                    break;
            case "b":
                    resultado = c - (c * 0.35);
                    break;
            case "c":
                    resultado = c;
                    break;
            default: 
                    resultado = 0;                        
        }
        return resultado; 
    }
    
}
