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
public class EJERCICIO8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int filas = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de filas"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de filas"));
        int[][] matriz = new int[filas][columnas];
        System.out.println("ingresa los datos de la matriz");
        for (int i = 0; i < filas; ++i) {
            for (int j = 0; j < columnas; ++j) {
                System.out.println("elemento [" + i + "] [" + j + "]: ");
                matriz[i][j] = lector.nextInt();
            }
        }
    }
}

