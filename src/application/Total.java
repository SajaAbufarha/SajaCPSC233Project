package application;

public class Total {
	private String quantityString;
	private double quantity;
	private double price;
	private String errorMessage = "";

	Total (){}
	public Total(double price, String quantityAsString) {
		this.price = price;
		setQuantityString(quantityAsString);
	}

	boolean errorMessage(String quantityAsString) {
		boolean valid = true;
		if (quantityAsString == "") {
			valid = false;
		} 
		else if (quantityAsString.charAt(0)=='-')  {
			valid = false;
		} 
		else {
			for (char c : quantityAsString.toCharArray()) {
				if (!Character.isDigit(c) && c != '-') {
					valid = false;
				}
			}			
		}
		
		return valid;
	}

	double itemTotal() {
		return getPrice() * getQuantity();
	}

	private double getQuantity() {
		if (errorMessage(getQuantityString())) {
			quantity = Double.parseDouble(getQuantityString());
		}else {
			quantity = 0;
		}
		return quantity;
	}

	 void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	 double getPrice() {
		return price;
	}

	 void setPrice(double price) {
		this.price = price;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	 void setErrorMessage(String item1, String item2, String item3 ,String item4, String item5, String item6 ) {
			String allQuntities = item1+ item2+ item3+ item4+  item5+  item6;
			String characters = "";
			for (char c : allQuntities.toCharArray()) {
				if (!Character.isDigit(c) && c != '-') {
					characters+=c;
					errorMessage = "Please do not include any of the following "+ characters + " Character";
				} else if (c =='-'){
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
