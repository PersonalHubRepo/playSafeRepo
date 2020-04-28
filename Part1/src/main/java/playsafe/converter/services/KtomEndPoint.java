/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playsafe.converter.services;

/**
 *
 * @author mini-me
 */

public class KtomEndPoint extends BaseEndPoint {
	
	
	public String HandleComputation(String data)  throws Exception  {
		//Converts Kilometers to Miles
			try{
				
				return "" + ConversionService.KtoM(Double.valueOf(data).doubleValue());
				
			}catch(Exception e){
				
				throw(e);
				
			}
		
    }
}