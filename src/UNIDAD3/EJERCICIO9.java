/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;
    
import java.util.Scanner;
/**
 *
 * @author PC-02
 */
public class EJERCICIO9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para buscarle novio a una chica toxica");
        System.out.println("ingrese la Edad de la chica: ");
        int edadElla = entrada.nextInt();
        System.out.println("Ingrese la Edad del candidato: ");
        int edadEl = entrada.nextInt();
        System.out.println("Ingrese la estatura (En centimetros) del candidato: ");
        int estatura = entrada.nextInt();
        System.out.println("Ingrese el grupo favorito del candidato: ");
        String artistaFavorito = entrada.next();
        if (edadEl > edadElla && estatura >= 180 && artistaFavorito.equals("Timberriche")) {
            System.out.println("El chico es tu candidato ideal");
            System.out.println("El chico es mayor que tu por: " + (edadEl - edadElla) + "a\u00f1os");
        } else {
            System.out.println("Sigue buscando candidatos en Tinder");
        }
    }
}
