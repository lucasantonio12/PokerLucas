/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Baralho {
     private Carta cartas;
     private int contador;
     Random aleatorio = new Random();
     
    
     public Baralho(){
      
     }
     
     public void mostrarBaralho(){
         for (int i= 0; i < 51;i++ ){
             cartas.toString();
         }
     }
     
     public void embaralhar(){
         /*
        int num1 = aleatorio.nextInt(cartas.length);
        int num2 = aleatorio.nextInt(cartas.length);
        */
     }
     public int distribuirCartas(int contador){
         
         for(int i=0; i< contador; i++){
          cartas.toString();
        }
     
    }
}
