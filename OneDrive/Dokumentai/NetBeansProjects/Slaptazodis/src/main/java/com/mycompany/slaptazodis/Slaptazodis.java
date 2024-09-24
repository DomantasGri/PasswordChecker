package com.mycompany.slaptazodis;

import java.util.Scanner;

public class Slaptazodis {

    public static void main(String[] args) {
        System.out.println("To have a strong password, your password must contain a special letter and a number");
        System.out.println("Please enter your password");
        Scanner obj = new Scanner(System.in);
        String slaptazodis = obj.nextLine();
        while(!passwordChecker(slaptazodis)){
            System.out.println("the password is weak enter a new one");
            slaptazodis = obj.nextLine();
            passwordChecker(slaptazodis);
        }
        System.out.println("Strong password");
    }
    
    static boolean passwordChecker(String pass) {
        boolean containsSpecialChar = false;
        
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                containsSpecialChar = true;
            }
        }
        if (!containsSpecialChar) {
            return false;

            
        } else {
            return true;
        }
    }
    
}
