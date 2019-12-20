/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio32 {

    /**
     * Pedir dos palabras por teclado, indicar si son iguales.
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        String palabra1, palabra2;
        System.out.println("Digite una palabra: ");
        palabra1 = Teclado.nextLine();
        System.out.println("Digite otra palabra: ");
        palabra2 = Teclado.nextLine(); 
        
        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }
        
        else{
            System.out.println("Las palabras no son iguales");
        }
    }
    
}
