import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.EndpointConfig;
import javax.xml.ws.Endpoint;

public abstract class BaseEndPoint extends Endpoint {

   public abstract double HandleComputation(String data) throws Exception;

   
   @Override
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