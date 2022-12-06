/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD5;
    
import java.util.Scanner;
/**
 *
 * @author PC-02
 */
public class EJERCICIO1 {
    static int suma() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = lector.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = lector.nextInt();
        return n1 + n2;
    }

    static int resta(int n1, int n2) {
        return n1 - n2;
    }

    static void multiplicaci\u00f3n() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = lector.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = lector.nextInt();
        System.out.println("El resultado de la multiplicacion es: " + n1 * n2);
    }

    static void division(int n1, int n2) {
        System.out.println("El resultado de la division es: " + n1 / n2);
    }

    public static void main(String[] args) {
        int resultado = EJERCICIO1.suma();
        System.out.println("El resultado de la suma es: " + resultado);
        resultado = EJERCICIO1.resta(15, 8);
        System.out.println("El resultado de la resta es: " + resultado);
        EJERCICIO1.multiplicaci\u00f3n();
        EJERCICIO1.division(25, 5);
    }
}

