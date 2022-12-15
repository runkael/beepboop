package PhraseSolver;
import java.util.Scanner;

public class Player {
 
   String playerOneName;
   String playerTwoName;
 
   Scanner sc = new Scanner(System.in);
    public Player(){
          playerOneName = "";
          playerTwoName = "";
    }

   public void setPlayerNames(){
         System.out.println("What is player one's name?");
         playerOneName = sc.nextLine();
         System.out.println("What is player two's name?");
         playerTwoName = sc.nextLine();
         System.out.println("Hello " + playerOneName + ". You are player one. " + playerTwoName + ", you are player two. Welcome!");
   }
 
 public String getOneName(){
    return playerOneName;
 }

 public String getTwoName(){
    return playerTwoName;
 }
 
public String guessLetter(){
    String l = sc.nextLine();
    return l;
}
 
}
