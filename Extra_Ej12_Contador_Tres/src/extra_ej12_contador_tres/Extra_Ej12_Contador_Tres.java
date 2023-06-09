
package extra_ej12_contador_tres;

public class Extra_Ej12_Contador_Tres {

    public static void main(String[] args) {
        
        System.out.println("------- Contador de tres digitos (texto) ---------- ");
        ContadorTresDigitosTexto();
    }
    
    public static void ContadorTresDigitosTexto() {
        
        String secuencia, secAux, secAux1, secAux2;
        
        secuencia = "";
        for (int i = 0; i < 10; i++)    {
            if ( i == 3)    {
                secuencia = secuencia.concat("E");               
            }
            else    {
                secAux = String.valueOf(i);
                secuencia = secuencia.concat(secAux);
            }
            secuencia = secuencia.concat("+");
            secAux1 = secuencia;
            for (int j = 0; j < 10; j++)  {
                if ( j == 3)    {
                    secuencia = secuencia.concat("E");
                }
                else    {
                    secAux = String.valueOf(j);
                    secuencia = secuencia.concat(secAux);   
                }
                secuencia = secuencia.concat("+");
                secAux2 = secuencia;
                for (int h = 0; h < 10; h++)    {
                    if ( h == 3 )   {
                        secuencia = secuencia.concat("E");
                    }
                    else    {
                        secAux = String.valueOf(h);
                        secuencia = secuencia.concat(secAux);
                    }
                    System.out.println (secuencia);
                    secuencia = secAux2;
                }
                 secuencia = secAux1;               
            }
            secuencia = " ";                      
        } 
    }
    
}
