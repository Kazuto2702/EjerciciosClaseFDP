/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;
    
import java.util.Scanner;
/**
 *
 * @author PC-02
 */
public class EXAMEN2 {
    public static void main(String[] args) {
        int i;
        Scanner lector = new Scanner(System.in);
        double[] precioDolar = new double[5];
        for (i = 0; i < precioDolar.length; ++i) {
            System.out.println("Ingresa el precio del dolar (Dia " + (i + 1) + "): ");
            precioDolar[i] = lector.nextDouble();
        }
        double precioMenor = precioDolar[0];
        for (i = 1; i < precioDolar.length; ++i) {
            if (!(precioDolar[i] < precioMenor)) continue;
            precioMenor = precioDolar[i];
        }
        System.out.println("En los ultimos 30 dias, el menor precio del dolar ha sido: " + precioMenor);
    }
}