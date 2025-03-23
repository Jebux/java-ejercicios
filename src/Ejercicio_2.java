
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("""

                           Inicializando programa para valor de pasaje de avi\u00f3n.
                           
                           """);  
        
        //Ingreso información usuario de distancia a recorrer y número de estancia
        System.out.println("Ingrese la distancia que va a recorrer: ");
        int distancia_recorrer = entrada.nextInt();
        System.out.println("Ingrese el número de días de estancia: ");
        int numero_estancia = entrada.nextInt();
        
        //calculo del valor de la gasolina considerando que es 5000 por cada kilometro
        int valor_gasolina = 5000*distancia_recorrer;
        int valor_pasaje;
        
        //Si el valor de la gasolina es menor a 100k se cobra 100k
        if(valor_gasolina<100000){
            valor_pasaje = 100000;
        //Si es mayor se cobra lo que indique valor_gasolina
        } else {
            valor_pasaje = valor_gasolina;
        }
        
        //Si la distancia a recorrer es superior a 1000 y la estancia mayor a 7 descuento del 15%
        if (distancia_recorrer>1000 && numero_estancia>7){
            valor_pasaje *= 0.85;
        }
        
        //Impresión del valor del pasaje
        System.out.println("El valor del pasaje es: $"+valor_pasaje);
        
    }
    
}
