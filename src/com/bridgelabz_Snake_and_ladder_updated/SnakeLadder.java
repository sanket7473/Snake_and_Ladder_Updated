package com.bridgelabz_Snake_and_ladder_updated;
import java.util.Random;
public class SnakeLadder {
    public static void main(String[] args)
    {
        System.out.println("Playing Snake and Ladder");
        System.out.println("Single Player start at 0 position ");  //UC1..single player with start 0
        double DiceCheck = Math.floor(Math.random() * 10) % 3;
        System.out.println("Dicecheck is "+DiceCheck);
        int Is_Ladder=1;
        int Is_Snake=2;
        int NoPlay=0;
        Random random = new Random();
        int min = 1;
        int max = 6;
        int position=0;
        int RollsDie = random.nextInt(max - min + 1) + min;  //UC2 ..To generate a random number between 1 to 6
        position=position+RollsDie;
        int Ladder = random.nextInt(100) + 1;
        System.out.println("Ladder position is: " + Ladder);
        int Snake = random.nextInt(90) + 1;
        System.out.println("Snake position is: " + Snake);
        System.out.println("Dice is : " + RollsDie);
        if(DiceCheck==Is_Ladder)
        {
            position=position+Ladder;
            System.out.println("You got ladder your position is "+position);
        }
        else if(DiceCheck ==Is_Snake)
        {
            position=position - Snake;
        }
        else if(DiceCheck==NoPlay)
        {
            System.out.println("Your position is "+position);
        }
    }
}
