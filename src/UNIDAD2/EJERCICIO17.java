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
public class EJERCICIO17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de segundos: ");
        int num = leer.nextInt();
        int dias = num / 86400;
        int horas = (num %= 86400) / 3600;
        int min = (num %= 3600) / 60;
        System.out.println(">>>>>" + dias + "dia(s)" + horas + "hora(s)" + min + "min " + (num %= 60) + "seg");
    }
}

