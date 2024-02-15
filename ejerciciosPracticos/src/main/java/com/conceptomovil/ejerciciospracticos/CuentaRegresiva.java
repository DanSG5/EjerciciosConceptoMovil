/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conceptomovil.ejerciciospracticos;

/**
 *
 * @author dansg
 */
public class CuentaRegresiva {
    
    public void comenzar() throws InterruptedException{
        
        for (int i = 60; i >= 0; i--) {
            System.out.println("Quedan " + i + " segundo(s) para que finalice el programa");
            Thread.sleep(1000);
        }
        
        System.out.println("El programa ha finalizado");
    }
}
