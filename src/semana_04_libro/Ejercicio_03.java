/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_04_libro;

import java.util.Scanner;

/**
 *Pedir el radio de una circunferencia y calcular su longitud.

 * @author USUARIO
 */
public class Ejercicio_03 {
    
   public static void main(String[] args) {
        Scanner arje=new Scanner (System.in);
        System.out.println("Ingrese el radio: ");
        int radio=arje.nextInt();
        double longitud=radio*2*(3.1415);
        System.out.println("Longitud es de= "+longitud+" cm ");
    }
    
}