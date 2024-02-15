/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conceptomovil.ejerciciospracticos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dansg
 */
public class Palindromo {
    private String frase;
    private String nuevaFrase;
    private int tamañoF;
    List<Character> fraseOriginal = new ArrayList<>();
    List<Character> fraseAlReves = new ArrayList<>();
    private int contador = 0;
    Scanner sc = new Scanner(System.in);

    public Palindromo() {
    }
    
    public void comenzar(){
        System.out.println("Ingresa la palabra o frase para verificar si es un palindromo:");
        frase = sc.nextLine();
        nuevaFrase = frase.replace(" ", "");
        tamañoF = nuevaFrase.length();
        //System.out.println(tamañoF);
        compararFrase();
        mostrarResultado();
    }
    
    public void compararFrase(){
        
        for (int i = 0; i < tamañoF; i++) {
            //System.out.println(nuevaFrase.charAt(i));
            fraseOriginal.add(nuevaFrase.charAt(i));
            //System.out.println("se guardo");
        }
        //System.out.println(fraseOriginal);
        
        for (int i = (tamañoF - 1); i > -1 ; i--) {
            //System.out.println(nuevaFrase.charAt(i));
            fraseAlReves.add(nuevaFrase.charAt(i));
            //System.out.println("se guardo");
        }
        //System.out.println(fraseAlReves);
        
        for (int i = 0; i < tamañoF; i++) {
            if(fraseOriginal.get(i) == fraseAlReves.get(i)){
                contador += contador;
            }
            else {
                contador += 1;
            }
        }
    }

    public void mostrarResultado(){
        //System.out.println(contador);
        if (contador == 0) {
            System.out.println("La palabra o frase *** " + frase + " *** es un palindromo");
        }
        else {
            System.out.println("La palabra o frase *** " + frase + " *** no es un palindromo");
        }
    }
    
    
}
