package net.lari;
import java.util.Random;


public class DieLogic {
    String die;

    public String result;

    public DieLogic(String die){
        this.die = die;

        if (checkString()){
            String[] dice = die.split("d");
            int diceResult = rollDice(Integer.parseInt(dice[0]), Integer.parseInt(dice[1]));
            result = "You rolled "+dice[0] +"d"+ dice[1] + " | RESULT: "+ diceResult;
        }
        else {
            result = "Please roll valid dice (eg. 1d20)";
        }

    }

    public DieLogic(){
        this("1d20");
    }

    private boolean checkString(){
        return die.matches("[0-9]+d[0-9]+");
    }

    private int rollDice(int diceNumber, int eyes){
        int randomSum = 0;
        while(diceNumber > 0){
            int randomNumber = new Random().nextInt(eyes) + 1;
            randomSum += randomNumber;
            diceNumber -= 1;
        }
        return randomSum;
    }
}
