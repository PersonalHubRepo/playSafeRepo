import playsafe.converter.services.ConversionService;
import playsafe.converter.services.BaseEndpoint;

public class MtokEndPoint extends BaseEndpoint {
	
	
	public double HandleComputation(String data) throws Exception {
		//Converts Miles to Kilometers
			try{
				
				return ConversionService.getInstance().Mtok(Double.valueOf(data).doubleValue());
				
			}catch(Exception e){
				
				throw e;
				
			}

    }
}