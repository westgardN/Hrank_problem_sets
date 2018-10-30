
 
package guessthenumber;

import java.util.Random;
import java.util.Scanner;



public class GuessTheNumber {
    
    int theNUMBER;
    int max = 100; //the max nnumber that the computer can come up witj
    Scanner scanner = new Scanner(System.in);
    public GuessTheNumber(){
        Random rand = new Random();
        theNUMBER = Math.abs(rand.nextInt() % (max +1)); //random number between 0 and 100
    }
    
    public void play(){
        while(true) {
        int move = scanner.nextInt();
        if(move> theNUMBER){
            System.out.println("Your number is too big");
        }
        else if(move < theNUMBER){
            System.out.println("Your number is too small");
        } else {
            System.out.println("YOU GOT IT!");
        }
    }
    }
    
    
    
//dont have to create an instance to use this
    public static void howBigIsMyNumber(int x) {
        if(x >= 0 && x<= 10){
            System.out.println("Our number is pretty small");
            
        }else if(x >= 11 && x <=100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
         
        }
    
    
    }
    public static void main(String[] args) {
       GuessTheNumber game = new GuessTheNumber();
       System.out.println("Welcome to the game, try to guess a number between 0 and  " + game.max );
       game.play();
    }
    
}
