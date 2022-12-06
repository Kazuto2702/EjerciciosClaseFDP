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
public class EJERCICIO12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que te dice con cual signo eres compatible como pareja");
        System.out.println("Escribe tu signo Zodiacal: ");
        String signoZodiacal = entrada.nextLine();
        switch (signoZodiacal.toLowerCase()) {
            case "aries" ->  {
                System.out.println("Eres compatible con Leo, Sagitario, Geminis, Libra y Acuario");
            }
            case "tauro" ->  {
                System.out.println("Eres compatible con Virgo, Capricornio, Cancer, Escorpion y Piscis");
            }
            case "geminis" ->  {
                System.out.println("Eres compatible con Libra, Acuario, Aries, Leo y Sagitario");
            }
            case "cancer" ->  {
                System.out.println("Eres compatible con Escorpion, Piscis, Tauro, Virgo y Capricornio");
            }
            case "leo" ->  {
                System.out.println("Eres compatible con Aries, Sagitario, Geminis, Libra y Acuario ");
            }
            case "virgo" ->  {
                System.out.println("Eres compatible con Tauro ,Capricornio, Cancer, Escorpion y Piscis ");
            }
            case "libra" ->  {
                System.out.println("Eres compatible con Geminis, Acuario, Aries, Leo y Sagitario");
            }
            case "escorpion" ->  {
                System.out.println("Eres compatible con Cancer, Piscis, Tauro, Virgo y Capricornio");
            }
            case "sagitario" ->  {
                System.out.println("Eres compatible con Aries ,Leo, Geminis, Libra y Acuario");
            }
            case "capricornio" ->  {
                System.out.println("Eres compatible con Virgo, Tauro, Cancer, Escorpion y Piscis");
            }
            case "acuario" ->  {
                System.out.println("Eres compatible con Geminis, Libra, Aries, Leo y Sagitario ");
            }
            case "picis" ->  {
                System.out.println("Eres compatible con Cancer, Escorpion, Tauro, Virgo y Capricornio");
            }
            default -> {
                System.out.println("Ese signo no existe");
            }
        }
    }
}

