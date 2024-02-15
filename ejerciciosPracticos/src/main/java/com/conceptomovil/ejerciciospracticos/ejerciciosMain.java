/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conceptomovil.ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author dansg
 */
public class ejerciciosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int x;
        int resp = 1;
        Scanner sc = new Scanner(System.in);
        Palindromo pali = new Palindromo();
        CuentaRegresiva cuenta = new CuentaRegresiva();
        
        while (resp == 1){
            System.out.println("Que programa desea probar? Elija una opción en el menu");
            System.out.println("*************Oprima el numero correspondiente al programa");
            System.out.println("*************Verificar si una palabra o frase es un palindromo (1)");
            System.out.println("*************Programa que finaliza con una cuenta regresiva de 60 segundos (2)");
            System.out.println("*************Detener la ejecución del proyecto (3)");
            x = sc.nextInt();
            switch (x){
                case 1: pali.comenzar();
                        break;
                case 2: cuenta.comenzar();
                        break;
                case 3: System.exit(0);
                        break;
                default: System.out.println("Opción inexistente");
                         break;
            }
            
            System.out.println("Deseas elegir otra opción del menu?");
            System.out.println("***********Si (1)");
            System.out.println("***********No (2)");
            resp = sc.nextInt();
        }
        
    }
    
}
