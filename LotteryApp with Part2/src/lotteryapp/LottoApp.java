/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Deadly Super Combo Cats (Daniel, Sana, Conor, Camelia)
 */
public class LottoApp {

    public static void main(String[] args) {

        // declare variables 
        int userGuess[];
        String name;
        int winNumLotto;
        int winNumPlus1;
        int winNumPlus2;

        // create variables
        userGuess = new int[5];

        // object
        ArrayList<Lotto> Lottos = new ArrayList<>();
        Lotto a = new Lotto();

        // input
        name = JOptionPane.showInputDialog(null, "Please enter if 'lotto', 'plus1', or 'plus2'");

        for (int i = 0; i < 5; i++) {
            userGuess[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess number: 1.\nPlease enter digit number " + (i + 1)));
        }

        // set userGuess and name
        a.setName(name);
        a.setUserGuess(userGuess);

        //Add to ArrayList
        Lottos.add(a);
        
        //compute method
        Lotto.compute();

        // output
        //for (int i = 0; i < Lottos.size(); i++) {
            //a = Lottos.get(i);
            JOptionPane.showMessageDialog(null, "You have guessed: "+ a.getWinNumLotto() + " numbers in lotto");
            JOptionPane.showMessageDialog(null, "You have guessed: "+ a.getWinNumPlus1() + " numbers in lotto plus1");
            JOptionPane.showMessageDialog(null, "You have guessed: "+ a.getWinNumPlus2() + " numbers in lotto plus2");
        //}
    }
}
