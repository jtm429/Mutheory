package mutheory;

// time signature
public class tisig
{
  //beats per bar
  private int bpb;
  //value of beat; 1/4 is a quarter note; this value should be 1/x where x is this value.
  //that couldve been explained better, but I dont know how
  private int b;
  
  public int getBeat() {return b;}
  public int setBeat(int abeat) {b = abeat;}
  public int getBpbar() {return bpb;}
  public int setBpbar(int abeat) {bpb = abeat;}
  
  
  
  public tisig(int beatperbar, int beat)
  {
    bpb = beatperbar;
    b = beat;
  }
  
  
  

}
