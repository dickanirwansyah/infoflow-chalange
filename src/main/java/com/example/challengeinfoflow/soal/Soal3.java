package com.example.challengeinfoflow.soal;

import java.util.Scanner;

/**
 *  @author dickaspring
 *
 */

public class Soal3 {

    public static void main(String[] args){
        int angka=1000;
        int a = 13;
        int b = 52;

        /** menentukan angka yang bisa dibagi 13 dan 52 **/
        for (int i=1; i <= angka; i++){
           if (i % a == 0){
               System.out.println("hasil dari 13 : " + i);
           }
        }
        System.out.println("\n");
        for (int ii=1; ii <= angka; ii++){
            if (ii % b == 0){
                System.out.println("hasil dari 52 : "+ii);
            }
        }
    }
}
