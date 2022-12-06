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
public class EJERCICIO7 {
    public static void main(String[] args) {
        String[][] profesores = new String[][]{{"jose juan ", "cesar ", "ivan "}, {"briseida ", "miguel ", "maria "}, {"marcos ", "nancy ", "maria "}};
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el numero de filas de la matriz: ");
        int filas = lector.nextInt();
        System.out.println("ingrese numero de columnas de la matriz: ");
        int columnas = lector.nextInt();
        int[][] respuestas_eval_docente = new int[filas][columnas];
        for (int i = 0; i < respuestas_eval_docente.length; ++i) {
            for (int j = 0; j < respuestas_eval_docente.length; ++j) {
                System.out.print(profesores[i][j]);
            }
            System.out.println("");
        }
    }
}

