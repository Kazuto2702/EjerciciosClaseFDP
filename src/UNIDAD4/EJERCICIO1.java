/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;
    
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author PC-02
 */
public class EJERCICIO1 {
    public static void main(String[] args) {
        int i;
        int[] numeros = new int[]{120, 37, 15, 28, 11};
        int[] numero2 = new int[]{100, 70, 65, 208, 23, 11};
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el tama\u00f1o del arreglo: ");
        int tamanio = lector.nextInt();
        int[] numero3 = new int[tamanio];
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numero2));
        System.out.println(Arrays.toString(numero3));
        System.out.println("impresion del vector numeros: ");
        for (i = 0; i < numeros.length; ++i) {
            System.out.println(numeros[i] + ",");
        }
        System.out.println("impresion del vector numeros2: ");
        for (i = 0; i < numero2.length; ++i) {
            System.out.println(numero2[i] + ",");
        }
        System.out.println("impresion del vector numeros3: ");
        for (i = 0; i < numero3.length; ++i) {
            System.out.println(numero3[i] + ",");
        }
    }
}