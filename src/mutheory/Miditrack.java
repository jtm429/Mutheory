/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutheory;

/**
 *
 * @author jtm42
 */
public class Miditrack {
    
    
    //textchunk
    private chunk mtrk;
    
    
    
    //constructor
    public Miditrack()
    {
        mtrk = new chunk("MTrk");
        
        //cant get length because length has to come from all the midievents
        
        //container for midivents, whatever that ends up being
    }
    
    
}
