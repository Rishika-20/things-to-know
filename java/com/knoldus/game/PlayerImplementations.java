package com.knoldus.game;

public class PlayerImplementations
 {

    public static void main(String[] args)
    {
        Player playerOne = new Player("Riddhi", 100, 2);
        Player playerTwo = new Player("Siddhi", 200, 1);
        System.out.println(playerOne.getName() + " scored " + playerOne.getScore() +
                " on level " + playerOne.getLevel()); System.out.println(playerTwo.getName() +
                " scored " + playerTwo.getScore() + " on level " + playerTwo.getLevel());
    }
 }


