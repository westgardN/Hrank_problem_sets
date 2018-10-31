/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppractice;

/**
 *
 * @author nicolewestgard
 */
public class LoopPractice {

    //instance function
    public static void practiceWhileLoop(){ //static so we dont have to creat another instatnce
        int x = 0;
        while(x < 5){//if x is less than 5, print out
            System.out.println("The value of x is " + x);
            x++;
            //x = x+1;
            //when x > 5 it will brak out of the while loop
        }
    }
    
    public static void practiceDoWhileLoop(){
        int x = 0;//local vaiable
        
        do{ //keep printing if the value is less that 10, increment by 1
            System.out.println("The value of x is " + x);
            x++;
        }while(x < 10);
    }
    
    public static void practiceForLoopDec(){
        for(int x = 10; x > 0; x--){
            System.out.println("The value of x is " + x);
          
      
        }
        System.out.println("This is the end. ");//executes once then exits
    }
    
    public static void practiceForLoopInc(){
        for(int x = 0; x < 20; x++){
            System.out.println("The value of x is " + x);
            //if(x ==10){//continously checked up to 10
              //  break;
      
        }
        System.out.println("This is the end. ");//executes once then exits
    }
    
    public static void practiceForLoopNested(){
        for(int x = 0; x < 10; x++){ //x is 0, then execute nested loop
            
            for(int y = 0; y <10; y++) { //y goes first, continues through the loop then kicks out to outer loop
                System.out.println("("+x+", "+y+")");
            }       
        }
        
    }
        
   
    public static void main(String[] args) {
        practiceForLoopNested();
    }
}
