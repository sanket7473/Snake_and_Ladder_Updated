package com.bridgelabz_Snake_and_ladder_updated;
import java.util.Random;
public class SnakeLadder {
    public static final int Is_Ladder = 0;
    public static final int Is_Snake = 1;
    public static final int NoPlay = 2;
    public static void main(String[] args)
    {
        int position = 0;

        System.out.println("Playing Snake and Ladder");
        System.out.println("Single Player start at 0 position ");  //UC1..single player with start 0

        int player1_position = 0; //starting position of two player
        int player2_position = 0;
        int winning_position = 100;

        // UC4: While loop is used to repeat the player position till 100.
        while (player1_position < winning_position) {
            Random random = new Random();
            //UC3:Check for options Noplay,Ladder or Snake using random to generate 3 random numbers.
            int DiceCheck = random.nextInt(3);
            //
            int RollsDie = (int) Math.floor(Math.random() * 10) % 7;
            switch (DiceCheck) {
//
                case Is_Snake  :
                    System.out.println("plaer_1 value is " + player1_position);
                    player1_position = player1_position - RollsDie; //Move the player forward by a random number 1-6 if ladder
                    System.out.println("Snake value is " + RollsDie + " Player position moved to " + player1_position);
                    break;
                case Is_Ladder:
                    player1_position = player1_position + RollsDie; //Move the player forward by a random number 1-6 if ladder
                    System.out.println("ladder value is " + RollsDie + " Player position moved to " + player1_position);
                    break;
                case NoPlay:
                    System.out.println("Player 1 has not got ladder and snake " + player1_position);
            }
            //UC4:player position below zero and above winning position
            if (player1_position < 0) {
                player1_position = 0;   //player position below zero then player restarts from zero only
            }
            else if (player1_position > winning_position) //UC4:beyond winning position then player_position is assigned 100
            {
                player1_position = winning_position;
            }
            System.out.println("Player1 rolled the dice : " + RollsDie + " and moved to position : " + player1_position);

        }

    }
}
