package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DeparmentFormController implements Initializable {

	private Department entity;
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	public void setDepartment(Department department) {
		this.entity = department;
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("onBtCancelAction");
	};
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("onBtSaveAction");
	};
	
	@Override
	public void initialize(URL url, ResourceBundle rs) {
		initiazibleNodes();
		
	}
	
	private void initiazibleNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}
	
	public void updateFormData() {
		if(entity == null) {
			throw new IllegalStateException("Entity is null!");
		}
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(entity.getName());
	}

}
