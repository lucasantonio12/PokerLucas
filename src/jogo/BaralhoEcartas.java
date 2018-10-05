/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author lucas
 */
public class BaralhoEcartas {
     private Carta [] baralho;
     private int contador= 0;
     Random aleatorio = new Random();
     
    
     public BaralhoEcartas(){
         String[] faces = {"A","2","3","4","5","6","7","8","9","K","Q","j","10"};
         String[] naipes = {"Copas","Espadas","Ouros","Paus"};   
         
         baralho = new Carta[52];
         for(String naipe: naipes){
             for (String face : faces) {
                 baralho[contador++] = new Carta(face,naipe); 
             }
         }
        contador = 0;
     }
    
     public void mostrarBaralho(){
    
         for (Carta b : baralho) {
             System.out.println(b.toString()); 
         }
         
     }
     public void embaralhar(){
        System.out.println("EMBARALHANDO, NAO SE APRESSE NOSSO JOGO É JUSTO!!");
       
        for(int i=0; i < baralho.length;i++){
            int num1 = aleatorio.nextInt(baralho.length);
            int num2 = aleatorio.nextInt(baralho.length);
            
            baralho[i] = baralho[num1];
            baralho[num1]= baralho[num2];
            baralho[num2]= baralho[i];
        }
        
     }
     
     public Carta[] distribuirCartas(int qtd){
         System.out.println("DISTRIBUINDO CARTAS!! EI ESTOU VENDO VC TENTANDO ESCONDER ESSA CARTA AI! ");
         
         Carta[] recebeCarta = new Carta[qtd];
       
            for(int i=0; i < recebeCarta.length ; i++){
                recebeCarta[i] = baralho[contador++];
            }
         return recebeCarta;
     }
    

}
