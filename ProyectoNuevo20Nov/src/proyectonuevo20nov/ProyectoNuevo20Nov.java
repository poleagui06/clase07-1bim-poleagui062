/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectonuevo20nov;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Pole
 */
public class ProyectoNuevo20Nov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String msjFinal = "";
        int contador = 1;
        
        while (contador <= 5){
            
            System.out.println("Ingrese nombre de Empleado");
            String nombre = entrada.nextLine();
            
            System.out.println("Ingrese días trabajados");
            int dias = entrada.nextInt();
                       
            System.out.println("Ingrese valor de costo de día");
            double costo_dia = entrada.nextDouble();
            
            entrada.nextLine();

                        
            double valor_cancelar = dias * costo_dia;
            
            
            msjFinal = String.format("%sNombre %s: días %d, "
                    + "costo por día $%.2f, "
                    + "total $%.2f\n",
                    msjFinal,
                    nombre,
                    dias,
                    costo_dia,
                    valor_cancelar);
            contador = contador + 1;
        }
        
        System.out.printf("%s\n",msjFinal);
        
    }
    
}
