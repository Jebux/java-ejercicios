
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_10 {

    
    /**
     * Datos que se ingresan
     * _______________________________
     * |     Bulto   |    Peso (kg)   |
     * _______________________________
     *         0            502  ---------> Dato erroneo
     *         1            35
     *         2            23
     *         3            78
     *         4            500 
     *         5            197
     *         6            450
     *         7            150
     *         8            98
     *         9            99
     *         10           134
     *         11           50
     *         12           27
     *         13           7
     *         14           15
     *         15           21
     * 
     */
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int capacidad_Boeing747 = 18000;
        boolean ingresar_datos = true;
        boolean new_paquete = true;
        
        int peso_paquete = 0;
        int[] bultos_pre = {35,23,78,500,197,450,150,98,99,134,50,27,7,15,21};
        ArrayList<Integer> bultos_manual = new ArrayList<>();
        
        //mensaje si el usuario quiere ingresar los datos o quiere usar la lista predefinida
        while(true){
            System.out.println("¿Quiere ingresar de cero los números? (s/n)");
            String message_first = entrada.nextLine();
            if ("n".equals(message_first)){
                ingresar_datos = false;
            }
            if ("n".equals(message_first) || "s".equals(message_first)){
                break;
            }
        }
        
        //Ingreso de datos para la lista manual
        if (ingresar_datos){
            while(new_paquete){
                System.out.println("Ingrese el peso del paquete");
                peso_paquete = entrada.nextInt();
                entrada.nextLine();
                if (peso_paquete>500 || peso_paquete<0){
                    System.out.println("El paquete no puede subir");
                    continue;
                }
                bultos_manual.add(peso_paquete);
                while(true){
                    System.out.println("¿Desea ingresar otro bulto? (s/n)");
                    String message_first = entrada.nextLine();
                    if ("n".equals(message_first)){
                        new_paquete = false;
                    }
                    if ("n".equals(message_first) || "s".equals(message_first)){
                        break;
                    }
                }   
                
            }
        }
        
        double promedio;
        double suma = 0;
        int ingreso = 0;
        int max;
        int min;
        
        if (!bultos_manual.isEmpty()){
            for (int bulto: bultos_manual){
                suma += bulto;                
                //Ingresos
                if (bulto <= 25) continue;
                if(bulto<300){
                    ingreso += 1500*bulto;
                }else{
                    ingreso += 2500*bulto;
                }
            }
            //promedio
            promedio = suma/bultos_manual.size();          
            //Minimos y máximos
            max = Collections.max(bultos_manual);
            min = Collections.min(bultos_manual);
            
        }else{
            for (int bulto: bultos_pre){
                suma += bulto;
                //Ingresos
                if (bulto <= 25) continue;
                if(bulto<300){
                    ingreso += 1500*bulto;
                }else{
                    ingreso += 2500*bulto;
                }
            }
            //promedio
            promedio = suma/bultos_pre.length;
            //Minimos y máximos
            max = Arrays.stream(bultos_pre).max().orElse(bultos_pre[0]);
            min = Arrays.stream(bultos_pre).min().orElse(bultos_pre[0]);            
        }
        
        double ingreso_dolares = ingreso/4114.2;
        
        //Mensaje Final       
        System.out.println("");
        if (!bultos_manual.isEmpty()){
            System.out.println("El número de bultos es: "+bultos_manual.size()+" unidades");
            
        }else{            
            System.out.println("El número de bultos es: "+bultos_pre.length+" unidades");
        }
        System.out.println("El bulto más pesado pesa: "+max+" kg");
        System.out.println("El bulto más liviano pesa: "+min+" kg");
        System.out.println("El promedio del peso de los bultos es: "+promedio+" kg");
        System.out.println("El ingreso por la carga es: $"+ingreso_dolares+" USD");
        System.out.println("");
    }
    
}
