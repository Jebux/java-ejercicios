
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Listado billetes
        int billetes[] = {500, 200, 100, 50, 20, 10, 5};
        //Listado monedas
        int monedas[] = {2, 1};
        
        //Ingreso de la cantidad de dinero en euros por parte del usuario
        System.out.println("Ingrese la cantidad de dinero: ");
        int cantidad_dinero = entrada.nextInt();
        
        //Mientras la cantidad de dinero sea mayor a 5000 descontará billetes
        while(cantidad_dinero>=500){
            //Recorre listado de billetes
            for (int i=0; i<billetes.length; i++){
                int acumulador = 0;
                //Mientras la cantidad de dinero sea mayor o igual a la denominación de los billetes, este descontará y aumentaa el acumulador
                while (cantidad_dinero>=billetes[i]){
                    cantidad_dinero -= billetes[i];
                    acumulador += 1;
                }
                //Si se ejecutó al menos una vez el while anterior significa que tendrá que imprimir el billete que usó
                if (acumulador >0){
                    System.out.println(acumulador+" billete(s) de "+billetes[i]+" euros");
                }
            }
        }
        
        //Mientras la cantidad de dinero sea mayor a 0 después de haber pasado por los billetes, se descontará monedas
        while(cantidad_dinero>0){
            //Recorre el listado de monedas
            for (int i=0; i<monedas.length; i++){
                int acumulador = 0;
                //Mientras la cantidad de dinero sea mayor o igual a la denominación de la moneda, este descontará y aumentará el acumulador.
                while  (cantidad_dinero >= monedas[i]){
                    cantidad_dinero -= monedas[i];
                    acumulador += 1;
                }
                //Si se ejecutó al menos una vez el while anterior significa que tendrá que imprimir el billete que usó
                if (acumulador >0){
                    System.out.println(acumulador+" moneda(s) de "+monedas[i]+" euros");
                }
            }
            }
        }
    }
    

