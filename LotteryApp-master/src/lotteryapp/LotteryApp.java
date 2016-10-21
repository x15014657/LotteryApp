/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryapp;

import java.util.Arrays;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Conor
 */
public class LotteryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int userGuess[];
        int lottoNum[];
        int showNumb;
        int guess[] = new int[5];

        lottoNum = new int[5];
        userGuess = new int[5];

        System.out.println("First s numbers");
        for (int i = 0; i < guess.length; i++) {
            guess[i] = (int) (Math.random() * 40);
            
            System.out.println(guess[i]);
        }//i for loop
        System.out.println("Second s numbers");
        for (int j = 0; j < guess.length; j++) {
            System.out.println(guess[j]);
        }//j for loop
        System.out.println("Third s numbers");
        for (int h = 0; h < guess.length; h++) {
            System.out.println(guess[h]);
        }//h for loop
        if (userGuess == guess) {
            System.out.println("Man/Mam you are Something.");
        }
        for (int i = 0; i < 5; i++) {
            userGuess[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number"));
        }//user enters 5 numbers
        showNumb = Integer.parseInt(JOptionPane.showInputDialog(null, "Your numbers are " + Arrays.toString(userGuess)));
    }//printing user's 5 numbers

}
