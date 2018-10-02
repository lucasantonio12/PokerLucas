/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class Jogador {
    private String nome;
    private Carta[] cartas;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public void setCartas(Carta[] cartas){
        this.cartas = cartas;
    } 
    
    public void mostraCartas(){
        System.out.println("CARTAS DE " + nome.toUpperCase());
        
        for(Carta c: cartas){
            System.out.println(c.toString());
        }
    
    }
}
