/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutheory;
/**
 * originally this was named "Note", but I decided that a note implies more things
 * than just what note it is. Notes have length and whatnot, so because this just 
 * describes the note of the note, I wanted another word because this shit is confusing
 *
 * @author jtm42
 */
public class Miditone {

    private int value;

    public int getValue() {
        return value;
    }

    public void setOctave(int oct) {
        int old = getOctave();
        value -= (old * 12);
        value += (oct * 12);
    }

    public int getOctave() {
        return (value / 12);
    }

    public void setNote(char nw) {
        int id = getNoteID(nw);
        int oct = getOctave();
        value = (oct * 12) + id;
    }

    public char getNote() {
        int note = value % 12;
        String homie = "cCdDefFgGaAb";
        char nottie = homie.charAt(note);
        return nottie;
    }

    private int getNoteID(char st) {
        String homie = "cCdDefFgGaAb";
        int id = homie.indexOf(st);
        return id;
    }

    public boolean isSharp() {
        char note = getNote();
        boolean isCapitalized = ((note <= 'G') && (note >= 'A'));
        return isCapitalized;
    }

    /**
     * Creates a C note at octave 5
     */
    public Miditone() {
        value = 60;
    }

    /**
     * @param st
     * @st - character value of note Creates a @st note at octave 5
     */
    public Miditone(char st) {
        int note = getNoteID(st);
        note += 60; //setting to octave 5
        value = note;

    }

    /**
     * @param n
     * @param oct
     * @n - character value of note
     * @oct - int value of octave
     *
     */
    public Miditone(char n, int oct) {
        int note = getNoteID(n);
        note += (12 * oct); //setting to octave
        value = note;
    }

    public Miditone(int noteVal) {
        value = noteVal;
    }

}
