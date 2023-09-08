/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerresuelto4;

/**
 *
 * @author Matteo Cordero M
 */
import java.util.Scanner;
public class Ejerresuelto4 {

    public static void main(String[] args) {
        int edJuan;
        int edAlbert;
        int edAna;
        int edMama;
        Scanner entrada = new Scanner(System.in);
        System.out.println("La edad de Juan es: ");
        edJuan = entrada.nextInt();
        edAlbert = 2*edJuan/3;
        edAna = 4*edJuan/3;
        edMama = (edJuan+edAlbert+edAna);
        System.out.println("Las edades son: Alberto= "+edAlbert+", Juan= "+edJuan+", Ana= "+edAna+", Mamá= "+edMama);
    }
}
