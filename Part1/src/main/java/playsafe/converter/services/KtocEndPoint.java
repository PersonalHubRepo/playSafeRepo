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

public class KtocEndPoint extends BaseEndPoint {
	
	
	public String HandleComputation(String data)  throws Exception {
		//Converts Celcius to Kelvin
			try{
				
				return "" + ConversionService.KtoC(Double.valueOf(data).doubleValue());
				
			}catch(Exception e){
				
				throw(e);
				
			}
	
    }
}