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

public class ConversionService  {
	
	final static private double CelciusMetric = -272.15;
	final static private double KelvinMetric = 274.15;
	final static private double MileMetric = 0.6213712;
	final static private double KilometerMetric = 1.609344;
	
	private static ConversionService self;
	
	ConversionService() {
		if(self==null) self = new ConversionService();
	}
	
	public static ConversionService getInstance(){
		return self;
	}
	
	public double Ctok(double value){
		return value + KelvinMetric;
	}
	
	public double Ktoc(double value){
		return value + CelciusMetric;
	}

	public double Mtok(double value){
		return value * KilometerMetric;
	}

	public double KtoM(double value){
		return value * MileMetric;
	}	
}
