/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.final1;

/**
 *
 * @author zongruitong
 */
public class Final1 {

    public static void main(String[] args) {
       
      
        
        int sum=0; //set sum at first as 0
        int n=0;    //n is the number we want to add
        
         while(n<100)    //as long as n<100 keep repeating
         { 
            
             n+=1;       //n=n+1, each time n increased by 1 util reach 100
             sum+=n;     //sum=sum+n
             
            
         }    
                         
            
            
         System.out.println("the sum of 1 to 100 is "+sum); 
             
           
    }
}
