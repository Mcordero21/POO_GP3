/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pootaller1;

/**
 *
 * @author Matteo Cordero M
 */
import java.util.Scanner;
public class POOtaller1 {

    public static void main(String[] args) {
        float SUMA;
        float x;
        float y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el iniio de la suma: ");
        SUMA = entrada.nextInt();
        System.out.println("Ingrese un valor x: ");
        x = entrada.nextInt();
        System.out.println("Ingrese un valor y: ");
        y = entrada.nextInt();
        SUMA = (SUMA + x);
        x = (x+(y*y));
        SUMA = (SUMA + (x/y));
        System.out.println("El valor de la suma es: " + SUMA);
        
        
        
    }
}
