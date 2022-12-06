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
public class EJERCICIO8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
        double radio = leer.nextDouble();
        double area = Math.PI * Math.pow(radio, 2.0);
        System.out.println("el area del circulo es: " + area);
    }
}

