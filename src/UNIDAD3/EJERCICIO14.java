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
public class EJERCICIO14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0.0;
        System.out.println("Programa que calcula el promedio de x numero de materias");
        System.out.println("Ingrese el numero de materias que lleva: ");
        int numMaterias = entrada.nextInt();
        for (int i = 1; i <= numMaterias; ++i) {
            System.out.println("Ingrese la Calificacion de la materia " + i + ":");
            double calificacion = entrada.nextDouble();
            suma += calificacion;
        }
        double promedio = suma / (double)numMaterias;
        System.out.println("El promedio de calificacion es: " + promedio);
    }
}

