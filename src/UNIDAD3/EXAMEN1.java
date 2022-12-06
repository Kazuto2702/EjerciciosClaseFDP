/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

import java.util.Scanner;

/**
 *
 * @author PC-02
 */
public class EXAMEN1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int peso, zona;
        System.out.println("Zonas de envío:");
        System.out.println("1.- América del Norte\n2.- Europa\n3.- Asia");
        zona = lector.nextInt();
        System.out.println("Introduce el peso del paquete en kilogramos: ");
        peso = lector.nextInt();
        if (peso > 5)
            System.out.println("El paquete no puede ser admitido por motivos de seguridad.");
        if (peso <= 0) 
            System.out.println("El peso del paquete debe ser un entero mayor a cero.");
        if (peso > 0 && peso <=5) {
            switch (zona) {
            case 1:
              System.out.println("El paquete de " + peso + " kilogramos enviado a América del Norte se envia por " +(peso*24) + " dolares.");
              break;
            case 2:
              System.out.println("El paquete de " + peso + " kilogramos enviado a América Central se envia por " +(peso*20) + " dolares.");
              break;
            case 3:
              System.out.println("El paquete de " + peso + " kilogramos enviado a América del Sur se envia por " +(peso*21) + " dolares.");
              break;
            default:
              System.out.println("ERROR: zona elegida incorrecta.");
            }
        }
    }
}
