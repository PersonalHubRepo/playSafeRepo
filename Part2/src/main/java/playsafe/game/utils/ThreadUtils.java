/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playsafe.game.utils;

/**
 *
 * @author mini-me
 */
 
 public class ThreadUtils {
 
	public static void sleep(float milliSeconds){
		
		try{Thread.getCurrentThread().sleep(100)}catch(Exception e){}
		
	}

 }