/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrater
 */
public class Array { 
    public static void main (String[]args){
        int[][]x = 
        {
            {1,2,3},
            {4,5,6},
            {7,8,9,10},
            {},
            {11}
        };
        //System.out.println("* signifies new line");
        for (int i=0; i<x.length; i++){
            for (int j= 0; j<x[i].length; j++){
                System.out.print(x[i][j]+"");
            }
            System.out.print("\n");
        }
        
    }
}
