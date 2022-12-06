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
public class EJERCICIO10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("\n\n ingrese un numero en sistema binario");
        int numero = lector.nextInt(2);
        System.out.println("su equivalente en sistema decimal es:" + numero);
        System.out.println("\n\n ingrese un numero en sistema octal");
        numero = lector.nextInt(8);
        System.out.println("su equivalente en sistema decimal es:" + numero);
        System.out.println("\n\n ingrese un numero en sistema hexadecimal");
        numero = lector.nextInt(16);
        System.out.println("su equivalente en sistema decimal es:" + numero);
    }
}

