/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

import java.util.Scanner;

/**
 *
 * @author PC-02
 */
public class EXAMEN3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAlumnos;
        System.out.println("Este programa calcula el precio a pagar por alumno en el viaje fin de curso");
        System.out.print("Número de alumnos: ");
        numeroAlumnos = entrada.nextInt();
        if (numeroAlumnos >= 100)
          System.out.println("El pago a la agencia es de " + numeroAlumnos*250 + " pesos y cada alumno debe pagar 250 pesos");
        
        if (numeroAlumnos <100 && numeroAlumnos >= 50)
          System.out.println("El pago a la agencia es de " + numeroAlumnos*370 + " pesos y cada alumno debe pagar 370 pesos");
        
        if (numeroAlumnos < 50 && numeroAlumnos >= 30)
          System.out.println("El pago a la agencia es de " + numeroAlumnos*495 + " pesos y cada alumno debe pagar 495 pesos");
        
        if (numeroAlumnos < 30)
          System.out.println("El coste del autobús es de 19000 pesos y cada alumno debe pagar " + (19000/numeroAlumnos) + " pesos.");
    }
}
