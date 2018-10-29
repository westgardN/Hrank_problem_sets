/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointoss;

import java.util.Random;

/**
 *
 * @author nicolewestgard
 */
public class CoinToss {

    public String tossACoin(){
        //how to get a random number
        Random rand = new Random();
        
        //accesssing the Math class, absolute value of a cetain value
        int toss = Math.abs(rand.nextInt()) %2;//abs of a random next integer--is it divisable by 2, if 0; else 1
        if(toss == 0){
            return "Heads";
        }else{
            return "Tails";
        }
        
        
    }
    
    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
             
    }
    
}
