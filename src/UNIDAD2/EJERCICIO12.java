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
public class EJERCICIO12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("valor de cateto 1: ");
        double c1 = leer.nextDouble();
        System.out.println("valor cateto 2: ");
        double c2 = leer.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(c1, 2.0) + Math.pow(c2, 2.0));
        double area = c1 * c2 / 2.0;
        double perimetro = c1 + c2 + hipotenusa;
        System.out.println("perfecto!!!!");
        System.out.println("el valor de la hipotenusa es: " + hipotenusa);
        System.out.println("el valor del area es: " + area);
        System.out.println("el valor del perimetro es: " + perimetro);
    }
}

