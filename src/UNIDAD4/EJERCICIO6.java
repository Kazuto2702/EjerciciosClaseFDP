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
public class EJERCICIO6 {

    public static void main(String[] args) {
        int i;
        Scanner lector = new Scanner(System.in);
        String[] productos = new String[10];
        for (i = 0; i < productos.length; ++i) {
            System.out.println("Ingrese el nombre del producto: " + (i + 1) + " ");
            productos[i] = lector.nextLine();
        }
        System.out.println("\n\n+++Elementos ingresados al vector+++");
        for (i = 0; i < productos.length; ++i) {
            System.out.println(i + 1 + "." + productos[i]);
        }
        System.out.println("\n>>>Desea modificar algun producto? SI(S) NO(N)");
        String respuesta = lector.next().toUpperCase();
        do {
            if (!respuesta.equals("SI") && !respuesta.equals("S")) continue;
            System.out.println("---Ingrese el numero de productos a editar: ");
            int Indice = lector.nextInt() - 1;
            lector.nextLine();
            String nombreOld = productos[Indice];
            System.out.println("---Ingrese el nuevo nombre del producto: ");
            productos[Indice] = lector.nextLine();
            System.out.println("\n***Usted a cambiado el producto" + nombreOld + "por: " + productos[Indice]);
            System.out.println("\n>>>Desea modificar otro producto? SI(s) No(N)");
            respuesta = lector.next().toUpperCase();
        } while (respuesta.equals("SI") || respuesta.equals("S"));
    }
}

