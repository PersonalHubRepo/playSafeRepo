import playsafe.converter.services.ConversionService;
import playsafe.converter.services.BaseEndpoint;

public class KtocEndPoint extends BaseEndpoint {
	
	
	public String HandleComputation(String data)  throws Exception {
		//Converts Celcius to Kelvin
			try{
				
				return "" + ConversionService.getInstance().KtoC(Double.valueOf(data).doubleValue());
				
			}catch(Exception e){
				
				throw(e);
				
			}
	
    }
}