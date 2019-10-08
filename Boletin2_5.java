/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;
import java.util.*;
/**
 *
 * @author jalvarezbretana
 */
public class Boletin2_5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es su sueldo fijo?");
        float s_fijo = sc.nextFloat();
        
        System.out.println("Cuanto ha ganado con las ventas?");
        float ventas = sc.nextFloat();
        float comision = (ventas * 5) / 100;
        
        System.out.println("Cuantos quilómetros ha hecho en el mes?");
        float km = sc.nextFloat();
        float quilometraje = km * 2;
        
        System.out.println("Cuantos días se ha desplazado?");
        float desplazamiento = sc.nextFloat();
        float dietas = desplazamiento * 30;
        
        float s_bruto = s_fijo + comision + quilometraje + dietas;
        System.out.println("El sueldo bruto es de " + s_bruto + "€");
        
        float irpf = (s_bruto * 18) / 100;
        float rss = 36f;
        float s_liquido = s_bruto - irpf - rss;
        System.out.println("El sueldo líquido es de " + s_liquido + "€");
    }

}
