package com.bridgelabz_Snake_and_ladder_updated;
import java.util.Random;
public class SnakeLadder {
    public static void main(String[] args)
    {
        System.out.println("Playing Snake and Ladder");
        System.out.println("Single Player start at 0 position ");  //UC1..single player with start 0
        Random random = new Random();
        int min = 1;
        int max = 6;
        int RollsDie = random.nextInt(max - min + 1) + min;  //UC2 ..To generate a random number between 1 to 6
        System.out.println("Random number between 1 and 6: " + RollsDie);
    }
}
