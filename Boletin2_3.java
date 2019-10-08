/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos billetes de 100€ tienes?");
        int cien = sc.nextInt() * 100;
        System.out.println("cuantos de 20€?");
        int veinte = sc.nextInt() * 20;
        System.out.println("cuantos de 5€?");
        int cinco = sc.nextInt() * 5;
        System.out.println("y cuantas monedas de euro?");
        int euros = sc.nextInt();
        System.out.println("Tienes " + (cien + veinte + cinco + euros) + "€");
    }

}
