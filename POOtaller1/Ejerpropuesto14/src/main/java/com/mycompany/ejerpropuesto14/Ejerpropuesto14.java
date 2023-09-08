/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerpropuesto14;

/**
 *
 * @author Matteo Cordero M
 */
import java.util.Scanner;
public class Ejerpropuesto14 {

    public static void main(String[] args) {
        float x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera: ");
        x = entrada.nextFloat();
        System.out.println("El cuadrado de "+x+" es "+x*x);
        System.out.println("y su cubo es "+ Math.pow(x,3));
    }
}
