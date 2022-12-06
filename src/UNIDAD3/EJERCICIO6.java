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
public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\t\tPrograma para saber si el dividendo no es cero");
        System.out.println("Ingrese el dividendo: ");
        double dividendo = entrada.nextDouble();
        System.out.println("Ingresa el divisor: ");
        double divisor = entrada.nextDouble();
        if (dividendo != 0.0) {
            double denominador = dividendo;
            System.out.println("El resultado es: " + denominador / divisor);
        } else {
            System.out.println("ERROR");
        }
    }
}

