/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playsafe.game.dao;

/**
 *
 * @author mini-me
 */
 '
public class Player {

	private Vector bets;
	private String playerName;
	
	public Player(String playerName)  {
		bets = new Vector();
		if(playerName==null) playerName="Unknown";	
	}
	
	
	
	public boolean placeBet(short Round, double Bet){
		Vector bet = new Vector();
		bet.add(Round);
		bet.add(Bet);
		
		bets.add(bet);
	}
	
	public Vector getBetsForRound(short Round){
		vector foundItems = 
		for(Vector item : bets){
			
		}
	}
	
}
