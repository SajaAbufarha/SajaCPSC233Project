package application;

public class WomenSectionTotal extends Total {
	// Instance variables to set quantities and prices
	private String cardiganQuantity;
	private String topQuantity;
	private String dressQuantity;
	private String setQuantity;
	private String pantsQuantity;
	private String geoPantsQuantity;
	private double setPrice;
	private double geoPantsPrice;
	private double pantsPrice;
	private double topPrice;
	private double dressPrice;
	private double cardiganPrice;
	private String errorMessageMen;

	/**
	 * Constructor to set the values for quantities and prices, sets the error
	 * message too by passing quantity values to the ErrorMessgae setter
	 * 
	 * @param cardiganQuantity
	 * @param topQuantity
	 * @param dressQuantity
	 * @param setQuantity
	 * @param pantsQuantity
	 * @param geoPantsQuantity
	 * @param setPrice
	 * @param geoPantsPrice
	 * @param pantsPrice
	 * @param topPrice
	 * @param dressPrice
	 * @param cardiganPrice
	 */
	WomenSectionTotal(String cardiganQuantity, String topQuantity, String dressQuantity, String setQuantity,
			String pantsQuantity, String geoPantsQuantity, double setPrice, double geoPantsPrice, double pantsPrice,
			double topPrice, double dressPrice, double cardiganPrice) {
		this.setCardiganQuantity(cardiganQuantity);
		this.setCardiganPrice(cardiganPrice);

		this.setTopQuantity(topQuantity);
		this.setTopPrice(topPrice);

		this.setDressQuantity(dressQuantity);
		this.setDressPrice(dressPrice);

		this.setSetQuantity(setQuantity);
		this.setSetPrice(setPrice);

		this.setPantsQuantity(pantsQuantity);
		this.setPantsPrice(pantsPrice);

		this.setGeoPantsQuantity(geoPantsQuantity);
		this.setGeoPantsPrice(geoPantsPrice);

		setErrorMessage(cardiganQuantity, topQuantity, dressQuantity, setQuantity, pantsQuantity, geoPantsQuantity);
	}

	/**
	 * Calculates the total for the men section, applies discount if applicable
	 * 
	 * @return totalWomen
	 */
	double getTotalWomen() {
		double totalWomen = 0;
		// Passing quantities and prices to methods from the parent class (Total)
		setQuantityString(getCardiganQuantity());
		setPrice(getCardiganPrice());
		// Incrementing totalMen
		totalWomen += itemTotal();

		setQuantityString(getTopQuantity());
		setPrice(getTopPrice());
		totalWomen += itemTotal();

		setQuantityString(getDressQuantity());
		setPrice(getDressPrice());
		totalWomen += itemTotal();

		setQuantityString(getSetQuantity());
		setPrice(getSetPrice());
		totalWomen += itemTotal();

		setQuantityString(getPantsQuantity());
		setPrice(getPantsPrice());
		totalWomen += itemTotal();

		setQuantityString(getGeoPantsQuantity());
		setPrice(getGeoPantsPrice());
		totalWomen += itemTotal();
		// Discount calculations, assuming 20% off for orders above 150 and 30% for
		// orders above 250
		if (totalWomen >= 200 && totalWomen < 300) {
			totalWomen = totalWomen - (totalWomen * 0.20);
		} else if (totalWomen >= 300) {
			totalWomen = totalWomen - (totalWomen * 0.30);
		} else {
			totalWomen = totalWomen;
		}
		return totalWomen;
	}

	// Setters and getters
	public String getErrorMessageWomen() {
		return errorMessageMen;
	}

	// calls getErrorMessage() from the parent class and sets errorMessageMen to it
	public void setErrorMessageWomen() {
		errorMessageMen = getErrorMessage();
	}

	public String getCardiganQuantity() {
		return cardiganQuantity;
	}

	public void setCardiganQuantity(String cardiganQuantity) {
		this.cardiganQuantity = cardiganQuantity;
	}

	public String getTopQuantity() {
		return topQuantity;
	}

	public void setTopQuantity(String topQuantity) {
		this.topQuantity = topQuantity;
	}

	public String getDressQuantity() {
		return dressQuantity;
	}

	public void setDressQuantity(String dressQuantity) {
		this.dressQuantity = dressQuantity;
	}

	public String getSetQuantity() {
		return setQuantity;
	}

	public void setSetQuantity(String setQuantity) {
		this.setQuantity = setQuantity;
	}

	public String getPantsQuantity() {
		return pantsQuantity;
	}

	public void setPantsQuantity(String pantsQuantity) {
		this.pantsQuantity = pantsQuantity;
	}

	public String getGeoPantsQuantity() {
		return geoPantsQuantity;
	}

	public void setGeoPantsQuantity(String geoPantsQuantity) {
		this.geoPantsQuantity = geoPantsQuantity;
	}

	public double getSetPrice() {
		return setPrice;
	}

	public void setSetPrice(double setPrice) {
		this.setPrice = setPrice;
	}

	public double getGeoPantsPrice() {
		return geoPantsPrice;
	}

	public void setGeoPantsPrice(double geoPantsPrice) {
		this.geoPantsPrice = geoPantsPrice;
	}

	public double getPantsPrice() {
		return pantsPrice;
	}

	public void setPantsPrice(double pantsPrice) {
		this.pantsPrice = pantsPrice;
	}

	public double getTopPrice() {
		return topPrice;
	}

	public void setTopPrice(double topPrice) {
		this.topPrice = topPrice;
	}

	public double getDressPrice() {
		return dressPrice;
	}

	public void setDressPrice(double dressPrice) {
		this.dressPrice = dressPrice;
	}

	public double getCardiganPrice() {
		return cardiganPrice;
	}

	public void setCardiganPrice(double cardiganPrice) {
		this.cardiganPrice = cardiganPrice;
	}

}
