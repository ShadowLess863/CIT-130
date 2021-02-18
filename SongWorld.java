/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author lanek
 */
public class SongWorld {
    
public static void testLyricMachine(){
    //makes new lyric machine scenerio 
       LyricMachine lm = new LyricMachine();
        lm.initializeArray(5, 4);
        lm.readInLyrics();
        lm.displayLyrics(); 
    }//close lyricmachine
public static void testLyricLine(){
    // makes new instance of lyricline
    LyricLine linetest1 = new LyricLine();
    linetest1.lineText = "This how you start, right here look";
   
    
    LyricLine linetest2 = new LyricLine("I be slidin round with my firearm, i gotta keep a weapon", 4000);
    displayLyricLineInfo(linetest2);
    }//close lyricline

public static void buildLyricLineArray(){
    LyricLine[] superLyrics = new LyricLine[3];
    superLyrics[0] = new LyricLine("I be ridin round everywhere i doubt one of yall the ******* to test me", 4000);
    superLyrics[1] = new LyricLine("I keep on driving round got me going through all these transgressions", 4800);
    superLyrics[2] = new LyricLine("foolin round wont let me see my blessing", 5000);
    superLyrics[3] = new LyricLine("I be slidin round with my firearm, i gotta keep a weapon", 5001);
    superLyrics[4] = new LyricLine("I did everything the streets told me it was cool to do", 6000);
    superLyrics[5] = new LyricLine("now id rather prove it to myself before i prove to you", 6100);
    superLyrics[6] = new LyricLine("ill never tell put me in jail put me in any dorm", 6200);
    superLyrics[7] = new LyricLine("and i can make it through whatever i weather any storm", 6298);
    karaokeSimulation(superLyrics);
}//close buildlyriclinearray
public static void karaokeSimulation(LyricLine[] kTape){
    Scanner scan = new Scanner(System.in);
    String wait = scan.nextLine();
    
    for(int line = 0; line < kTape.length; line++){
        System.out.println(kTape[line]);
        LyricLine templine = kTape[line];
        try{
        Thread.sleep(templine.timeToDisplayMilli);
        }catch(InterruptedException ex){
            
        }//closecatch
    }//close for
}//close the karaoke

private static void displayLyricLineInfo(LyricLine line){
    System.out.println(line.lineText);
    System.out.println("Time to display: " + line.timeToDisplayMilli);
    }//close utility 
}//close class
