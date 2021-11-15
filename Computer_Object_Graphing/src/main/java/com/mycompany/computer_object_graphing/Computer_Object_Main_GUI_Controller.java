/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computer_object_graphing;

/**
 *
 * @author nstmark
 */
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Computer_Object_Main_GUI_Controller {

    @FXML
    private Button Add_To_Database_BTN;

    @FXML
    private ChoiceBox<String> Bit_Version_DropDown;

    @FXML
    private ChoiceBox<String> Brand_Motherboard_DropDown;

    @FXML
    private ChoiceBox<String> CPU_Brand_DropMenu;

    @FXML
    private TextField CPU_Model_TextBox;

    @FXML
    private TextField Geographic_Location_TextBox;

    @FXML
    private TextField IP_Address_TextBox;

    @FXML
    private TextField MotherBoard_ModelNumber_TextBox;

    @FXML
    private ChoiceBox<String> Operating_System_DropDown;

    @FXML
    private Button Show_Available_Object_BTN;

    @FXML
    private Button Show_Network_Map_BTN;

    @FXML
    public void initialize()
    {
        //Add Items to their choice boxes
        Brand_Motherboard_DropDown.getItems().add("1. MSI(Micro-Star International");
        Brand_Motherboard_DropDown.getItems().add("2. ASUS");
        Brand_Motherboard_DropDown.getItems().add("3. Biostar");
        Brand_Motherboard_DropDown.getItems().add("4. EVGA Corporation");
        Brand_Motherboard_DropDown.getItems().add("5. Gigabyte Technology");
        Brand_Motherboard_DropDown.getItems().add("6. Intel");
        Brand_Motherboard_DropDown.getItems().add("7. ASRock");
        
        
    
    }
       

    
}
