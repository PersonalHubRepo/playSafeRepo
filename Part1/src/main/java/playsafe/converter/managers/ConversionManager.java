/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playsafe.converter.managers;

import playsafe.converter.services.ConversionService;
import playsafe.converter.services.CtokEndPoint;
import playsafe.converter.services.KtocEndPoint;
import playsafe.converter.services.KtomEndPoint;
import playsafe.converter.services.MtokEndPoint;
import javax.websocket.server.ServerEndpointConfig;

/**
 *
 * @author mini-me
 */
public class ConversionManager extends SimpleWebService {
	ConversionService conversionService=null;

	public static void main(String[] args) {
		
		//Initialize the ConversionService
		conversionService = new ConversionService();
		String address = "http://0.0.0.0:9008/conversions/";
		Endpoint.publish(address, implementor);
		
		ServerEndpointConfig.Builder.create(CtokEndPoint.class, "/ctok").build();
		ServerEndpointConfig.Builder.create(KtocEndPoint.class, "/ktoc").build();
		ServerEndpointConfig.Builder.create(KtomEndPoint.class, "/ktom").build();
		ServerEndpointConfig.Builder.create(MtokEndPoint.class, "/mtok").build();
		
	}
	
	public static void destroy(){
		conversionService.stop();
	}

}