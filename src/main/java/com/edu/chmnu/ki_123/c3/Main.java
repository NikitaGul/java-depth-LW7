package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class Main {
    public static int createNumber(double[] array1){
        Arrays.sort(array1);
        int count = 0;
        if( array1.length == 0){
            return count;
        }
        else {
            double prev = array1[0];

            for (int j = 1; j < array1.length; ++j) {
                if (array1[j] == prev) {
                    ++count;
                }
                prev = array1[j];
            }
            return count;
        }
    }

    public static void main(String[] args) {

        double[] array1 = {2.4, 2.5, 4.6, 5.8, 3.5, 3.7, 7.5, 3.8, 5.7, 5.8};

        int count = createNumber(array1);

        double prev;

        prev = array1[0];

        double[] array2 = new double[array1.length - count];

        array2[0] = array1[0];
        int ind = 1;

        for(int i =  1; i < array1.length; ++i)
        {
            if(array1[i] != prev)
            {
                array2[ind] = array1[i];
                ++ind;
            }
            prev = array1[i];
        }
        System.out.println(Arrays.toString(array2));


    }
}