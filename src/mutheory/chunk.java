package mutheory;

// Bytes that are closely related and rely on one another
// size limit is 10
public class chunk
{

  private byte[] ourBytes;
  int spot;
  int end;

  public chunk()
  {
    ourBytes = new byte[11];
    spot = 0;
    end = -1;
  }

  public void addByte(byte spoon)
  {
      ourBytes[spot] = spoon;
      end = spot;
      spot++;
  }

  public void addMeal(byte[] meal)
  {
    for(int spoon = 0; spoon < meal.length; spoon++)
    {
      addByte(meal[spoon]);
    }
  }

  public byte[] getBytes()
  {
    byte[] tosen = new byte[end+1]
    for(int i = 0; i <= end; i++)
      tosen[i] = ourBytes[i];
    return tosen;
    {

    }
  }


}
