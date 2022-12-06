/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

/**
 *
 * @author PC-02
 */
public class EJERCICIO5 {
    public static void main(String[] args) {
        int i;
        String[] pokemones = new String[]{"treecko", "totodile", "torchic", "torkoal", "psyduck", "wobbufet", "cydaquil"};
        for (i = 0; i < pokemones.length; ++i) {
            System.out.println(i + 1 + "." + pokemones[i]);
        }
        System.out.println("n\\ ");
        i = 1;
        for (String pokemon : pokemones) {
            System.out.println(i + "." + pokemon);
            ++i;
        }
    }
}

