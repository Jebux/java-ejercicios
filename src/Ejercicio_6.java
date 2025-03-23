
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase que quierea ponerle mayúscula a cada primera letra");
        String frase = entrada.nextLine();
        //String frase_prueba = "Este trabajo está muy largo";
        
        //Crea una lista donde separa las palabras por medio de los espacios y las convierte en minúsculas.
        String[] palabras = frase.toLowerCase().split(" ");
        //Constructor para poder reconstruir la frase con las letras convertidas.
        StringBuilder resultado = new StringBuilder();
        
        //Recorre cada una de las palabra, convierte su primera letra en mayusculas y une los valores, al final agrega un espacio.
        for (String palabra : palabras){
            resultado.append(Character.toUpperCase(palabra.charAt(0)));
            resultado.append(palabra.substring(1));
            resultado.append(" ");
        }
        
        System.out.println("La frase convertida es: "+resultado);
        
    }
    
}
