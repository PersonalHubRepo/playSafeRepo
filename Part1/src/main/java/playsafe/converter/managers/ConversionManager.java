/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playsafe.converter.managers;

import playsafe.converter.services.*;
import javax.xml.ws.Endpoint;
import javax.jws.WebService;
/**
 *
 * @author mini-me
 */
public class ConversionManager extends WebService {


	public static void main(String[] args) {
		
		//Initialize the ConversionService

		String address = "http://0.0.0.0:9008/conversions/ctok";
		Endpoint.publish(address, new CtokEndPoint());
		
		address = "http://0.0.0.0:9008/conversions/ktoc";
		Endpoint.publish(address, new KtocEndPoint());

		address = "http://0.0.0.0:9008/conversions/ktom";
		Endpoint.publish(address, new KtomEndPoint());

		address = "http://0.0.0.0:9008/conversions/mtok";
		Endpoint.publish(address, new MtokEndPoint());

		
	}

}