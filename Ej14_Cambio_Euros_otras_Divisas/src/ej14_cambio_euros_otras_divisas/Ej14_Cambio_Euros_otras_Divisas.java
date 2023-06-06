
package ej14_cambio_euros_otras_divisas;

import java.util.Scanner;

public class Ej14_Cambio_Euros_otras_Divisas {

    public static void main(String[] args) {
        
        boolean divisaCorrecta;
        String divisas;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros a convertir: ");
        double euros = leer.nextDouble();
        divisaCorrecta = true;
        do {
            System.out.println("Ingrese la divisa a la que quiere convertir los euros: ");
            divisas = leer.nextLine();
            divisas = divisas.toLowerCase();
            if ((divisas.equals("dolares")) || (divisas.equals("yanes")) || (divisas.equals("libras")) ) {
                    divisaCorrecta = false;
            }
            else    {
                System.out.println("No ingreso una divisa correcta... ");
            }
        }   while (divisaCorrecta);
        ConvertirEuros(euros,divisas);
    }
    
    public static void ConvertirEuros(double e, String d)   {
        
        double conversion;
        
        double cambioDolar = 1.28611;
        double cambioLibras = 0.86;
        double cambioYenes = 129.852;        
        switch (d) {
            case "dolares":
                    conversion = e * cambioDolar;
                    System.out.println(e + "Eur son u$s"+ conversion);
                    break;
            case "libras":
                    conversion = e * cambioLibras;
                    System.out.println(e + "Eur son Lib"+ conversion);
                    break;
            default: 
                    conversion = e * cambioYenes;
                    System.out.println(e + "Eur son Yen"+ conversion);
                    break;
        }
    }
}
