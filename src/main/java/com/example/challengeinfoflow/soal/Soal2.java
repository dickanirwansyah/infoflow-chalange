package com.example.challengeinfoflow.soal;

import java.util.Scanner;

/**
 *  @author dickaspring
 *
 */

public class Soal2 {

    public static void main(String[] args){

        System.out.println("masukkan : ");
        Scanner scanner = new Scanner(System.in);
        int masukkan = scanner.nextInt();
        System.out.println("hasil : "+function_angka(masukkan));
    }

    static int function_angka(int inputan){
        int fizz = 3;
        int buzz = 5;

        if (inputan % fizz == 0){
            System.out.println("fizz");
        }else if(inputan % buzz == 0){
            System.out.println("buzz");
        }else {
            System.out.println("fizzbuzz");
        }

        return inputan;
    }
}
