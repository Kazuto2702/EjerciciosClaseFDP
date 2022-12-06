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
public class EJERCICIO7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("===Programa que muestra las horas extras trabajadas===");
        System.out.println("Ingrese sus Horas de jornada semanales: ");
        double horas_jornada = entrada.nextDouble();
        System.out.println("Ingrese sus Horas Trabajadas en la semana: ");
        double horas_trabajadas = entrada.nextDouble();
        System.out.println("===Solucion 1===");
        if (horas_trabajadas > horas_jornada) {
            System.out.println("Estas Trabajando Horas extras\nTus horas extras son: " + (horas_trabajadas - horas_jornada));
        }
        if (horas_trabajadas == horas_jornada) {
            System.out.println("Estas Trabajando correctamente");
        }
        if (horas_trabajadas < horas_jornada) {
            System.out.println("Estas trabajando menos horas");
        }
        System.out.println("===Solucion 2===");
        if (horas_trabajadas >= horas_jornada) {
            System.out.println("Estas Trabajando Horas extras\nTus horas extras son: " + (horas_trabajadas - horas_jornada));
        }
        if (horas_trabajadas == horas_jornada) {
            System.out.println("Estas Trabajando correctamente");
        }
        if (horas_trabajadas < horas_jornada) {
            System.out.println("Estas trabajando menos horas");
        }
    }
}
