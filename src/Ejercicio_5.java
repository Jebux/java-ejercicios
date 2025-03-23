
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número binario");
        String num_binario = entrada.nextLine();
        
        int decimal = 0;
        
        //Revierte el número que ingresó el usuario
        String num_binario_rev = new StringBuilder(num_binario).reverse().toString();
        
        //Se recorre el número ingresado como una string y se apoya de la posición de cada uno de los números para la fórmula de cada número de derecha a izquierda es (digitoBinario * 2 ^ al index o posición)
        for (int i = 0; i< num_binario_rev.length();i++){
            int bit = num_binario_rev.charAt(i)-'0';
            decimal += (bit)*Math.pow(2,i);
        }
        
        System.out.println("El número binario "+num_binario+" es el número decimal "+decimal);
    }
    
}
