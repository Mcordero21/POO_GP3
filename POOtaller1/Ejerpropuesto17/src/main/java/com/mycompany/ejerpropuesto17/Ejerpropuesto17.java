/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerpropuesto17;

/**
 *
 * @author Matteo Cordero M
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejerpropuesto17 {

    public static void main(String[] args) {
        float r;
        double area;
        double perimetro;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Inserte el radio del circulo(en cm): ");
        r = entrada.nextFloat();
        area = Math.PI*(r*r);
        perimetro = 2*Math.PI*r;
        System.out.println("El area del circulo es: "+df.format(area)+" cm^2." );
        System.out.println("Y su perimetro es de "+df.format(perimetro)+" cm.");
    }
}
