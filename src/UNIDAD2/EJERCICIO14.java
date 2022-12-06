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
public class EJERCICIO14 {
    public static void main(String[] args) {
        double DESCUENTO = 0.1;
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el total de compra");
        double subtotal = lector.nextDouble();
        double total = subtotal - subtotal * 0.1;
        System.out.println("el total de compra con descuento es: " + total);
    }
}

