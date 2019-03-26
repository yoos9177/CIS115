/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5t2_yoo;

import java.util.Scanner;

/**
 *
 * @author yoos9177
 */
public class M5T2_Yoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this program will say hello to the user 
        System.out.println("Hello!");
        
        // then ask for their name 
        String name;
        Scanner keyb = new Scanner (System.in);
        System.out.println("What's your name?");
        name = keyb.next();
        // then ask for their age 
        System.out.println("How old are you?");
        int age = keyb.nextInt(); 
        
        // finally, it will repeat those back
        System.out.println("Nice to meet you, " +name);
        System.out.println("Your age is " +age);
    }
    
}
