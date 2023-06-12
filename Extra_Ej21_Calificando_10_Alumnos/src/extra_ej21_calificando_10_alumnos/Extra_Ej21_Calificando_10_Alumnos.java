
package extra_ej21_calificando_10_alumnos;

import java.util.Scanner;

public class Extra_Ej21_Calificando_10_Alumnos {

    public static void main(String[] args) {
        
        int dimension = 2;
        double[] vectorAlumnos = new double[dimension];
        
        Scanner leer = new Scanner(System.in);
        System.out.println("---- Calificando 10 alumnos -----");        
        CargarArregloAlumnos(vectorAlumnos,dimension);
        CalcularAlumnosAprobados(vectorAlumnos,dimension);
             
    }
    
    public static void CargarArregloAlumnos(double[] v, int d)   {
        
        double primerPractico, segundoPractico, primerIntegrador, segundoIntegrador;
        
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < d; i++)   {
            System.out.print("Ingrese la nota del primer trabajo practico del alumno #"+(i+1)+": ");
            primerPractico = leer.nextDouble();
            System.out.println(); 
            System.out.print("Ingrese la nota del segundo trabajo practico del alumno #"+(i+1)+": ");
            segundoPractico = leer.nextDouble();
            System.out.println(); 
            System.out.print("Ingrese la nota del primer inegrador del alumno #"+(i+1)+": ");
            primerIntegrador = leer.nextDouble();
            System.out.println();
            System.out.print("Ingrese la nota del segundo inegrador del alumno #"+(i+1)+": ");
            segundoIntegrador = leer.nextDouble();
            System.out.println();
            v[i] = (primerPractico * 0.10) + (segundoPractico * 0.15) + (primerIntegrador * 0.25) + (segundoIntegrador * 0.5);
        }
    }

    public static void CalcularAlumnosAprobados(double[] v, int d)  {
        
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < d; i++) {
            if (v[i] >= 7)  {
                    aprobados = aprobados + 1;
            }
            else    {
                desaprobados = desaprobados + 1;
            }
        }
        System.out.println("Hubo "+aprobados+" alumnos aprobados y "+desaprobados+" desaprobados.");
    }
}
