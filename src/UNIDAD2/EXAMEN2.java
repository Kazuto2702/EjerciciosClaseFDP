/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD2;
    
import java.util.Scanner;
/**
 *
 * @author PC-02
 */
public class EXAMEN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la calificacion del examen: ");
        double califExamen = sc.nextInt();
        System.out.println("ingrese la calificacion de los ejercicios: ");
        double califEjercicios = sc.nextInt();
        System.out.println("ingrese la calificacion de la investigacion: ");
        double califInvestigacion = sc.nextInt();
        double calfFinal = califExamen * 0.4 + califEjercicios * 0.35 + califInvestigacion * 0.25;
        System.out.println("La calificacion final de la unidad 2 es: " + calfFinal);
    }
}

