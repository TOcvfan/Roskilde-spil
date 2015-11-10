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
public class Die {
    private final int MAX = 6;
    private int faceValue;
    
    public Die() {
        rollDie(); 
    }
    
    public void rollDie() {
        faceValue = ((int) (Math.random() * MAX) +1);  
    }
    
    public int getDieValue() {
        return faceValue;
    }
    
    public int getDieMax () {
        return MAX;
    }
}