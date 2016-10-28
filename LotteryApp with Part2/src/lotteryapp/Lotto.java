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
    private String name;
    private int lottoNumLotto[];
    private int lottoNumPlus1[];
    private int lottoNumPlus2[];
    private int userGuess[];
    private int winNumLotto;
    private int winNumPlus1;
    private int winNumPlus2;

    public Lotto() {
        this.name="";
        this.lottoNumLotto= new int[5];
        this.lottoNumPlus1= new int[5];
        this.lottoNumPlus2= new int[5];
        this.userGuess= new int[5];
        this.winNumLotto=0;
        this.winNumPlus1=0;
        this.winNumPlus2=0;
    }

    public Lotto(String name, int[] lottoNumLotto, int[] lottoNumPlus1, int[] lottoNumPlus2, int[] userGuess, int winNumLotto, int winNumPlus1, int winNumPlus2) {
        this.name = name;
        this.lottoNumLotto = lottoNumLotto;
        this.lottoNumPlus1 = lottoNumPlus1;
        this.lottoNumPlus2 = lottoNumPlus2;
        this.userGuess = userGuess;
        this.winNumLotto = winNumLotto;
        this.winNumPlus1 = winNumPlus1;
        this.winNumPlus2 = winNumPlus2;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getLottoNumLotto() {
        return lottoNumLotto;
    }

    public void setLottoNumLotto(int[] lottoNumLotto) {
        this.lottoNumLotto = lottoNumLotto;
    }

    public int[] getLottoNumPlus1() {
        return lottoNumPlus1;
    }

    public void setLottoNumPlus1(int[] lottoNumPlus1) {
        this.lottoNumPlus1 = lottoNumPlus1;
    }

    public int[] getLottoNumPlus2() {
        return lottoNumPlus2;
    }

    public void setLottoNumPlus2(int[] lottoNumPlus2) {
        this.lottoNumPlus2 = lottoNumPlus2;
    }

    public int[] getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(int[] userGuess) {
        this.userGuess = userGuess;
    }

    public int getWinNumLotto() {
        return winNumLotto;
    }

    public int getWinNumPlus1() {
        return winNumPlus1;
    }

    public int getWinNumPlus2() {
        return winNumPlus2;
    }

    public void compute(){
        
    }
    
    
    

}
    /*// constructor 
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
*/