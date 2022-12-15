package PhraseSolver;
import java.util.Scanner;
import java.io.File;
public class Board{
  String tempPhrase = "";
  String  temp="";
  String  phrase=loadPhrase();

private String loadPhrase()
  {
    
    int numOfLines = 0;
    tempPhrase = "how are you";
    
    try 
    {
      
      Scanner sc = new Scanner(new File(/*Replace with the path*/"phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File(/*Replace with the path*/"phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
  return tempPhrase;
  }

  String key = ""; 
  String blank = "";
  public String blanks(){

    for(int i = 0; i < phrase.length(); i++){
      if(phrase.substring(i, i+1).equals(" ")){
        blank += " ";
      }else{
        blank += "_ ";
      }
    }

    for(int y = 0; y < phrase.length(); y++){
        if(phrase.substring(y, y+1).equals(" ")){
            key += phrase.substring(y, y+1);
        }else{
            key += phrase.substring(y, y+1)+ " ";
        }
      }

    
    System.out.println(key);
   // System.out.println(blank);

    return blank;
    
    }

    public String getBlank(){
      return blank;
    }

    public String getText(){
     return phrase;
    }

    public String getKey(){
      return key;
    }

   

}
