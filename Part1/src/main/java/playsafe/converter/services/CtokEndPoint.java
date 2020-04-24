import playsafe.converter.services.ConversionService;
import playsafe.converter.services.BaseEndpoint;

public class CtokEndPoint extends BaseEndpoint {
	
	
	public double HandleComputation(String data)  throws Exception {
		//Converts Celcius to Kelvin
			try{
				
				return  ConversionService.getInstance().Ctok(Double.valueOf(data).doubleValue());
				
			}catch(Exception e){
				
				throw(e);
				
			}


    }
}