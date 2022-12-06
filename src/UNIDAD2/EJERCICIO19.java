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
public class EJERCICIO19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar su peso en kilos");
        double kilos = leer.nextDouble();
        System.out.println("ingresar su altura en cm");
        double altura = leer.nextDouble();
        System.out.println("ingresar su edad");
        double edad = leer.nextDouble();
        double tmb = 10.0 * kilos + 6.25 * altura - 5.0 * edad + 5.0;
        System.out.println("\nsu tasa metabolica basal es de: " + tmb);
        double cdn = tmb * 1.55;
        System.out.println("\nsus calorias diarias necesarias son: " + cdn);
        double kalPadel = cdn - cdn * 0.15;
        System.out.println("\nsus calorias para adelgazar son: " + kalPadel);
        double calP = kalPadel * 0.35;
        double grasa = kalPadel * 0.25;
        double carB = kalPadel * 0.5;
        System.out.println("\nsus calorias de proteinas son: " + calP);
        System.out.println("\nsus grasas son: " + grasa);
        System.out.println("\nsus carbohidratos son: " + carB);
        double grP = calP / 4.0;
        double grC = carB / 4.0;
        double grG = grasa / 9.0;
        System.out.println("\nsus gr en proteinas son: " + grP);
        System.out.println("\nsus gr de carbohidratos son: " + grC);
        System.out.println("\nsus gr de grasa son: " + grG);
    }
}

