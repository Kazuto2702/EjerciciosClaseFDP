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
public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el anio de nacimiento: ");
        int nacimiento = sc.nextInt();
        System.out.println("ingrese el anio actual: ");
        int actual = sc.nextInt();
        int edad = actual - nacimiento;
        System.out.println("su edad es: " + edad);
    }
}

