/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playsafe.game.managers;

/**
 *
 * @author mini-me
 */
 
import playsafe.game.utils.FileUtils;
 
public class RoundManager extends Thread {
	
	private static String baseFilePath="./";
	
	private static Vector messages = new Vector();
	private static self;
	
	public static void main(String args[]){
		
		if(self==null){
			self = new RoundManager();
			self.start();
		}		
	}
	
	public RoundManager {
			//create/read players from file
			
			Vector players = FileUtils.readFileIntoVector(baseFilePath+"players.data");
			
			if(players.size()>0){
					echoText("Players loaded ( "+players.size()+" )  : ");
					for(String playerName : players ){
						echoText(""+playerName);
					}
					echoTextFlush();
			}else{
				echoText("No Players could be found");
			}
	
			
	}
	
	@Override
	public void run(){
		while(true){
			//rest for a second
			ThreadUtils.sleep(1000);
			//static to add
			//cast new no
		}			
	}
	
	public static void echoText(String text){
	
		synchronized(messages){
			messages.add(text+"\r\n");
		}
			
		if(messages.size()>10){ //flush buffer
			echoFlushText();
		}
	
	}
	
	public static echoFlushText(){
			
			synchronized(messages){
				while(messages.size()>10){
					System.out.println(messages.get(0));
					message.removeElementAt(0);
					ThreadUtils.sleep(100);
				}
			}
			
	}
}
