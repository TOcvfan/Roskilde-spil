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
public class GameEngine {
    private Player player;
    private Die die1;
    private Die die2;
    private int result[];
    
    
    public GameEngine(String navn) {
    
       
        die1 = new Die();
        die2 = new Die();
        player = new Player(navn);
        result = new int[2];
        result[0] = die1.getDieValue();
        result[1] = die2.getDieValue();
    }
    
    public int[] playRound() {
        
        die1.rollDie();
        die2.rollDie();
        
        result[0] = die1.getDieValue();
        result[1] = die2.getDieValue();
        
        //return result;
        //System.out.println("result" + result[0]);
        return result;  
    }
}