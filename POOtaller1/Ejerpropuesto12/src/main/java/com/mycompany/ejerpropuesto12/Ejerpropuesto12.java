/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerpropuesto12;

/**
 *
 * @author Matteo Cordero M
 */
import java.util.Scanner;
public class Ejerpropuesto12 {

    public static void main(String[] args) {
        float horas;
        float valor;
        float retencion;
        float Salario;
        float valor_retencion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantas horas trabajó?: ");
        horas = entrada.nextFloat();
        System.out.println("¿La hora se paga a?: ");
        valor = entrada.nextFloat();
        System.out.println("El porcentaje de retencion es(ej: 0,07 = 7%)" );
        retencion = entrada.nextFloat();
        Salario = valor*horas;
        valor_retencion = retencion*Salario;
        
        System.out.println("Su salario bruto es de: $" + Salario);
        System.out.println("La retencion es de: $" + valor_retencion);
        System.out.println("Su salario neto es de: $" + (Salario-valor_retencion));
    }
}
