package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighscoreWins {
    public static void main(String[] args){

    // Instructions: Prompt the user for a game score and the user will input a score in the following format:
        //Home:Visitor|21:9

        //Hint: You will have to split the user input multiple times
        //- one split will be on the pipe ( | )
        //- one split will be on the colon ( : )

        //create Scanner
        Scanner inputScanner = new Scanner(System.in);
        //display message
        System.out.print("""
                        Please enter the game score such as:
                         Home:Visitor|00:00
                       """ );

        //Read and save the game score (variable), make sure in the reads the while line when you enter it
        String gameScore = inputScanner.nextLine().trim();

        //this code takes the line and breaks it into pieces at the |
        String[] gameParts = gameScore.split(Pattern.quote("|"));

        //
        String teamNames = gameParts[0];
        String teamScores = gameParts[1];

        System.out.println("Team names: " + teamNames);
        System.out.println("Team Scores: " + teamNames);

        // this will split Home:Visitor










    }
}
