/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe os centigrados que queres pasar a Fahrenheit e Kelvin");

        float celsius = sc.nextFloat();
        float fahrenheit = celsius * 9 / 5 + 32;
        float kelvin = celsius + 273.15f;
        System.out.println(+celsius + " Grados Celsius " + "son "
                + fahrenheit + " Grados Fahrenheit,"
                + " que tamén son " + kelvin
                + " Grados Kelvin");

    }

}
