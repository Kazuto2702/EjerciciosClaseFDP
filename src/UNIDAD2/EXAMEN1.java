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
public class EXAMEN1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el radio del cono: ");
        double radio = lector.nextDouble();
        System.out.println("ingrese altura del cono. ");
        double altura = lector.nextDouble();
        double volumenCono = Math.PI * Math.pow(radio, 2.0) * altura / 3.0;
        System.out.println("el volumen del cono es: " + volumenCono);
    }
}

