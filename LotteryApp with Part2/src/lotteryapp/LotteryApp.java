/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryapp;

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
        
       lottoNum = new int[5];
       userGuess = new int[5];
              
       for(int i = 0; i < 5; i++){
  			userGuess[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number"));
  		}
    }
    
}
