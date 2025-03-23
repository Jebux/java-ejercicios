
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el número de filas");
            int num = entrada.nextInt();
            String num_string = "";
            
            System.out.println("");
            System.out.println("La secuencia es");
            System.out.println("");
            
            //A partir del valor dado empieza a iterar agregando cada valor de las iteraciones al string que se imprime
            for (int i= 1;i<=num;i++){
                num_string += i;
                System.out.println(num_string);
            }
    }
    
}
