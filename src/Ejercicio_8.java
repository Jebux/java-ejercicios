
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_8 {

    /**
     * @param: args the command line arguments
     * @param num_dec Número ingresado por el usuario
     * @return num_hex Número convertido
     */
    public static String Convertidor_hex(int num_dec){
        String[] list_hex_letras={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

        String num_hex ="";
        //Divide el valor ingresado en 16, el cociente se sigue dividiendo hasta  que llegue a cero y el residuo se usa para buscarlo en el listado
        while (num_dec>0){
            int cociente = num_dec/16;
            int residuo = num_dec%16;
            num_hex += list_hex_letras[residuo];
            num_dec = cociente;
        }
        //El resultado se invierte
        String num_hex_rev = new StringBuilder(num_hex).reverse().toString();  
        num_hex = num_hex_rev;
        return num_hex;
    }
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número decimal para convertir a hexagesimal");
        int num_dec = entrada.nextInt();
        
        int num_dec2 = num_dec;
        
        System.out.println("El número "+num_dec2+" es igual a "+Convertidor_hex(num_dec));
        
               
                
        
    }
    
}
