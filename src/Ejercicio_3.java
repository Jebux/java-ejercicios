
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aumento=0, disminuye =0;
        
        //Lista que va a almacenar los datos ingresados por el usuario
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Ingrese 3 números para ser analizados");
        
        //Mientras el usuario no ingrese los 3 datos le va a solicitar que los ingrese y cada vez que los ingrese los agrega al listado.
        while (numeros.size() < 3){
            System.out.println("Ingrese un número");
            int num = entrada.nextInt();
            numeros.add(num);
        }
        
        //Recorrer el listado para compararlos. Se utiliza enumerate para hacer uso de él dentro del for. 
        for (int i = 0; i < numeros.size(); i++){
            //En la primera ronda salta las otras comparaciones
            if (i==0){
                continue;
            }
            //Después de la primera ronda compara el número actual con el anterior y dependiendo si es mayor o menor, aumenta los acumuladores de disminuye o de aumento
            if (numeros.get(i)>numeros.get(i-1)){
                aumento +=1;
            } else {
                disminuye +=1;
            }
        }
        
        //Variable para preparar el mensaje de consola con el formato de "num1, num3, num4"
        String listado_string = "";
        
        //Recorre el listado de números
        for (int i = 0; i < numeros.size(); i++){
            listado_string += (" "+ numeros.get(i));
            //Si no es el último agregue un ", " al final del string
            if (i != (numeros.size()-1)){
                listado_string += ",";
            }
        }
        
        //Condicionales a partir de los acumuladores para saber si está incrementando, disminuyendo o ninguna de los dos.
        if (disminuye == 0){
            System.out.println(listado_string + " -> están incrementando");
        }else if (aumento == 0){
            System.out.println(listado_string+ " -> están disminuyendo");
        }else{
            System.out.println("Ni se incrementa, ni se disminuye");
        }
        
    }
    
}
