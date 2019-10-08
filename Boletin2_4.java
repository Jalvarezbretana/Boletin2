/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres convertir?");
        int dinero = sc.nextInt();
        int cien = dinero / 100;
        int veinte = (dinero % 100) / 20;
        int cinco = (dinero % 20) / 5;
        int euro = dinero % 5;
        System.out.println("La cantidad de billetes son " + cien + " billetes de cien, "
                + veinte + " billetes de veinte, " + cinco + " billetes de cinco y " + euro
                + " monedas de euro");

    }

}
