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
public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\t\tPrograma que determina si un alumno esta REPROBADO O APROBADO");
        System.out.println("Ingrese su calificacion: ");
        double calificacion = entrada.nextDouble();
        System.out.println("===Solucion 1===");
        if (calificacion > 70.0) {
            System.out.println("Estas Aprobado");
        }
        if (calificacion < 70.0) {
            System.out.println("Estas Reprobado");
        }
        System.out.println("===Solucion 2===");
        if (calificacion >= 70.0) {
            System.out.println("Estas Aprobado");
        }
        if (calificacion < 70.0) {
            System.out.println("Estas Reprobado");
        }
    }
}

