package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import models.Users;
import view.CreateStore;
import view.Main;
import view.MainComponent;
import view.Modal;
import view.UserInfo;
import helpers.*;

public class CreateStoreController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {
		
		
		
		 String storeName = ((CreateStore.nameField.getText().toLowerCase()));
		 String storeAddress =(CreateStore.addressField.getText().toLowerCase());
		 String storeCity = (CreateStore.cityField.getText().toLowerCase());
		 String storeState = (CreateStore.stateField.getText().toLowerCase());
		 String storePostal = (CreateStore.postalField.getText().toLowerCase());
		 String storePhoneNumber = CreateStore.phonenumberField.getText();
		 
		
		String str1 = ""; 
		try {
			if(!Validations.textFieldValidations(storeName)) {
				str1+="Name not valid. ";
			}
			 if (!Validations.textFieldValidations(storeCity)) {
				str1+="City not valid. ";
			}
			 			
		     if (!Validations.validateInput(storeAddress)) {
					str1+="Address not valid ";
				}
			
			 if (!Validations.textFieldValidations(storeState)) {
				str1+="State not valid. ";
			}
	
			if(!Validations.textFieldValidations(storePostal))
			{
				str1+="postal not valid. ";

			}
			
			if(!Validations.validateNumeric(storePhoneNumber))
			{
				str1+="Phone not valid. ";
			}
	
			if(str1.length()!=0) {	
			Modal.display(2, "Error", str1 , "Ok", "");

			}
			
			else if(models.Store.createStoreQuery(storeName,storeAddress, storeCity,storeState,storePostal,storePhoneNumber)) {
				Modal.display(2, "Sukses", "Store has been registered successfully", "Ok", "");
	
				}
			
	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	
	

	
	

}
