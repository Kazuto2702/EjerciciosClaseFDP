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
public class EJERCICIO9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese la base mayor del trapecio");
        double base1 = lector.nextDouble();
        System.out.println("ingrese la base menor del trapecio");
        double base2 = lector.nextDouble();
        System.out.println("ingrese la altura del trapecio");
        double altura = lector.nextDouble();
        double area = (base1 + base2 * altura) / 2.0;
        System.out.println("el area del trapecio es: " + area);
    }
} 

