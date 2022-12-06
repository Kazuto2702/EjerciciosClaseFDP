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
public class EJERCICIO11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("hola que tal!!!");
        System.out.println("\ningrese el producto que desea comprar");
        String nombre = leer.next();
        System.out.println("ingrese el precio del producto");
        int precio = leer.nextInt();
        System.out.println("ingrese cantidad de productos");
        int cantidad = leer.nextInt();
        int total = precio * cantidad;
        System.out.println("El total a pagar por " + nombre + " es $" + total);
        System.out.println("\ningrese la cantidad con la que pagara");
        int pago = leer.nextInt();
        int cambio = pago - total;
        System.out.println("Su cambio es $" + cambio + " hasta luego");
    }
}

