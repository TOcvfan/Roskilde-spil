/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuing;

/**
 *
 * @author jonassimonsen
 */
public class Player {
    String navn;

    public Player(String navn) {
        
        this.navn = navn;
    }
    
        
    @Override
    public String toString() {
        
        return "" + navn;
    }
    
    public void setNavn(String navn) {
        
        this.navn = navn;
    }
    
    public String getNavn() {
        
        return navn;
    }
}