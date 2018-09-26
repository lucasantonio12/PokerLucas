/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author lucas
 */
public class Jogador {
    private String nome;
    private Carta cartas;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public void cartas(){
        
    } 
    
    public void mostraCartas(){
        System.out.println("CARTAS DE " + nome);
        
        for(int i=0; i < cartas.toString().length();i++){
            cartas.toString();
        }
    
    }
}
