/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package water.and.computer.manufacturing;

import java.util.Scanner;

/**
 * Nicolas Lei
 * October 3,2018
 * To display how mush water you need to manufacture your computers and monitors
 */
public class WaterAndComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int num1;
        double num2,TOW;
        num2 = 1.5;
        
        //Find out how many TONS of water you need to Manufacture your computer and monitors
        System.out.println("Enter how many computer and monitor do you have");
        num1 = keyedInput.nextInt();
        TOW = num1 * num2;
        System.out.println("It takes " + TOW + " tons of water to manufacture your computer and monitors");
    }
    
}