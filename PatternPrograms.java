package com.programs;

public class PatternPrograms {
    public static void main(String[] args) {
        int n=10;
        //ineuronPattern(n);
        //numberPrinting();
        // house(n);
        //vShapePattern(n);
        leftVShapedPattern(n);
    }
    public static void ineuronPattern(int n){
        // 1.Write a program(WAP) to print INEURON using pattern programming logic.
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){// this loop is for I
                if(i==0 || j==(n-1)/2|| i==n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for(int j=0;j<n;j++){// this is for N
                if(j==0||i==j||j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for (int j = 0; j < n; j++) {// this is for E
                if(j==0||i==0||i==(n-1)/2||i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for(int j=0;j<n;j++){//this is for U
                if(j==0&&i<n-1||i==n-1&&j>0&&j<n-1 ||j==n-1&&i<n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for(int j=0;j<n;j++){//this loop is for R
                if(j==0||i==0&&j<n-1||j==n-1&&i<(n-1)/2||i-j==(n-1)/2-1||i==(n-1)/2&&j<n-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
        for (int j = 0; j < n; j++) {// this is for O
            if(j==0&&i>0&&i<n-1||i==0&&j>0&&j<n-1||j==n-1&&i>0&&i<n-1||i==n-1&&j>0&&j<n-1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
            System.out.print("  ");
        for(int j=0;j<n;j++){// this is for N
            if(j==0||i==j||j==n-1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }

    public static void numberPrinting(){
//        2. Write a program to print
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public static void house(int n){
// 3. WAP to print
// * * * * * * * * * *
// * * * *   * * * * *
// * * *       * * * *
// * *           * * *
// *               * *
// *                 *
// *                 *
// *                 *
// *                 *
// * * * * * * * * * *
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1||i+j<=(n-1)/2&&i<(n-1)/2||j-i>=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void vShapePattern(int n){
// 4. WAP to print
//*                 *
//* *             * *
//* * *         * * *
//* * * *     * * * *
//* * * * * * * * * *
//* * * * * * * * * *

        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(i==n-1||i-j>=(n-1)/2||j==0&&i>=(n-1)/2||i+j>=3*(n-1)/2||j==(n-1)&&i>=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void leftVShapedPattern(int n){
//5. WAP to print
//**********
//****
//***
//**
//*
//*
//**
//***
//****
//**********
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||i+j<=(n-1)/2&&i<=(n-1)/2||i-j>(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
