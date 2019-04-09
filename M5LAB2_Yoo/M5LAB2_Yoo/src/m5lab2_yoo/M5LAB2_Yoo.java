/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5lab2_yoo;

import java.util.Scanner;

/**
 *
 * @author yoos9177
 */
public class M5LAB2_Yoo {


    public static void main(String[] args) {
       showMenu();
       // Scanner for choice of menu and if for selections
       Scanner keyb = new Scanner(System.in);
       int menuChoice = keyb.nextInt();
       if (menuChoice == 1)
       { greetings();}
       else if (menuChoice == 2)
       { doubleNumber();}
       else if (menuChoice == 3)
       { takeTenPercent(); }
       else if (menuChoice == 4)
       { grossPay (); }
       // else (menuChoice == 5)
    } // main ends here
    
    public static void showMenu() {
        //print menu
        System.out.println ("1. Greetings");
        System.out.println ("2. Double a number");
        System.out.println ("3. Take 10%");
        System.out.println ("4. Gross Pay");
        System.out.println ("5. End program");
        System.out.println ("Choose from 1 to 5: ");
    } // showMenu ends here
    
        
    public static int getInt() {
        Scanner keyb = new Scanner (System.in);
        int num;
        num = keyb.nextInt();
        return num;
    } // getInt ends here
    
    public static double getDouble() {
        Scanner keyb = new Scanner (System.in);
        double dbNum;
        dbNum = keyb.nextDouble();
        return dbNum;
    } // getDouble ends here
    
    
    
    public static void greetings () {
        System.out.println("Hello.");
    } // greetings ends here
    
    public static void doubleNumber(){
        System.out.println("Please enter a number.");
        int num = getInt();
        int dbN = 2;
        int doubleN = (num*dbN);
        System.out.println("Double of selected number is " + doubleN);
    } // doubleNumber ends here
    
    public static void takeTenPercent () {
        System.out.println("Please enter a number.");
        int tpNum = getInt();
        double tP = 0.10;
        double tenPercent = (tpNum*tP);
        System.out.println("Ten perecent of selected number is " + tenPercent);   
    } // takeTenPercent ends here
    
    public static void grossPay () {
        System.out.println("Please enter hours worked.");
        double hourN = getDouble ();
        System.out.println("Next, please enter the pay per hour.");
        double payPh = getDouble ();
        double totalGp = (hourN*payPh);
        System.out.println("Gross pay based on information given is $ " +totalGp);    
    } // grossPay ends here
    
        
} // class main ends here
