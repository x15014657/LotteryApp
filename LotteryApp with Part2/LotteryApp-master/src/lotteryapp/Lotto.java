/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryapp;

import java.util.ArrayList;

/**
 *
 * @authors Deadly Super Combo Cats (Daniel, Sana, Conor, Camelia)
 */
public class Lotto {

    //declare 1D arrays of integers
    private ArrayList<Lotto> aList;
    private String name;
    private int lottoNum[];
    private int lottoNum1[];
    private int lottoNum2[];
    private int lottoNum3[];
    private int userGuess[][];
    private int winNum;
    private int winNum1;
    private int winNum2;

    // constructor 
    public Lotto() {
        aList = new ArrayList<>();
        name = new String();
        lottoNum = new int[5];
        lottoNum1 = new int[5];
        lottoNum2 = new int[5];
        lottoNum3 = new int[5];

        userGuess = new int[3][5];
        winNum = 0;
        winNum1 = 0;
        winNum2 = 0;

        for (int i = 0; i < 5; i++) {
            lottoNum1[i] = (int) (Math.random() * 50 + 1);
            System.out.println("lotto num in lotto are:" + lottoNum1[i]);
        }

        for (int i = 0; i < 5; i++) {
            lottoNum2[i] = (int) (Math.random() * 50 + 1);
            System.out.println("lotto num in plus1 are:" + lottoNum2[i]);
        }

        for (int i = 0; i < 5; i++) {
            lottoNum3[i] = (int) (Math.random() * 50 + 1);
            System.out.println("lotto num in plus2 are:" + lottoNum3[i]);
        }
    }

    public void saveLotto(String name, int userGuess[][]) {
        this.name = name;
        this.userGuess = userGuess;

        aList.add(this);
    }

    // compute
    public void compute() {

        if (name.equals("lotto")) {
            lottoNum = lottoNum1;
        } else if (name.equals("plus1")) {
            lottoNum = lottoNum2;
        } else if (name.equals("plus2")) {
            lottoNum = lottoNum3;
        }

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
