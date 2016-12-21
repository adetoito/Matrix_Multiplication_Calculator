package com.company;

public class MatrixMult {

    public static int [][] mult (int [][] a, int [][] b) {

        /*
        {1, 2, -2, 0}   {-1, 3}
        {-3, 4, 7, 2}   {0, 9}
        {6, 0, 3, 1}    {1, -11}
                        {4, -5}

         3x4            4x2

         {X, X}
         {X, X}
         {X, X}
         */

        int [][] c = {{0, 0}, {0, 0}, {0, 0}};
        for (int h = 0; h < a.length; h++) {
            for (int i = 0; i < a.length; i++) { //a.length is 3
                for (int j = 0; j < b[i].length; j++) { //b[i].length is always 2.
                    // 2, 1
                    // System.out.println("Location: " + i + ", " + j + " Lengths: " + a.length + " " + b[i].length);
                    c[i][j] += a[i][h] * b[h][j];
                }
            }
        }


        return c;
    }

    // Thanks Fernando.
    // ~Argen

}
