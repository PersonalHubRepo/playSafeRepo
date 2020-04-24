/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playsafe.converter.managers;

import playsafe.converter.services.ConversionService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author mini-me
 */
public class ConversionManager extends SimpleWebService {
	static ConversionService conversionService=null;

	public static void main(String[] args) {
		
		//Initialize the ConversionService
		conversionService = new ConversionService();
		String address = "http://0.0.0.0:9008/conversions/ctok";
		Endpoint.publish(address, new playsafe.converter.services.CtokEndPoint());
		
		address = "http://0.0.0.0:9008/conversions/ktoc";
		Endpoint.publish(address, new playsafe.converter.services.KtocEndPoint());

		address = "http://0.0.0.0:9008/conversions/ktom";
		Endpoint.publish(address, new playsafe.converter.services.KtomEndPoint());

		address = "http://0.0.0.0:9008/conversions/mtok";
		Endpoint.publish(address, new playsafe.converter.services.MtokEndPoint());

		
	}
	
	public static void destroy(){
		conversionService.stop();
	}

}