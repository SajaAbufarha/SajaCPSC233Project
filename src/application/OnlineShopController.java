package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OnlineShopController {
	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	private Label womenTotaldisplay;
	@FXML
	private TextField cardiganTextField;
	@FXML
	private Label topPrice;
	@FXML
	private TextField geoPantsTextfield;
	@FXML
	private TextField pantsTextField;
	@FXML
	private Label setPrice;
	@FXML
	private TextField setTextfield;
	@FXML
	private Label pantsPrice;
	@FXML
	private Label cardiganPrice;
	@FXML
	private Label dressPrice;
	@FXML
	private TextField dressTextfield;
	@FXML
	private Label geoPantsPrice;
	@FXML
	private TextField topTextfield;

	@FXML
	private Label womenErrorLabel;
	@FXML
	private TextField labyrinthTextfield;
	@FXML
	private Button add;
	@FXML
	private Label pearlPrice;
	@FXML
	private TextField fahadTextfield;
	@FXML
	private TextField travellerTextField;
	@FXML
	private Label talismanPrice;
	@FXML
	private Label travellerPrice;
	@FXML
	private Label vigorPrice;
	@FXML
	private TextField talismanTextfield;
	@FXML
	private Label fahadPrice;
	@FXML
	private TextField vigorTextfield;
	@FXML
	private TextField pearlTextfield;
	@FXML
	private Label labyrinthPrice;
	@FXML
	private Button checkoutButton;
	@FXML
	private Button womenButton;
	@FXML
	private Button menButton;
	@FXML
	private Button addItems;
	@FXML
	private Label errorLabel;
	@FXML
	private Label totaldisplay;
	@FXML
	private Label confirm;
	/**
	 * Switches the scene to the main page
	 * @param event
	 * @throws IOException
	 */
	public void switchToMainScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("OnlineShopFirstView.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
/** 
 * Switches the scene to the men section page
 * @param event
 * @throws IOException
 */
	@FXML
	void men(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MenSectionScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}
	/**
	 * Switches the scene to the women section page
	 * @param event
	 * @throws IOException
	 */

	@FXML
	void women(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("WomenSectionScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Creates an instance of the MenSectionTotal class, passes values of quantities (TextFields) and prices
	 * Shows error message, if there is
	 * Displays the total 
	 * @param event
	 */
	@FXML
	void addItems(ActionEvent event) {
		MenSectionTotal men = new MenSectionTotal(labyrinthTextfield.getText(), fahadTextfield.getText(),
				travellerTextField.getText(), talismanTextfield.getText(), vigorTextfield.getText(),
				pearlTextfield.getText(), Double.parseDouble(labyrinthPrice.getText()),
				Double.parseDouble(fahadPrice.getText()), Double.parseDouble(travellerPrice.getText()),
				Double.parseDouble(talismanPrice.getText()), Double.parseDouble(vigorPrice.getText()),
				Double.parseDouble(pearlPrice.getText()));

		men.setErrorMessageMen();
		totaldisplay.setText(String.format("Your total for the men section is %.02f", men.getTotalMen()));
		errorLabel.setText(men.getErrorMessageMen());
	}
	/**
	 * Creates an instance of the WomenSectionTotal class, passes values of quantities (TextFields) and prices
	 * Shows error message, if there is
	 * Displays the total
	 * @param event
	 */

	@FXML
	void womenAddItems(ActionEvent event) {

		WomenSectionTotal women = new WomenSectionTotal(cardiganTextField.getText(), topTextfield.getText(),
				dressTextfield.getText(), setTextfield.getText(), pantsTextField.getText(), geoPantsTextfield.getText(),
				Double.parseDouble(setPrice.getText()), Double.parseDouble(geoPantsPrice.getText()),
				Double.parseDouble(pantsPrice.getText()), Double.parseDouble(topPrice.getText()),
				Double.parseDouble(dressPrice.getText()), Double.parseDouble(cardiganPrice.getText()));

		women.setErrorMessageWomen();
		womenTotaldisplay.setText(String.format("Your total for the women section is %.02f", women.getTotalWomen()));
		womenErrorLabel.setText(women.getErrorMessageWomen());
	}
	/**
	 * Switches the scene to the checkout page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void checkout(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("CheckoutScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	/**
	 * Switches the scene to the checkout page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void confirm(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ConfirmationScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
