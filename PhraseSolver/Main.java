package PhraseSolver;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        playerOne.setPlayerNames();
        
        String nameOne = playerOne.getOneName();
        String nameTwo = playerTwo.getTwoName(); 
        boolean sameTurn;
        boolean playerOneTurn = true;
        boolean playerTwoTurn = true;
        Board grab = new Board();
        int onePoints = 0;
        int twoPoints = 0;
        int currentPoints = onePoints;
        boolean currentTurn = playerOneTurn;
        String currentName = playerOne.getOneName();

        //Gets the correct amount of blanks from the Board 
        //blanc just means blank btw 
        String answer = grab.getText();
        String blanc = grab.blanks();
        String key = grab.getKey();

         //Player's initial points
 

         //This is what signals the end of the game. While loop: while the game's end conditions have not been met-
         //continuously run the code

       //  int end = blanc.indexOf("_");
       
        System.out.println(answer);

        boolean end = false;

        while(end == false){
            Scanner sc = new Scanner(System.in);
            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
            System.out.println("Here is your phrase: ");
            System.out.println(blanc);
            System.out.println(currentName + ", please guess a letter. If you want to guess the whole phrase, type 1.");
            String oneGuess = sc.nextLine();

            boolean switchTurn = false;
            if(oneGuess.equals("1")){//while(switchTurn == false)
                System.out.println("Guess the phrase with correct punctuation.");
                String finalGuess = sc.nextLine();

                if(finalGuess.equals(answer)){
                    blanc = finalGuess;
                    end = true;
                    currentPoints = 1000 + currentPoints;
                    
                }else{
                    System.out.println(currentName +", that is incorrect. You have lost some points.");
                    currentPoints = currentPoints - 500;
                    System.out.println("Your points: " + currentPoints);
                }

                int gIndex = answer.indexOf(oneGuess);
                sameTurn = true;
            } else if(oneGuess.matches("[A-Za-z]{1}")) { //while(!oneGuess.equals("1") && sameTurn == true){
                if(answer.contains(oneGuess)){
                    for(int i =0; i < blanc.length(); i ++){
                        

                        int letterCorrect = key.indexOf(oneGuess);
                        
                        if(!(letterCorrect == -1)){
                            key = key.substring(0, letterCorrect) + "#" + key.substring(letterCorrect + 1);
                            blanc = blanc.substring(0, letterCorrect) + oneGuess + blanc.substring(letterCorrect + 1);
                            currentPoints = currentPoints +100;


                        }
                        
                        //  alreadyGuessed += oneGuess;
                        //   validLetter = false;
                    }
                    
                }
                
                //   blanc = blanc.substring(0, )

                    else{
                    System.out.println("Sorry, that letter wasn't correct.");
                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                    if(currentTurn == playerOneTurn){
                        currentTurn = playerTwoTurn;
                        currentPoints = twoPoints;
                        currentName = nameTwo;
                        
                    }else{
                        currentTurn = playerTwoTurn;
                        currentPoints = onePoints;
                        currentName = nameOne;
                    }
                }

            } else {
                System.out.println("Enter a valid input\n");
            }




            //If player One guesses it right, end game 
            // boolean finish = false;

            // if(oneGuess.equals("1")){
            //     
            // }

            //Finds index of player one's guessed letter and creates variable for already guessed letters
            //Also makes a boolean for whether or not to switch turns

   
           
            //String alreadyGuessed = blanc.indexOf(oneGuess);

            //Creates spaces in the word to match with the blanks

            

        //     while(finish = false){

                
            

        //     boolean validLetter= true;
        //     while(validLetter == true){
        //         System.out.println("Guess a lowercase letter");
        //         Scanner letter = new Scanner(System.in);
        //         String input = (letter.nextLine()).toLowerCase();

        //         //if letter is valid

        //         if(input.length()==1){
        //             //if(!(validLetter)

        //         }

        //     }
        // }
    }



            //If player one wins, give them points and say congrats
            //**maybe change this to if false
            if(end){
                System.out.println("Congrats, "+ currentName + ", you won!");
                System.out.println("Here is your total points: "+ currentPoints);
            }


         }

      
    }
