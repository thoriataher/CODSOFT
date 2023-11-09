package com.game;

import java.util.Scanner;


    public class Game{
        public static void guessingNumberGame() {

            Scanner sc = new Scanner(System.in);   //Take num form the user
            boolean playAgain ;

            do{
                int random = 1 + (int) (100 * Math.random());//Generate numbers from 1 to 100
                int maxTrails = 5;
                int trials=0;
                int score = 0;

                System.out.println("A number is chosen between 1 to 100, within 5 trials.");
                System.out.println("Enter your guess :");
               while (trials < maxTrails) {
                    int guessNum = sc.nextInt();
                    trials++;
                    if (guessNum == random) {
                        score++;
                        System.out.println("Coreect! ,It tooks You " + (trials) + " trials.");
                        break;

                    } else if (guessNum > random ) {
                        System.out.println("trial" + (trials) + ": Your Guessing is high");
                    } else  {
                        System.out.println("trial" + (trials) + ": Your Guessing is low");
                    }
                }
                    if(trials > maxTrails-1){
                        System.out.println("You ran out of trials! " + "the number was " + random);
                    }
            System.out.println("Do you want to play again? (true/false)");
           playAgain = sc.nextBoolean();
        } while (playAgain);
        }

        public static void main(String[] args) {
            //Calling function
            guessingNumberGame();


            }
        }





