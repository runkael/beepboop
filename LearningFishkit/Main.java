package LearningFishkit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Money, bait, tickets, berryfish?, and menus

        int moola = 0;
        int bait = 0;
        boolean gimfish = false;
        boolean purpleTicket = false;
        boolean cosmicTicket = false;
        boolean luckyTicket = false;
        boolean mainMenu = true;
        boolean commandRecognized = true;
        boolean berryfish = false;

        //Fish and their prices

        String gray = "Gray fish ($1)";
        String green = "Green fish ($5)";
        String blue = "Blue fish ($10)";
        String purple = "Purple fish ($20)";
        String star = "Star fish ($50)";
        String berry = "Berry fish ($100)";
        String gim = "Gim fish ($5000)";

        int grayworth = 1;
        int greenworth = 5;
        int blueworth = 10;
        int purpleworth = 20;
        int starworth = 50;
        int berryworth = 100;
        int gimworth = 5000;

        Backpack packyback = new Backpack();
        

    
        System.out.println("Welcome to Fishkit! Answer questions to earn bait, then use the bait to catch fish!");
   
   
        while(gimfish == false){
            if(mainMenu == true){
                //This is the main menu!
            System.out.println(" - - - - - - - - - - - - - - - - - - - -");
            System.out.println("What would you like to do? Type your answer in lowercase.");
            System.out.println("a) Answer questions");
            System.out.println("b) Go fishing");
            System.out.println("c) Shop");
            System.out.println("d) Sell");
            }
            Scanner sc = new Scanner(System.in);

            String action = sc.nextLine();
            mainMenu = false;
            
            //(step 1) below, write the if statement that will bring the user to the "answer questions" menu if they type a
            
                mainMenu = false;
                while(mainMenu == false){  
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
                mainMenu = true;
               }

               else{
                System.out.println("You are stupid.");
                bait -= 1;
                System.out.println("Total bait: " + bait);

               }


            
            }
            //end bracket for option A should go here (step 1)
              
            
            //Fishing
            //(step 1) below, write the if statement that will bring the user to the "fishing" menu if they type b
       
            
                boolean gofish = true;
                while(gofish == true){
                if(packyback.getFishIndex() == 10){
                    System.out.println("Your backpack is full.");
                    mainMenu = true;
                    gofish = false;
                }
                else{
                    commandRecognized = true;
                    boolean fishMenu = true;
                    if(fishMenu == true){
                    
                    System.out.println(" - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("Where would you like to fish? Press z to return to the main menu.");
                    System.out.println("a) Normal Pond");
                    System.out.println("b) Purple Pond");
                    System.out.println("c) Cosmic Cove");
                    System.out.println("d) Lucky Lake");
                    }

                    String place = sc.nextLine();

                    if(place.equals("a")){
                        //(step 4) Normal pond is here
                        mainMenu = false;
                        int secretpondfishChance = (int)(Math.random()*100);

                        //(step 4) below, create the if/else if/else statements that check for the berry fish and run the code!

                        
                            //(step 4) if berryfish is caught should be here
                                System.out.println("You caught the gim fish!! :D");
                                packyback.addFeesh(gim, gimworth);
                                bait = bait - 1;
                                gimfish = true;
                                break;
                            
    
                            
                                System.out.println("You caught a blue fish!");
                                packyback.addFeesh(blue, blueworth);
                                bait = bait - 1;
                                fishMenu = true;
    
    
                            
                            
                                System.out.println("You caught a green fish!");
                                packyback.addFeesh(green, greenworth);
                                bait = bait - 1;
                                fishMenu = true;
    
                            
                                System.out.println("You caught a gray fish!");
                                packyback.addFeesh(gray, grayworth);
                                bait = bait - 1;
                                fishMenu = true;
    
                            


                        
                        //(step 4) If berryfish isn't caught should be here
                        System.out.println("fishing . . .");
                        int pondfishChance = (int)(Math.random()*100);
                        
                            System.out.println("You caught a blue fish!");
                            packyback.addFeesh(blue, blueworth);
                            bait = bait - 1;
                            fishMenu = true;
                        

                            System.out.println("You caught a green fish!");
                            packyback.addFeesh(green, greenworth);
                            bait = bait - 1;
                            fishMenu = true;


                        
                            System.out.println("You caught a gray fish!");
                            packyback.addFeesh(gray, grayworth);
                            bait = bait - 1;
                            fishMenu = true;

                        
                    //(step 4) This should be where your final end bracket is for this entire step

                    else{
                        System.out.println("You don't have any bait!");
                        mainMenu = true;
                    }

                    }

                    if(place.equals("b")){

                        //(step 3) this is purple pond! create 3 conditionals under this if statement for the chance of getting a certain fish
                        if(purpleTicket ==true){
                            System.out.println("fishing . . .");
                            int purplefishChance = (int)(Math.random()*100);
                            //(step 3) if statement here!
                           
                                System.out.println("You caught a purple fish!");
                                packyback.addFeesh(purple, purpleworth);
                                bait = bait - 1;
                                fishMenu = true;
                            
                            //(step 3) else if statement here
                                System.out.println("You caught a blue fish!");
                                packyback.addFeesh(blue, blueworth);
                                bait = bait - 1;
                                fishMenu = true;
    
    
                            }
                            //(step 3) else statement here
                                System.out.println("You caught a green fish!");
                                packyback.addFeesh(green, greenworth);
                                bait = bait - 1;
                                fishMenu = true;
    
                            

                        }

                        else{
                            System.out.println("You don't have access to this place!");
                            mainMenu = true;
                        }
                    }

                    if(place.equals("c")){
                        if(cosmicTicket == true){
                            System.out.println("fishing . . .");
                            int cosmicfishChance = (int)(Math.random()*100);
                            if(cosmicfishChance >= 90){
                                System.out.println("You caught a star fish!");
                                packyback.addFeesh(star, starworth);
                                bait = bait - 1;
                                fishMenu = true;
                            }
    
                            else if(cosmicfishChance >= 60){
                                System.out.println("You caught a purple fish!");
                                packyback.addFeesh(purple, purpleworth);
                                bait = bait - 1;
                                fishMenu = true;
    
    
                            }
                            else if(cosmicfishChance >=0){
                                System.out.println("You caught a blue fish!");
                                packyback.addFeesh(blue, blueworth);
                                bait = bait - 1;
                                fishMenu = true;
    
                            }

                        }

                        else{
                            System.out.println("You don't have access to this place!");
                            mainMenu = true;
                        }
                    }

                    if(place.equals("d")){
                        if(luckyTicket == true){
                            System.out.println("fishing . . .");
                            int luckyfishChance = (int)(Math.random()*100);
                            if(luckyfishChance >= 90){
                                System.out.println("You caught a berry fish!");
                                packyback.addFeesh(berry, berryworth);
                                bait = bait - 1;
                                fishMenu = true;
                                berryfish = true;
                            }
    
                            else if(luckyfishChance >= 60){
                                System.out.println("You caught a star fish!");
                                packyback.addFeesh(star, starworth);
                                bait = bait - 1;
                                fishMenu = true;
    
    
                            }
                            else if(luckyfishChance >=0){
                                System.out.println("You caught a purple fish!");
                                packyback.addFeesh(purple, purpleworth);
                                bait = bait - 1;
                                fishMenu = true;
    
                            }

                        }
                        else{
                            System.out.println("You don't have access to this place!");
                            mainMenu = true;
                        }
                    }

                    if(place.equals("z")){
                        mainMenu = true;
                        gofish = false;
                    }
                }
            }

                
            //end bracket for option b should go here (step 1)

            
            //Shop
            //(step 1) below, write the if statement that will bring the user to the "shop" menu if they type c
            
                System.out.println("Welcome to the shop! What would you like to buy? Press z to exit the shop.");
                System.out.println("a) ticket to Purple Pond ($20)");
                System.out.println("b) ticket to Cosmic Cove ($60)");
                System.out.println("c) ticket to Lucky Lake ($200)");
                mainMenu = false;

                String buy = sc.nextLine();

                while(mainMenu == false){
                    if(buy.equals("a")){
                        if(moola >= 20){
                            System.out.println("You now have access to Purple Pond!");
                            moola = moola - 20;
                            purpleTicket = true;
                            System.out.println("Your money: $" + moola);
                            mainMenu = true;



                    }

                        else if(purpleTicket == true) {
                            System.out.println("You already have this!");
                            mainMenu = true;


                    }

                        else{
                            System.out.println("Sorry, you're too broke for this.");
                            System.out.println("Your money: $" +moola);
                            mainMenu = true;

                    }
                    
                }

                    if(buy.equals("b")){
                        if(moola >= 60){
                            System.out.println("You now have access to Cosmic Cove!");
                            moola = moola - 60;
                            cosmicTicket = true;
                            System.out.println("Your money: $" + moola);
                            mainMenu = true;

                        }

                        else if(cosmicTicket == true) {
                            System.out.println("You already have this!");
                            mainMenu = true;


                        }

                        else{
                            System.out.println("Sorry, you're too broke for this.");
                            System.out.println("Your money: $" +moola);
                            mainMenu = true;

                        }

                    }
                
                    if(buy.equals("c")){
                        if(moola >= 200){
                            System.out.println("You now have access to Lucky Lake!");
                            moola = moola - 200;
                            luckyTicket = true;
                            System.out.println("Your money: $" + moola);
                            mainMenu = true;



                        }

                        else if(luckyTicket == true) {
                            System.out.println("You already have this!");
                            mainMenu = true;


                        }

                        else{
                            System.out.println("Sorry, you're too broke for this.");
                            System.out.println("Your money: $" +moola);
                            mainMenu = true;

                        }
                    }

                    else if(buy.equals("z")){
                        mainMenu = true;
                    }

                    else{
                        System.out.println("Command not recognized");
                        mainMenu = true;

                }
            }



            //the end bracket for option c should go here (step 1)

            //Sell
            //(step 1) below, write the if statement that will bring the user to the "sell" menu if they type d

                System.out.println(" - - - - - - - - - - - - - - - - - - - -");
                System.out.println("Would you like to sell your fish? (y/n)");
                String sell = sc.nextLine(); 
                if(sell.equals("y")){
                    moola += packyback.sellFeesh();
                    System.out.println("You have sold all your fish");
                System.out.println("Your money: $" + moola);
                mainMenu = true;


                }

                else if(sell.equals("n")){
                    mainMenu = true;
                    commandRecognized = true;
                }

                else{
                    commandRecognized = false;
                }
                


            //end bracket for option d should go here (step 1)

            //(step 2) create the else if statement here!

            System.out.println("That command was not recognized.");
            mainMenu = true;

            //(step 2) end bracket should go here


        }

        System.out.println("Congrats, you caught the GimFish and won!");
        System.out.println("Your final score: "+moola);

    }


}