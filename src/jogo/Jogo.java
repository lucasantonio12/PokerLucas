/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Jogo {
     Scanner entrada = new Scanner(System.in);
    BaralhoEcartas baralho;
    Jogador[] jogadores;
    
    public Jogo(){
        System.out.println("BEM VINDO AO POKER-GAMER");
        System.out.println("PEGUE SUA CHICARA DE CAFÉ, SE ACONCHEGUE E VAMOS COMEÇAR!");
        System.out.println("BARALHO INICIANDO...");
        baralho = new BaralhoEcartas();
        System.out.println("BARALHO INICIADO");
        baralho.mostrarBaralho();
        baralho.embaralhar();
        baralho.mostrarBaralho();
    }
    
    public void iniciarjogo(){
         do{
            System.out.println("QUANTIDADE DE JOGADORES NA MESA? ");
            System.out.println("OBS: NO MAXIMO 7 JOGADORES: ");

            jogadores = new Jogador[entrada.nextInt()];
 
         }while((jogadores.length > 7));
       
        System.out.println("DIGAM SEUS NOMES, NA ORDEM QUE DESEJAREM: ");
        for(int i=0; i< jogadores.length;i++){
            System.out.println("NOME JOGADOR " + (i+1) + ":");
            jogadores[i] = new Jogador(entrada.next());
        }
        
    }
    
    public void distribuirCartas(){
         for (Jogador j: jogadores) {
             j.setCartas(baralho.distribuirCartas(7));
         }
        
        
        
    }
    
    public void mostraCartas(){
         for (Jogador j : jogadores) {
             j.mostraCartas();
         }
    }
    
    public static void main(String[] args) {
        Jogo poker = new Jogo();
        poker.iniciarjogo();
        poker.distribuirCartas();
        poker.mostraCartas();
    }
}
