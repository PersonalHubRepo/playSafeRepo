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

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.EndpointConfig;
import javax.xml.ws.Endpoint;
import javax.websocket.MessageHandler;

public abstract class BaseEndPoint extends Endpoint {

   abstract double HandleComputation(String data) throws Exception;

   public void onOpen(final Session session, EndpointConfig config) {
      session.addMessageHandler(new MessageHandler.Whole<String>() {
 
         @Override
         public void onMessage(String msg) {
			String returnMsg = "Failed to compute.";  
			
            try {
				
               String returnValue = ""+HandleComputation(msg);
			   
            } catch (Exception e) { 
			
				e.printStackTrace();
				
			}
			System.out.println(returnMsg);

         }
      });
   }	
}