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
public class Lotto {

    //declare 1D arrays of integers
    private int lottoNum[];
    private int userGuess[][];
    private int winNum;
    private int winNum1;
    private int winNum2;

    // constructor 
    public Lotto() {
        lottoNum = new int[5];
        for (int i = 0; i < 5; i++) {
            lottoNum[i] = (int) (Math.random() * 50 + 1);
            System.out.println("lotto num are:" + lottoNum[i]);
        }

        userGuess = new int[3][5];
        winNum = 0;
        winNum1 = 0;
        winNum2 = 0;
    }

    public void setUserGuess(int userGuess[][]) {
        this.userGuess = userGuess;
    }
    // compute

    public void compute() {
        for (int i = 0; i < 5; i++) {
            if (lottoNum[i] == userGuess[0][0] || lottoNum[i] == userGuess[0][1] || lottoNum[i] == userGuess[0][2] || lottoNum[i] == userGuess[0][3] || lottoNum[i] == userGuess[0][4]) {
                winNum++;
            }
        }
        for (int j = 0; j < 5; j++) {
            if (lottoNum[j] == userGuess[1][0] || lottoNum[j] == userGuess[1][1] || lottoNum[j] == userGuess[1][2] || lottoNum[j] == userGuess[1][3] || lottoNum[j] == userGuess[1][4]) {
                winNum1++;
            }
        }
        for (int k = 0; k < 5; k++) {
            if (lottoNum[k] == userGuess[2][0] || lottoNum[k] == userGuess[2][1] || lottoNum[k] == userGuess[2][2] || lottoNum[k] == userGuess[2][3] || lottoNum[k] == userGuess[2][4]) {
                winNum2++;
            }
        }
    }


   

// get method

public int getWinNum() {
        return winNum;
    }

    public int getWinNum1() {
        return winNum1;
    }

    public int getWinNum2() {
        return winNum2;
    }

}
