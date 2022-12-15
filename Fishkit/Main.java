package Fishkit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int moola = 0;
        int bait = 0;
        boolean gimfish = false;
        boolean purpleTicket = false;
        boolean cosmicTicket = false;
        boolean luckyTicket = false;
        

    
        System.out.println("Welcome to Fishkit! Answer questions to earn bait, then use the bait to catch fish! Once you catch the mythic Gimfish, you win!");
   
   
        while(gimfish == false){
            System.out.println(" - - - - - - - - - - - - - - - - - - - -");
            System.out.println("What would you like to do? Type your answer in lowercase.");
            System.out.println("a) Answer questions");
            System.out.println("b) Go fishing");
            System.out.println("c) Shop");
            System.out.println("d) Sell");
            Scanner sc = new Scanner(System.in);
            String action = sc.nextLine();

            if(action.equals("a")){
                boolean exitQuestion = false;
                while(exitQuestion == false){  
                System.out.println(" - - - - - - - - - - - - - - - - - - - -");           
                System.out.println("Answer questions correctly to win bait. To return to the main menu, type z");
               
                //Gets the questions and randomizes them

                int random = (int)(Math.random()*18);
            
                Questions set = new Questions();

                System.out.println(set.getmathQuestions(random));

               String input = sc.nextLine();

               //If player answers correctly, they get bait. If not, they lose bait. 
               
               if(input.equals(set.getAnswers(random))) {
                bait += 1;
                System.out.println("Total bait: " + bait);

               }

               else if(input.equals("z"))
               {
                exitQuestion = true;
               }

               else{
                System.out.println("You are stupid.");
                bait -= 1;
                System.out.println("Total bait: " + bait);

               }


            
            }
              
            }
            //Fishing
            if(action.equals("b")){
                System.out.println("Where would you like to fish? Press z to return to the main menu.");
                System.out.println("a) Normal Pond");
                System.out.println("b) Purple Pond");
                System.out.println("c) Cosmic Cove");
                System.out.println("d) Lucky Lake");

                


            }
            //Shop
            if(action.equals("c")){
                System.out.println("Welcome to the shop! What would you like to buy? Press z to exit the shop.");
                System.out.println("a) ticket to Purple Pond ($20)");
                System.out.println("b) ticket to Cosmic Cove ($60)");
                System.out.println("c) ticket to Lucky Lake ($100)");
                boolean exitShop = false;

                String buy = sc.nextLine();

                while(exitShop == false){
                    if(buy.equals("a")){
                        if(moola >= 20){
                            System.out.println("You now have access to Purple Pond!");
                            moola = moola - 20;
                            purpleTicket = true;
                            System.out.println("Your money: $" + moola);
                            exitShop = true;



                    }

                        else if(purpleTicket == true) {
                            System.out.println("You already have this!");
                            exitShop = true;


                    }

                        else{
                            System.out.println("Sorry, you're too broke for this.");
                            System.out.println("Your money: $" +moola);
                            exitShop = true;

                    }
                    
                }

                    if(buy.equals("b")){
                        if(moola >= 60){
                            System.out.println("You now have access to Cosmic Cove!");
                            moola = moola - 60;
                            cosmicTicket = true;
                            System.out.println("Your money: $" + moola);
                            exitShop = true;



                        }

                        else if(cosmicTicket == true) {
                            System.out.println("You already have this!");
                            exitShop = true;


                        }

                        else{
                            System.out.println("Sorry, you're too broke for this.");
                            System.out.println("Your money: $" +moola);
                            exitShop = true;

                        }

                    }
                
                    if(buy.equals("c")){
                        if(moola >= 100){
                            System.out.println("You now have access to Lucky Lake!");
                            moola = moola - 100;
                            luckyTicket = true;
                            System.out.println("Your money: $" + moola);
                            exitShop = true;



                        }

                        else if(luckyTicket == true) {
                            System.out.println("You already have this!");
                            exitShop = true;


                        }

                        else{
                            System.out.println("Sorry, you're too broke for this.");
                            System.out.println("Your money: $" +moola);
                            exitShop = true;

                        }
                    }

                    else if(buy.equals("z")){
                        exitShop = true;
                    }

                    else{
                        System.out.println("Command not recognized");
                        exitShop = true;

                }
            }





            }

            if(action.equals("d")){


            }


            else{

            System.out.println("That command was not recognized.");

            }




        }

        System.out.println("Congrats, you caught the GimFish and won!");
        System.out.println("Your final score: "+moola);

    }


}