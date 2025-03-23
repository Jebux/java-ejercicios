
import java.util.Scanner;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_4 {

    /**
     * 
     * @param: args the command line arguments
     * @param x1 Latitud del primer punto en grados
     * @param y1 Longitud del primer punto en grados
     * @param x2 Latitud del primer punto en  grados
     * @param y2 Latitud del primer punto en  grados
     * @return distancia
     * 
     */
    public static double Calculo_distancia (double x1,double x2,double y1, double y2){
        //función que convierte todos los grados en radianes y realiza el calculo de la distancia y retorna ese valor
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        
        double distancia;
        int radio_tierra = 6371;
        
        distancia = radio_tierra*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        
        return distancia;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
                
        System.out.println("Ingrese las coordenadas de los puntos que quiere conocer la distancia entre ellos");
        System.out.println("Ingrese el x1 ");
        double x1 = entrada.nextDouble();
        System.out.println("Ingrese el y2 ");
        double y2 = entrada.nextDouble();
        System.out.println("Ingrese el x2 ");
        double x2 = entrada.nextDouble();
        System.out.println("Ingrese el y1 ");
        double y1 = entrada.nextDouble();
        
        
        System.out.println("La distancia es: " + Calculo_distancia (x1,x2,y1,y2)+ " km");
        
        

    }
}
