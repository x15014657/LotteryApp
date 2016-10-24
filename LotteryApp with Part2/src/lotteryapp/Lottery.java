/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryapp;

/**
 *
 * @author Conor
 */
public class Lottery {

    private int lottoNum[];
    private int userGuess[];
    private int count;

    //constructor
    public Lottery() {
        lottoNum = new int[5];
        for (int i = 0; i < 5; i++) {
            lottoNum[i] = (int) (Math.random() * 50);
        }
        userGuess = new int[5];
        count = 0;
    }

    public void setLottoNum(int[] lottoNum) {
        this.lottoNum = lottoNum;
    }

    public void setUserGuess(int[] userGuess) {
        this.userGuess = userGuess;
    }

    public void compute() {
        for (int i = 0; i < 5; i++) {
            if (userGuess[i] == lottoNum[0] || userGuess[i] == lottoNum[1] || userGuess[i] == lottoNum[2] || userGuess[i] == lottoNum[3] || userGuess[i] == lottoNum[4]) {
                count++;
            }
        }

    }

    public int[] getUserGuess() {
        return userGuess;
    }

    public int[] getLottoNum() {
        return lottoNum;
    }

    public int getCount() {
        return count;
    }

    

}
