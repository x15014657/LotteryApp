/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Deadly Super Combo Cats (Daniel, Sana, Conor, Camelia)
 */
public class LottoApp {

    public static void main(String[] args) {

        // declare variables 
        int lottoNum[];
        int userGuess[][];
        int winNum;
        int winNum1;
        int winNum2;
        String name;

        // create variables
        lottoNum = new int[5];
        userGuess = new int[3][5];
        name = new String();

        // object
        Lotto myLotto = new Lotto();
        AppGUI myAppGUI = new AppGUI();
        myAppGUI.setVisible(true);    
        // input
        name = JOptionPane.showInputDialog(null, "Please enter if 'lotto', 'plus1', or 'plus2'");

        for (int i = 0; i < 5; i++) {
            userGuess[0][i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess number: 1.\nPlease enter digit number "+(i+1)));

        }
        for (int j = 0; j < 5; j++) {
            userGuess[1][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess number: 2.\nPlease enter digit number "+(j+1)));
        }
        for (int k = 0; k < 5; k++) {
            userGuess[2][k] = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess number: 3.\nPlease enter digit number "+(k+1)));
        }

        // set userGuess and name
        myLotto.saveLotto(name, userGuess);

        // compute
        myLotto.compute();

        // output
        winNum = myLotto.getWinNum();
        JOptionPane.showMessageDialog(null, "You have guessed: " + " " + winNum + " number's in line one");

        winNum1 = myLotto.getWinNum1();
        JOptionPane.showMessageDialog(null, "You have guessed: " + " " + winNum1 + " number's in line 2");

        winNum2 = myLotto.getWinNum2();
        JOptionPane.showMessageDialog(null, "You have guessed: " + " " + winNum2 + " number's in line 3");
    }
}
