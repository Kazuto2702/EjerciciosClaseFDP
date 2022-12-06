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
public class EJERCICIO1 {
    public static void main(String[] args) {
        //CONDICIONALES
        Scanner lector = new Scanner(System.in);
        int noviasBadBunny, noviasTiti;
        System.out.println("Tití me preguntó si tenía muchas novias");
        System.out.println("Tití: -BadB ¿cuantas novias tienes?");
        noviasBadBunny = lector.nextInt();
        System.out.println("BadB: -Y tu Tití ¿cuántas novias tienes?");
        noviasTiti = lector.nextInt();
        
        //INICIO DE LA INSTRUCCIÓN CONDICIONAL
        if(noviasBadBunny == noviasTiti) //¿La cantidad de novias de BadB ES IGUAL a la cantidad de novias de Titi?
            System.out.println("Bad Bunny tiene la misma cantidad de novias que Titi");
        
        if(noviasBadBunny > noviasTiti) //¿La cantidad de novias de BadB ES MAYOR a la cantidad de novias de Titi?
            //VERDADERO
            System.out.println("Bad Bunny tiene más novias que Titi");
        else{
            if(noviasBadBunny < noviasTiti) //¿La cantidad de novias de BadB ES MENOR a la cantidad de novias de Titi?
                System.out.println("Titi tiene más novias que Bad Bunny");
        }
        
    }
}


