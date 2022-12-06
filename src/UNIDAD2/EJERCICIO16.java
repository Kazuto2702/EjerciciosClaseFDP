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
public class EJERCICIO16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("engrese el numero de dias;");
        int dias = leer.nextInt();
        System.out.println("ingresa el numero de horas:");
        int horas = leer.nextInt();
        System.out.println("ingrese el numero de minutos:");
        int min = leer.nextInt();
        int dias_segundos = dias * 24 * 60 * 60;
        int horas_segundos = horas * 60 * 60;
        int minutos_segundos = min * 60;
        int total = dias_segundos + horas_segundos + minutos_segundos;
        System.out.println("total de segundos es: " + total);
    }
}

