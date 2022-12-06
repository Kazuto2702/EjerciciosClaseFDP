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
public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese valor de libras");
        double libras = lector.nextDouble();
        double kilos = libras * 0.454;
        System.out.println("el resultado es: " + kilos);
    }
}

