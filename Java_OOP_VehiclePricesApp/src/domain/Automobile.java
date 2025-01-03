package domain;

public class Automobile extends Vehicle {
    private double engineVolume;
    public static final double BASEPRICE = 200000.0 ;
	
   
	Automobile(){
    	super();
    	this.engineVolume=0.0;
    }
    
    Automobile(String vehicleID, String monthOfSale, String cityOfSale, int productionYear,int vat,double engineVolume) {
    	super(vehicleID,monthOfSale,cityOfSale,productionYear,vat);
    	this.engineVolume=engineVolume;
    }
    Automobile(Automobile otherAutomobile){
    	super(otherAutomobile);
        this.engineVolume=otherAutomobile.engineVolume;
    }
    public double getEngineVolume() {
		return engineVolume;
	}
    public double calculateTotalPrice(double SCT) {
    	return (BASEPRICE) * (1 + SCT * 0.8) + (1 + getVat()/100);
    }
}
