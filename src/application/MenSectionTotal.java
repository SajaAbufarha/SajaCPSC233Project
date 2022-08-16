package application;

public class MenSectionTotal extends Total {
	private String labyrinthQuantity;

	private String fahadQuantity;

	private String travellerQuantity;

	private String talismanQuantity;

	private String vigorQuantity;

	private String pearlQuantity;

	private Double labyrinthPrice;

	private Double fahadPrice;

	private Double travellerPrice;

	private Double talismanPrice;

	private Double vigorPrice;

	private Double pearlPrice;
	private String errorMessageMen;

	MenSectionTotal(String labyrinthQuantity, String fahadQuantity, String travellerQuantity, String talismanQuantity,
			String vigorQuantity, String pearlQuantity, Double labyrinthPrice, Double fahadPrice, Double travellerPrice,
			Double talismanPrice, Double vigorPrice, Double pearlPrice) {
		this.setLabyrinthQuantity(labyrinthQuantity);
		this.setLabyrinthPrice(labyrinthPrice);
		this.setFahadQuantity(fahadQuantity);
		this.setFahadPrice(fahadPrice);
		this.setTravellerQuantity(travellerQuantity);
		this.setTravellerPrice(travellerPrice);
		this.setTalismanQuantity(talismanQuantity);
		this.setTalismanPrice(talismanPrice);
		this.setVigorQuantity(vigorQuantity);
		this.setVigorPrice(vigorPrice);
		this.setPearlQuantity(pearlQuantity);
		this.setPearlPrice(pearlPrice);

		setErrorMessage(labyrinthQuantity, fahadQuantity, travellerQuantity, talismanQuantity, vigorQuantity,
				pearlQuantity);
	}

	double getTotalMen() {
		double totalMen = 0;
		setQuantityString(getLabyrinthQuantity());
		setPrice(getLabyrinthPrice());
		totalMen += itemTotal();

		setQuantityString(getFahadQuantity());
		setPrice(getFahadPrice());
		totalMen += itemTotal();

		setQuantityString(getTravellerQuantity());
		setPrice(getTravellerPrice());
		totalMen += itemTotal();

		setQuantityString(getTalismanQuantity());
		setPrice(getTalismanPrice());
		totalMen += itemTotal();

		setQuantityString(getVigorQuantity());
		setPrice(getVigorPrice());
		totalMen += itemTotal();

		setQuantityString(getPearlQuantity());
		setPrice(getPearlPrice());
		totalMen += itemTotal();
		if (totalMen >= 150 && totalMen < 250) {
			totalMen = totalMen - (totalMen * 0.20);
		} else if (totalMen >= 250) {
			totalMen = totalMen - (totalMen * 0.30);
		} else {
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

	public String getLabyrinthQuantity() {
		return labyrinthQuantity;
	}

	public void setLabyrinthQuantity(String labyrinthQuantity) {
		this.labyrinthQuantity = labyrinthQuantity;
	}

	public String getFahadQuantity() {
		return fahadQuantity;
	}

	public void setFahadQuantity(String fahadQuantity) {
		this.fahadQuantity = fahadQuantity;
	}

	public String getTravellerQuantity() {
		return travellerQuantity;
	}

	public void setTravellerQuantity(String travellerQuantity) {
		this.travellerQuantity = travellerQuantity;
	}

	public String getTalismanQuantity() {
		return talismanQuantity;
	}

	public void setTalismanQuantity(String talismanQuantity) {
		this.talismanQuantity = talismanQuantity;
	}

	public String getVigorQuantity() {
		return vigorQuantity;
	}

	public void setVigorQuantity(String vigorQuantity) {
		this.vigorQuantity = vigorQuantity;
	}

	public String getPearlQuantity() {
		return pearlQuantity;
	}

	public void setPearlQuantity(String pearlQuantity) {
		this.pearlQuantity = pearlQuantity;
	}

	public Double getLabyrinthPrice() {
		return labyrinthPrice;
	}

	public void setLabyrinthPrice(Double labyrinthPrice) {
		this.labyrinthPrice = labyrinthPrice;
	}

	public Double getFahadPrice() {
		return fahadPrice;
	}

	public void setFahadPrice(Double fahadPrice) {
		this.fahadPrice = fahadPrice;
	}

	public Double getTravellerPrice() {
		return travellerPrice;
	}

	public void setTravellerPrice(Double travellerPrice) {
		this.travellerPrice = travellerPrice;
	}

	public Double getTalismanPrice() {
		return talismanPrice;
	}

	public void setTalismanPrice(Double talismanPrice) {
		this.talismanPrice = talismanPrice;
	}

	public Double getVigorPrice() {
		return vigorPrice;
	}

	public void setVigorPrice(Double vigorPrice) {
		this.vigorPrice = vigorPrice;
	}

	public Double getPearlPrice() {
		return pearlPrice;
	}

	public void setPearlPrice(Double pearlPrice) {
		this.pearlPrice = pearlPrice;
	}

}
