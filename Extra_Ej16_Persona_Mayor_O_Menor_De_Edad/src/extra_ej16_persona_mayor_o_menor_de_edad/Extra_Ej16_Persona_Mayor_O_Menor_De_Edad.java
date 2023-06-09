
package extra_ej16_persona_mayor_o_menor_de_edad;

import java.util.Scanner;

public class Extra_Ej16_Persona_Mayor_O_Menor_De_Edad {

    public static void main(String[] args) {
           
        Scanner leer = new Scanner(System.in); 
        System.out.println("------- Verificador de Edad ---------- ");
        System.out.print("Ingrese la cantidad de personas para verificar: ");
        int cantidadPersonas = leer.nextInt();
        System.out.println(); 
        VerificarEdad(cantidadPersonas);
    }
    
    public static void VerificarEdad(int c) {
        
        String nombrePersona, opcion;
        int edadPersona;
        boolean correcto;
        
        Scanner leer = new Scanner(System.in); 
        boolean continuar = true;
        int cont = 0;
        while ((continuar) && (cont < c))  {
            System.out.print("Ingrese el nombre de la persona: ");
            nombrePersona = leer.nextLine();
            System.out.println(); 
            System.out.print("Ingrese la edad de "+nombrePersona+": ");
            edadPersona = leer.nextInt();
            System.out.println();
            System.out.println("Nombre: "+nombrePersona);
            System.out.println("Edad: "+edadPersona);
            cont = cont + 1;
            if (edadPersona >= 18)  {
                    System.out.println(nombrePersona+" es mayo de edad!!!.. que pase...");
            } 
            else    {
                System.out.println(nombrePersona+" es menor ... no puede.. otroo!");
            }
            correcto = true;
            while ((correcto) && (cont < c))   {
                System.out.println("Desea continuar controlando? (si/no): ");
                opcion = leer.nextLine();
                opcion = opcion.toLowerCase();
                System.out.println(); 
                switch (opcion) {
                    case "si":
                                System.out.println("Bien.. continuemos...");
                                correcto = false;
                                break;
                    case "no":
                                System.out.println("Gracias por utilizar el programa!");
                                correcto = false;
                                continuar = false;
                                break;
                    default:
                             System.out.println("Apa! esa opcion no estaba.. Vamos de nuevo...");
                }
            }
        }
        System.out.print("Gracias por utilizar el programa!");
        
    }
}
    
