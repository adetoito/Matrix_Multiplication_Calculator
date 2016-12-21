package com.company;

public class Main {

    /*
    MATRIX MULTIPLICATION CALCULATOR
    by Argen and CJ
     */

    public static void main(String[] args) {
        //unnecessaryMusic.playMusicByCJAndArgen();

        int [][] a = {{1, 2, -2, 0},
                      {-3, 4, 7, 2},
                      {6, 0, 3, 1}};
        int [][] b = {{-1, 3},
                      {0, 9},
                      {1, -11},
                      {4, -5}};
        int [][] result = MatrixMult.multiplicar(a, b);
    }
}
