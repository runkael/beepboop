package Fishkit;

public class Questions {

    String[] mathQuestions = {"1 + 1", "2 + 2", "3 + 3", "4 + 4", "5 + 5", "6 + 6", "7 + 7", "8 + 8", "9 + 9", "10 + 10", "2 + 3", " 4 + 5", "7 + 3", "6 + 2", "9 + 4", "5 + 7", "8 + 4", "3 + 22"};
    String[] Answers = {"2", "4", "6", "8", "10", "12", "14", "16", "19", "20", "5", "9", "10", "8", "13", "12", "12", "25"};
    
    public Questions(){

    }

    public String getmathQuestions(int i){
        return mathQuestions[i];
    } 

    public String getAnswers(int i){
        return Answers[i]; 
    }

   
}


