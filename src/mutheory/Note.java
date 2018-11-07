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
public class Note {
    
    private int value;
    public int getValue()
    {
        return value;
    }
    public void setOctave(int oct)
    {
        int old = getOctave();
        value -= (old*12);
        value += (oct*12);
    }
    public int getOctave()
    {
        return (value/12);
    }
    public void setNote(char nw)
    {
        int id = getNoteID(nw);
        int oct = getOctave();
        value = (oct*12) + id;
    }
    public char getNote()
    {
        int note = value%12;
        String homie = "cCdDefFgGaAb";
        char nottie = homie.charAt(note);
        return nottie;
    }
    private int getNoteID(char st)
    {
        String homie = "cCdDefFgGaAb";
        int id = homie.indexOf(st);
        return id;
    }
    
    public boolean isSharp()
    {
        char note = getNote();
        boolean isCapitalized = ((note<='G') && (note >= 'A'));
        return isCapitalized;
    }
    
   
    /**
     *  Creates a C note at octave 5
     */
    public Note()
    {
        value = 60;
    }
    
    /**
     * @param st
     *  @st - character value of note
     *      Creates a @st note at octave 5
     */
    public Note(char st)
    {
        int note = getNoteID(st);
        note += 60; //setting to octave 5
        value = note;
        
    }
    /**
     * @param n
     * @param oct
     *  @n - character value of note
     *  @oct - int value of octave
     *  
     */
    public Note(char n, int oct)
    {
        int note = getNoteID(n);
        note += (12*oct); //setting to octave
        value = note;
    }
    
    public Note(int noteVal)
    {
        value = noteVal;
    }
    
    
    
    
    
    
}
