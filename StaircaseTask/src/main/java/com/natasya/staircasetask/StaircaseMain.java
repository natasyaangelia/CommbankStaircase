/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natasya.staircasetask;

import java.util.Scanner;

/**
 *
 * @author natasya
 */
public class StaircaseMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
       
        while (input <= 0 || input > 100) {
            System.out.println("Input     :");
            input = scanner.nextInt();
            System.out.println("");
        }
        
        for(int i=0; i<input; i++){
            for(int j=0;j<input; j++){
                if( j < (input-1-i) ){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
}
