//Un programa que al tener un booleano verdadero devuelve Yes, y falso No
class YesOrNo
{
  public static String boolToWord(boolean b)
  {
    
    String mystr;
    
    if (b == true)
      {
      mystr = "Yes";
    }
    else
      {
      mystr = "No";
    }
    return mystr;
  }
  
}
