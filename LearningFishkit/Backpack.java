package LearningFishkit;

public class Backpack {
    
    //empty backpack
    private int fishIndex = 0;
    private int sellPacky;
    String[] fish = new String[10];
    int[] worth = new int[10];
    
    // add fish
    public void addFeesh(String n, int w){
        fish[fishIndex] = n;
        worth[fishIndex] = w;
        fishIndex += 1;
     //   System.out.println(fishIndex);
    }
     // sell fish
    public int sellFeesh(){
        sellPacky = 0;
        for(int i = 0; i < fish.length; i++){
            sellPacky += worth[i];
            fish[i] = "";
            worth[i] = 0;
            fishIndex -= 1;
            System.out.println(fishIndex);
        }
        return sellPacky;
    }

    public int getFishIndex(){
        return fishIndex;
        
    }
}
