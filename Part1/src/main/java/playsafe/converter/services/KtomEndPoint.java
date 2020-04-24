import playsafe.converter.services.ConversionService;
import playsafe.converter.services.BaseEndpoint;

public class KtomEndPoint extends BaseEndpoint {
	
	
	public String HandleComputation(String data)  throws Exception  {
		//Converts Kilometers to Miles
			try{
				
				return "" + ConversionService.getInstance().KtoM(Double.valueOf(data).doubleValue());
				
			}catch(Exception e){
				
				throw(e);
				
			}
		
    }
}