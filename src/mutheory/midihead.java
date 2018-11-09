package mutheory;


//this is for generating the header at the beginning of the midi file
public class MidiHead
{
  //the header consists of several pieces
  //a textchunk 
  private chunk tchu;
  //4 byte headersize (will always be 6)
  private chunk size;
  //file format
  private int fifo;
  //number of tracks
  private int notr;
  //delta time ticks
  //this is resolution not tempo
  //default tempo is 120
  //it can be set to something else
  //with a midivent
  private int delta;
  //getters
  public int getFormat()     {  return fifo;  }
  public int getNumTracks()  {  return notr;  }
  public int getDeltaTime()  {  return delta; }
  //setters
  public void setFormat(int a) `  { fifo = a; }
  public void setNumTracks(int a) { notr = a; }
  public void setDeltaTime(int a) { delta = a;}


  
  
  
  
  public Midihead()
  {
    //these will be the same in every midi file
    //creating textchunk
    tchu = new chunk("MThd");   //for debugging purposes this should be "4D 54 68 64"
    //creating head size
    byte[] si = {0x00, 0x00, 0x00, 0x06};
    size = new chunk();
    size.addMeal(si);
    
    //these will change based on variables
    //this just sets them to the defaults
    fifo = 0;   //single track is the default, because as of right now I dont have a preference.
    notr = 1;   //single track
    delta = 96; //no preference, we'll see what happens. 
  }
}