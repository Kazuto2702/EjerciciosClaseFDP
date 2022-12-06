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
public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int valor1 = leer.nextInt();
        System.out.println("iongrese el segundo numero:");
        int valor2 = leer.nextInt();
        int resultado = valor1 - valor2;
        System.out.println("el resultado de la resta es: " + resultado);
    }
}

