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
public class EJERCICIO13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad del salario: ");
        double salario = leer.nextDouble();
        System.out.println("su salario con un 25% de incremento es: $" + (salario *= 1.25));
    }
}

