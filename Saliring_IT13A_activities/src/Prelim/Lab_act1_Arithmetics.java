/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

/**
 *
 * @author user
 */
public class Lab_act1_Arithmetics {
    public static void main(String[] args){
    
     int first = 10;
     int second = 4;
     int third = 6;
    
     int result1 = (first * second) + third;
     int result2 = (first - second)% third;
     int result3 = (first + second + third) / 3;
     int result4 = first * third;
     int sub1 = result4 - (4 * 4);
    
     System.out.println("(" + first + " * " + second + ") + " + third + " = " + result1);
     System.out.println("(" + first + " - " + second + ") % " + third + " = " + result2);
     System.out.println("(" + first + " + " + second + " + " + third + ") / " + 3 + " = " + result3);
     System.out.println("(" + first + " * " + third + ") - " + 4 + " * " + 4 + " = " + sub1);
    
    }
            
    
}
