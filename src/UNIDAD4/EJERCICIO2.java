/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;
 
import java.util.Scanner;
/**
 *
 * @author PC-02
 */
public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int suma = 0;
        int promedio = 0;
        System.out.println("ingrese el numero de materias: ");
        int numMaterias = lector.nextInt();
        int[] calificaciones = new int[numMaterias];
        System.out.println("ingrese las " + numMaterias + " calificaciones, una ala vez y presione enter: ");
        for (int i = 0; i < calificaciones.length; ++i) {
            calificaciones[i] = lector.nextInt();
            suma += calificaciones[i];
        }
        promedio = suma / numMaterias;
        System.out.println("el promedio de calificacion es:" + promedio);
    }
}

