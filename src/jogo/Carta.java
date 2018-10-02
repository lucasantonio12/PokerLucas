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
public class Carta {
    private String face;
    private String naipe;
 
    
    public Carta(String face,String naipe){
        this.face = face;
        this.naipe = naipe;
    }
  
    public String toString(){
        return face + " DE " + naipe ; 
    }
}
