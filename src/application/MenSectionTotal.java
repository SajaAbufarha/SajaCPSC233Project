package application;
public class MenSectionTotal extends Total {
	String labyrinthQuantity,  fahadQuantity,  travellerQuantity, talismanQuantity,  vigorQuantity,  pearlQuantity;
	
	Double labyrinthPrice,  fahadPrice, travellerPrice, talismanPrice,  vigorPrice,  pearlPrice;
	private String errorMessageMen;
	
	MenSectionTotal(String labyrinthQuantity, String fahadQuantity, String travellerQuantity ,String talismanQuantity,
			String vigorQuantity, String pearlQuantity ,Double labyrinthPrice, Double fahadPrice,Double travellerPrice
	    	,Double talismanPrice, Double vigorPrice, Double pearlPrice){
		this.labyrinthQuantity = labyrinthQuantity;
		this.labyrinthPrice = labyrinthPrice;
		this.fahadQuantity= fahadQuantity;
		this.fahadPrice= fahadPrice;		
		this.travellerQuantity=travellerQuantity;
		this.travellerPrice= travellerPrice;
		this.talismanQuantity=talismanQuantity;
		this.talismanPrice=talismanPrice;
		this.vigorQuantity=vigorQuantity;
		this.vigorPrice=vigorPrice;
		this.pearlQuantity=pearlQuantity;
		this.pearlPrice=pearlPrice;
		
		setErrorMessage(labyrinthQuantity, fahadQuantity, travellerQuantity , talismanQuantity, vigorQuantity, pearlQuantity);
	}
	
	double getTotalMen() {
		double totalMen = 0;
		setQuantityString(labyrinthQuantity);
		setPrice(labyrinthPrice);
		totalMen+= itemTotal();
		
		setQuantityString(fahadQuantity);
		setPrice(fahadPrice);
		totalMen+= itemTotal();

		setQuantityString(travellerQuantity);
		setPrice(travellerPrice);
		totalMen+= itemTotal();
		
		setQuantityString(talismanQuantity);
		setPrice(talismanPrice);
		totalMen+= itemTotal();
		
		setQuantityString(vigorQuantity);
		setPrice(vigorPrice);
		totalMen+= itemTotal();
		
		setQuantityString(pearlQuantity);
		setPrice(pearlPrice);
		totalMen+= itemTotal();
		if (totalMen>= 150 && totalMen < 250) {
			totalMen = totalMen - (totalMen * 0.20);
		}else if (totalMen >= 250) {
			totalMen = totalMen - (totalMen * 0.30);
		}else {
			totalMen = totalMen;
		}
		
		return totalMen;
	}

	public String getErrorMessageMen() {
		return errorMessageMen;
	}
	public void setErrorMessageMen() {
		errorMessageMen = getErrorMessage();
	}

}
