
package extra_ej14_m_famlias_promedio_hijos;

import java.util.Scanner;

public class Extra_Ej14_M_Famlias_Promedio_Hijos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);  
        System.out.println("------- Promedio de Edad de Hijos en Familia  ---------- ");
        System.out.print("Ingrese la cantidad de familias: ");
        int familias = leer.nextInt();
        System.out.println();
        PromedioEdadHijosEnFamilia(familias);
    }
    
    public static void PromedioEdadHijosEnFamilia(int f) {
        
        String nombreFamilia;
        int cantHijos, promedio, edadHijo; 
        
        Scanner leer = new Scanner(System.in);
        for (int i = 1; i <= f; i++)    {
            System.out.print("Ingrese el nombre de la familia: ");
            nombreFamilia = leer.nextLine();
            System.out.println();
            System.out.print("Ingrese la cantidad de hijos: ");
            cantHijos = leer.nextInt();
            System.out.println();
            promedio = 0;
            for (int j = 1; j <= cantHijos; j++)    {
                System.out.print("Ingrese la edad del #"+j+" hijo: ");
                edadHijo = leer.nextInt();
                promedio = promedio + edadHijo;
            }
            promedio = promedio / cantHijos;
            System.out.println("El promedio de edad de hijos de la familia "+nombreFamilia+" es de "+promedio);
        }
    }
    
}
