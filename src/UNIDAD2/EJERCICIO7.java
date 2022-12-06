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
public class EJERCICIO7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese la base del triangulo: ");
        double base = lector.nextDouble();
        System.out.println("ingrese la altura del triangulo: ");
        double altura = lector.nextDouble();
        double area = base * altura / 2.0;
        System.out.println("el area del triangulo es: " + area);
    }
}

