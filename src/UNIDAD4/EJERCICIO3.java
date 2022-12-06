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
public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] temperaturas = new int[]{35, 28, 32, 37, 30};
        int vecesEncont = 0;
        boolean encontrado = false;
        System.out.println("ingresa el valor a buscar; ");
        int dato = lector.nextInt();
        for (int i = 0; i < temperaturas.length; ++i) {
            if (temperaturas[i] != dato) continue;
            encontrado = true;
            System.out.println("el dato " + dato + " se encuentra en la posicion " + i + " del arreglo");
            break;
        }
        if (encontrado) {
            System.out.println("el dato fue encontrado");
        } else {
            System.out.println("no se encontro el dato");
        }
        double[] calificaciones = new double[]{100.0, 70.0, 85.0, 5.0, 70.0, 100.0, 100.0};
        Object posiciones = "";
        System.out.println("ingresa el valor a buscar: ");
        dato = lector.nextInt();
        for (int i = 0; i < calificaciones.length; ++i) {
            if (calificaciones[i] == (double)dato) {
                ++vecesEncont;
            }
            posiciones = (String)posiciones + i + ",";
        }
        System.out.println("el dato " + dato + " se encontro " + vecesEncont + " veces de las posiciones " + (String)posiciones + " del arreglo.");
    }
}

