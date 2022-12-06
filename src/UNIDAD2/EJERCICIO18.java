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
public class EJERCICIO18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar letra r");
        double r = leer.nextDouble();
        System.out.println("ingresar letra a");
        double a = leer.nextDouble();
        System.out.println("ingresar letra b");
        double b = leer.nextDouble();
        System.out.println("ingresar letra c");
        double c = leer.nextDouble();
        System.out.println("ingresar letra d");
        double d = leer.nextDouble();
        double problema1 = 1.0 * (r + 34.0);
        double problema2 = 9.0 * (a + b * c);
        double problema3 = 3.0 + d * (2.0 + a) / (a + b * d);
        double resultado = problema1 - problema2 + problema3;
        System.out.println("el resultado de la operacion es: " + resultado);
    }
}
 

