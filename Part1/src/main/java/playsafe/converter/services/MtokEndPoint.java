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

public class MtokEndPoint extends BaseEndPoint {
	
	
	public double HandleComputation(String data) throws Exception {
		//Converts Miles to Kilometers
			try{
				
				return ConversionService.Mtok(Double.valueOf(data).doubleValue());
				
			}catch(Exception e){
				
				throw e;
				
			}

    }
}