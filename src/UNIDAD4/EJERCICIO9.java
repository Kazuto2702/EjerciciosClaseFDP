/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;
    
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author PC-02
 */
public class EJERCICIO9 {
    public static void main(String[] args) {
        int j;
        int i;
        Scanner lector = new Scanner(System.in);
        int suma = 0;
        int filas = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de filas "));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de columnas "));
        int[][] matriz = new int[filas][columnas];
        System.out.println("ingrese los datos de la matriz: ");
        for (i = 0; i < filas; ++i) {
            for (j = 0; j < columnas; ++j) {
                System.out.println("elemento [" + i + "] [" + j + "]: ");
                matriz[i][j] = lector.nextInt();
            }
        }
        for (i = 0; i < filas; ++i) {
            int sumaFilas = 0;
            for (j = 0; j < columnas; ++j) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("la suma de la fila: " + i + "es: " + sumaFilas);
        }
        for (i = 0; i < columnas; ++i) {
            int sumaColumnas = 0;
            for (j = 0; j < filas; ++j) {
                sumaColumnas += matriz[i][j];
            }
            System.out.println("la suma de la fila:  " + i + "es: " + sumaColumnas);
        }
        for (i = 0; i < filas; ++i) {
            for (j = 0; j < columnas; ++j) {
                suma += matriz[i][j];
            }
        }
        System.out.println("la suma de todos los valores contenidos en la matriz es: " + suma);
    }
}

