/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoapp;

/**
 *
 * @author Deadly Super Combo Cats (Dany, Sana, Conor, Camelia)
 */
import javax.swing.JOptionPane;

public class LottoApp {

    public static void main(String[] args) {

        // declare variables 
        int lottoNum[];
        int userGuess[][];
        int winNum;
        int winNum1;
        int winNum2;

        // create variables
        lottoNum = new int[5];
        userGuess = new int[3][5];

        // object
        Lotto myLotto = new Lotto();

        // input
        for (int i = 0; i < 5; i++) {
            userGuess[0][i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your first line"));
            
        }
            for (int j = 0; j < 5; j++) {
                 userGuess[1][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your second line"));
            }
                for (int k = 0; k < 5; k++) {
                    userGuess[2][k] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your third line"));  
                }
      
       
        // set userGuess
        myLotto.setUserGuess(userGuess);
        
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
