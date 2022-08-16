package application;

public class Total {
	private String quantityString;
	private double quantity;
	private double price;
	private String errorMessage;

	Total() {
	}

	/**
	 * Constructor to set the values for quantities and prices
	 * 
	 * @param price
	 * @param quantityAsString
	 */
	public Total(double price, String quantityAsString) {
		this.price = price;
		setQuantityString(quantityAsString);
	}

	/**
	 * Validates quantity entered, quantity should be a positive digit
	 * 
	 * @param quantityAsString
	 * @return valid (boolean value)
	 */
	boolean errorMessage(String quantityAsString) {
		boolean valid = true;
		// If the user leaves the Textfield empty
		if (quantityAsString == "") {
			valid = false;
			// Checks if quantity is positive
		} else if (quantityAsString.charAt(0) == '-') {
			valid = false;
			// Checks if quantity is a digit
		} else {
			for (char c : quantityAsString.toCharArray()) {
				if (!Character.isDigit(c) && c != '-') {
					valid = false;
				}
			}
		}

		return valid;
	}

	/**
	 * Calculates the total for each item
	 * 
	 * @return total = price * quantity
	 */
	double itemTotal() {
		return getPrice() * getQuantity();
	}

	/**
	 * Returns the double format of the quantity once it passes all validation tests
	 * 
	 * @return quantity
	 */
	double getQuantity() {
		if (errorMessage(getQuantityString())) {
			quantity = Double.parseDouble(getQuantityString());
		} else {
			quantity = 0;
		}
		return quantity;
	}

	// Getters and setters
	void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Checks the validation of the quantities and sets the errorMessage
	 * 
	 * @param item1
	 * @param item2
	 * @param item3
	 * @param item4
	 * @param item5
	 * @param item6
	 */
	void setErrorMessage(String item1, String item2, String item3, String item4, String item5, String item6) {
		String allQuntities = item1 + item2 + item3 + item4 + item5 + item6;
		String characters = "";
		for (char c : allQuntities.toCharArray()) {
			if (!Character.isDigit(c) && c != '-') {
				characters += c;
				errorMessage = "Please do not include any of the following " + characters + " Character";
			} else if (c == '-') {
				errorMessage = "Quantity should be a positive number.";
			}
		}
	}

	String getQuantityString() {
		return quantityString;
	}

	void setQuantityString(String quantityString) {
		this.quantityString = quantityString;
	}

}
