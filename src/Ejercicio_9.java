
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Qué número desea analizar?");
            int num = entrada.nextInt();
            int acumulador = 0;
            for (int i=0; i<num;i++){
                if (i==0){
                    continue;
                }
                // Para que un número sea factor de otro, significa que su modulo es igual a cero
                if (num%i == 0){
                    System.out.println("El número "+num+" es divisible entre "+i);
                    acumulador++;
                }
            }
            System.out.println("El número "+num+" tiene "+acumulador+" factores");            
    }
}
