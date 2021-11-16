/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computer_object_graphing;

/**
 *
 * @author nstmark
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Computer_Object_Main_GUI_Controller {
    
    String Motherboard_Brands[] = {"-Select One-", "1. MSI(Micro-Star International", "2. ASUS", "3. Biostar",
        "4. EVGA Corporation", "5. Gigabyte Technology", "6. Intel", "7. ASRock"};
    
    String CPU_Selections[] = {"-Select One-", "Intel", "AMD"};
    
    String Operating_System_Distro[] = {"-Select One-", "Microsoft Windows", "Fedora", "Centos", "Ubuntu",
        "Kali Linux", "OpenSuSe"};
    
    String Bit_Version_Selection[] = {"-Select One-", "64-bit", "32-bit"};

    
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
        //Default Comment in Choice box
        Brand_Motherboard_DropDown.setValue(Motherboard_Brands[0]);
        Bit_Version_DropDown.setValue(Bit_Version_Selection[0]);
        CPU_Brand_DropMenu.setValue(CPU_Selections[0]);
        Operating_System_DropDown.setValue(Operating_System_Distro[0]);
                
                
        //Add Items to their choice boxes
        Brand_Motherboard_DropDown.setItems(FXCollections.observableArrayList(Motherboard_Brands));
        Bit_Version_DropDown.setItems(FXCollections.observableArrayList(Bit_Version_Selection));
        CPU_Brand_DropMenu.setItems(FXCollections.observableArrayList(CPU_Selections));
        Operating_System_DropDown.setItems(FXCollections.observableArrayList(Operating_System_Distro));
        
        
    
    }
      
    
}
