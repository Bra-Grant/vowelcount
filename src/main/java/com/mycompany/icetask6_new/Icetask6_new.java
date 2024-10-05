/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask6_new;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Icetask6_new {

    public class VowelCounter {
    
    // Function to count vowels
    public static int countVowels(String sentence) {
        // Convert the sentence to lowercase
        sentence = sentence.toLowerCase();
        // Variable to store the number of vowels
        int vowelCount = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            // Get the character at the current index
            char currentChar = sentence.charAt(i);
            
            // Check if the character is a vowel using indexOf
            if ("aeiou".indexOf(currentChar) != -1) {
                vowelCount++; 
            }
        }
        return vowelCount; 
    }
        
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        // Scanner to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        
        // Call the countVowels function and display the result
        int numVowels = countVowels(sentence);
        System.out.println("The number of vowels in the sentence is: " + numVowels);
    }
}
}
