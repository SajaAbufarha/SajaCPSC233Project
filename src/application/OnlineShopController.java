package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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

	public void switchToMainScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("OnlineShopFirstView.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void men(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MenSectionScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	void women(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("WomenSectionScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void checkout(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("CheckoutScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
    void addItems(ActionEvent event) {
    	errorLabel.setText("");
    	double totalCheckout = 0.0;
    	//System.out.print(Double.parseDouble(labyrinthPrice.getText())* Double.parseDouble(labyrinthTextfield.getText()));
    	Total labyrinth = new Total(labyrinthTextfield.getText() ,Double.parseDouble(labyrinthPrice.getText()) );
    	errorLabel.setText(labyrinth.setValue(labyrinthTextfield.getText()));

    	//errorLabel.setText(projectGrade.setValue(projectGradeTextField.getText())
    	System.out.print(labyrinth.itemTotal());

    }
}
