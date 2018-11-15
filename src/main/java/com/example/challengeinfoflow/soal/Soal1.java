package com.example.challengeinfoflow.soal;

import java.util.Scanner;

/**
 *  @author dickaspring
 *
 */

public class Soal1 {

    public static void main(String[] args){

        /** misalnya masukan angka 5 **/
        System.out.println("masukkan angka : ");
        Scanner scanner = new Scanner(System.in);
        int inputan = scanner.nextInt();
        function_factorial(inputan);
    }

    static int function_factorial(int inputan){

        /**
        if (inputan == 1){
            return 1;
        }else if (inputan == 2){
            return 2;
        }
         **/

        int i, fact = 1;
        for (i=1; i <=inputan; i++){
            fact=fact*i;
        }
        System.out.println("faktorial dari "+inputan+" adalah : "+fact);
        return fact;
    }

}
