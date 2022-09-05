/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr10programming_execrises;

import javax.swing.JOptionPane;

/**
 *
 * @author 24ronhen
 */
public class Reverse {
     public static void main(String[] args) {
        
          int num = Integer.parseInt(JOptionPane.showInputDialog("the number to be reversed"));
          int rem = num %10;
          int tens = num - rem;
          int reversenum1 = num /10;
          int replace = rem * 10;
          int finish = replace + reversenum1;
          
          int add = finish + num;
          
          System.out.print("here is the orignal" + num);
          System.out.print("here is the reverse" + finish);
          System.out.print("here is sum of them both" + add);
          
          
    }
    
}
