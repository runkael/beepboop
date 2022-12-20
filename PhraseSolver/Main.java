package PhraseSolver;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        playerOne.setPlayerOne();
        playerTwo.setPlayerTwo();

        
        String nameOne = playerOne.getOneName();
        String nameTwo = playerTwo.getTwoName(); 
        boolean sameTurn;
        boolean playerOneTurn = true;
        boolean playerTwoTurn = false;
        Board grab = new Board();
        int onePoints = 0;
        int twoPoints = 0;
        int currentPoints = onePoints;
        //CurrentTurn = true means player one, = false means player two
        boolean currentTurn = true;
        String currentName = playerOne.getOneName();

        //Gets the correct amount of blanks from the Board 
        //blanc just means blank btw 
        String answer = grab.getText();
        String blanc = grab.blanks();
        String key = grab.getKey();


       
    //    System.out.println(answer);

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
                    if(currentTurn == true){
                       
                        break;
                    }
                    else{
                        
                        break;
                    }                    

                    
                }else{
                    System.out.println(currentName +", that is incorrect. You have lost some points.");
                    if(currentTurn == true){
                        onePoints -= 500;
                    }
                    else{
                        twoPoints -=500;
                    }
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
                            if(currentTurn == true){
                                onePoints += 100;
                            }
                            else{
                                twoPoints +=100;
                            }


                        }
                        
                       
                    }
                    
                }
                

                    else{
                    System.out.println("Sorry, that letter wasn't correct. You have lost your turn.");
                    if(currentTurn == true){
                        currentTurn = false;
                        currentPoints = twoPoints;
                        currentName = nameTwo;
                        System.out.println("Your points: " + onePoints);

                        
                    }else{
                        currentTurn = true;
                        currentPoints = onePoints;
                        currentName = nameOne;
                        System.out.println("Your points: " + twoPoints);

                    }
                }

            } else {
                System.out.println("Enter a valid input\n");
            }


            

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
                if(currentTurn == true){
                    onePoints += 1000;
                    System.out.println("Congrats, "+ nameOne + ", you won!");
                System.out.println("Here is your total points: " + onePoints);
                }
                else{
                    twoPoints +=1000;
                    System.out.println("Congrats, "+ nameTwo + ", you won!");
                System.out.println("Here is your total points: " + twoPoints);
                }
                
            }


         }

      
    }
