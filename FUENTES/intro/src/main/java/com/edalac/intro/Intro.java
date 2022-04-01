/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edalac.intro;

/**
 *
 * @author edala
 */
public class Intro {
    public static void main(String[] args) {
//        System.out.println("Hola Mundo");
//        for(int i=0; i<=10; i++){
//            System.out.println("Contador: " + i);
//        }
        
        int i, j, resultado;
//        i = 0;
//        j = 5;
//        j = ++i + j++ + i++;
//        resultado = j++ + j + i++;
        
        i = 10;
        j = 0;
        i = j++ + j++;
        resultado = i++ + j++/++j + i;
        
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println("resultado " + resultado);
    }
}
