
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número al cuál quiere genera la secuencia:: ");
        int num = entrada.nextInt();
        
        String string_consola = "";
        
        //Generador de la secuencia, los pares se vuelven negativos y los impares quedan positivos
        for (int i= 0; i<num; i++){
            if ((i+1)%2 == 0){
                string_consola += ((i+1)*-1) +" "; 
            }else{
                string_consola += ((i+1)+" ");
            }
        }
        System.out.println("La secuencia es: "+string_consola);
    }
    
}
