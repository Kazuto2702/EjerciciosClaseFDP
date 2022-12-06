/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD5;
    
import java.util.Scanner;
/**
 *
 * @author PC-02
 */
public class EJERCICIO3 {
    static double TMB_Hombre(double peso, int altura, int edad) {
        return 10.0 * peso + 6.25 * (double)altura - (double)(5 * edad) + 5.0;
    }

    static double TMB_Mujer(double peso, int altura, int edad) {
        return 10.0 * peso + 6.25 * (double)altura - (double)(5 * edad) - 161.0;
    }

    static double calcularConsumoCalorias(double TMB) {
        Scanner lector = new Scanner(System.in);
        double factor = 0.0;
        System.out.println("\nNIVEL DE ACTIVIDAD FISICA\n1. No haces ejercicio.\n2. Poco ejercicio.\n3. Ejercicio moderado.\n4. Deporte intenso.\n5. Atletas profesionales.\n\nIngrese el numero que mejor describa su nivel de actividad fisica:");
        byte nivel = lector.nextByte();
        switch (nivel) {
            case 1 ->  {
                factor = 1.2;
            }
            case 2 ->  {
                factor = 1.375;
            }
            case 3 ->  {
                factor = 1.55;
            }
            case 4 ->  {
                factor = 1.75;
            }
            case 5 ->  {
                factor = 1.9;
            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }
        return TMB * factor;
    }

    static double calcularCaloriasDeficit(double consumoCalorias) {
        return consumoCalorias - 300.0;
    }

    static int[] calcularCaloriasMacros(double caloriasDeficit) {
        int[] macros = new int[]{(int)(caloriasDeficit * 0.35), (int)(caloriasDeficit * 0.25), (int)(caloriasDeficit * 0.4)};
        return macros;
    }

    static int[] calcularGramosMacros(int[] caloriasMacros) {
        int[] gramosMacros = new int[]{caloriasMacros[0] / 4, caloriasMacros[1] / 9, caloriasMacros[2] / 4};
        return gramosMacros;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double tasaMetabolicaBasal = 0.0;
        System.out.println("INGRESA LOS DATOS SOLICITADOS");
        System.out.print("Peso (en kilogramos): ");
        double peso = lector.nextDouble();
        System.out.print("Altura (en centimetros): ");
        int altura = lector.nextInt();
        System.out.print("Edad: ");
        int edad = lector.nextInt();
        System.out.print("Sexo (H=Hombre M=Mujer): ");
        char sexo = lector.next().charAt(0);
        if (sexo == 'H') {
            tasaMetabolicaBasal = EJERCICIO3.TMB_Hombre(peso, altura, edad);
        }
        if (sexo == 'M') {
            tasaMetabolicaBasal = EJERCICIO3.TMB_Mujer(peso, altura, edad);
        }
        System.out.println("\nSu Tasa Metabolica Basal es: " + tasaMetabolicaBasal);
        double consumoCalorias = EJERCICIO3.calcularConsumoCalorias(tasaMetabolicaBasal);
        System.out.println("\nSu consumo de calorias de acuerdo a su nivel de actividad fisica es: " + consumoCalorias);
        double caloriasDeficit = EJERCICIO3.calcularCaloriasDeficit(consumoCalorias);
        System.out.println("\nSu consumo de calorias en deficit es: " + caloriasDeficit);
        int[] caloriasMacros = EJERCICIO3.calcularCaloriasMacros(caloriasDeficit);
        System.out.println("\nSU DISTRIBUCION DE MACRONUTRIENTES EN DEFICIT CALORICO ES\n\n> Calorias de proteinas: " + caloriasMacros[0] + "\n> Calorias de grasas: " + caloriasMacros[1] + "\n> Calorias de carbohidratos: " + caloriasMacros[2]);
        int[] gramosMacros = EJERCICIO3.calcularGramosMacros(caloriasMacros);
        System.out.println("\n> Gramos de proteinas: " + gramosMacros[0] + "\n> Gramos de grasas: " + gramosMacros[1] + "\n> Gramos de carbohidratos: " + gramosMacros[2]);
    }
}

