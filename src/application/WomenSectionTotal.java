package application;

public class WomenSectionTotal extends Total{

	String cardiganQuantity, topQuantity, dressQuantity, setQuantity, pantsQuantity, geoPantsQuantity;
	double setPrice,  geoPantsPrice,  pantsPrice, topPrice,  dressPrice,  cardiganPrice;
	private String errorMessageMen;
	
	WomenSectionTotal(String cardiganQuantity, String topQuantity,String dressQuantity
			, String setQuantity, String pantsQuantity, String geoPantsQuantity
	    	, double setPrice, double geoPantsPrice, double pantsPrice
	    	, double topPrice , double dressPrice, double cardiganPrice) {
		this.cardiganQuantity = cardiganQuantity;
		this.cardiganPrice = cardiganPrice;
		
		this.topQuantity = topQuantity;
		this.topPrice = topPrice;
		
		this.dressQuantity=dressQuantity;
		this.dressPrice= dressPrice;
		
		this.setQuantity =setQuantity;
		this.setPrice = setPrice;
		
		this.pantsQuantity=pantsQuantity;
		this.pantsPrice=pantsPrice;
		
		this.geoPantsQuantity=geoPantsQuantity;
		this.geoPantsPrice=geoPantsPrice;
		
		setErrorMessage(cardiganQuantity, topQuantity, dressQuantity, setQuantity, pantsQuantity, geoPantsQuantity);
	}
	
	double getTotalWomen() {
		double totalWomen = 0;
		setQuantityString(cardiganQuantity);
		setPrice(cardiganPrice);
		totalWomen+= itemTotal();
		
		setQuantityString(topQuantity);
		setPrice(topPrice);
		totalWomen+= itemTotal();

		setQuantityString(dressQuantity);
		setPrice(dressPrice);
		totalWomen+= itemTotal();
		
		setQuantityString(setQuantity);
		setPrice(setPrice);
		totalWomen+= itemTotal();
		
		setQuantityString(pantsQuantity);
		setPrice(pantsPrice);
		totalWomen+= itemTotal();
		
		setQuantityString(geoPantsQuantity);
		setPrice(geoPantsPrice);
		totalWomen+= itemTotal();
		if (totalWomen>= 200 && totalWomen < 300) {
			totalWomen = totalWomen - (totalWomen * 0.20);
		}else if (totalWomen >= 300) {
			totalWomen = totalWomen - (totalWomen * 0.30);
		}else {
			totalWomen = totalWomen;
		}
		return totalWomen;
	}

	public String getErrorMessageWomen() {
		return errorMessageMen;
	}
	public void setErrorMessageWomen() {
		errorMessageMen = getErrorMessage();
	}

}


