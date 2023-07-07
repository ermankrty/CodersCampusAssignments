package com.coderscampus.assignments;

import java.util.Scanner;
import java.util.Random;

public class Assignment2 {
	
   public static void main(String args[]) {
       
	   int guessNum, randNum, chance = 5;
       
       Random random = new Random();
       
       randNum = random.nextInt(100) + 1;
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Pick a number between 1 and 100");
       
       while (chance > 0) {
       	
           guessNum = scanner.nextInt();
           System.out.println(randNum);
       
           if (guessNum < 1 || guessNum > 100) {
           	
               System.out.println("Your guess is not between 1 and 100, please try again");
               continue;
              
           									   }
           if (guessNum > randNum) {
           	
               System.out.println("Please pick a lower number");
              
           						   }
          
           else if (guessNum < randNum) {
           	
               System.out.println("Please pick a higher number");
              
           								}
          
           else {
           	
               System.out.println("You win!");
               break;
           		}
           chance--;
          
       						}
       if (chance == 0) {
       	
           System.out.println("Game over! The number to guess was: " + randNum);
      					}
       scanner.close();
   											}											
							}

