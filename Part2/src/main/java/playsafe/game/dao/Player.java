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
	private final static BET_ROUND=0,BET_AMOUNT=1,BET_MADE=2,BET_RESULT=3;
	
	public Player(String playerName)  {
		bets = new Vector();
		if(playerName==null) playerName="Unknown";	
	}
	
	
	
	public boolean placeBet(short Round, double Bet, short BetMade, boolean BetResult){
		Vector bet = new Vector();
		bet.add(Round);
		bet.add(Bet);
		bet.add(BetMade);
		bet.add(BetResult);
		
		bets.add(bet);
	}
	
	public Vector getBetsForRound(short Round){
		Vector foundItems = new Vector();
		for(Vector item : bets){
			if(((short)item.get(BET_ROUND))==Round){
				foundItems.add(item);
			}
		}
		
		return foundItems;
	}
	
	public Vector getTotalWinsForRound(short Round){
		Vector foundBets = this.getBetsForRound(Round);
		double totalBetsWon = 0.0;
		
		for(Vector item : foundBets){
			if(((boolean)item.get(BET_RESULT))==true) totalBetsWon += ((short)item.get(BET_AMOUNT))
		}
		
		return totalBetsWon;
	}
	
	
	
}
