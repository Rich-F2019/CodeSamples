package ValleyDepot;

import javafx.collections.*;
import java.util.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javax.swing.JComboBox;

public class ValleyDepotFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        Customer cust1 = new Customer("Bruce", "Wayne", "1007 Mountain Drive", "5403245687", "waynebruce@gmail.com");
        Customer cust2 = new Customer("Peter", "Parker", "20 Ingram Street", "9018733245", "parkerPeter@aol.com");
        Customer cust3 = new Customer("Tony", "Stark", "10880 Malibu Point", "2379834576", "starkTony@gmail.com");
        Customer cust4 = new Customer("Harry", "Potter", "4 Privet Drive", "3275649983", "potterHarry@yahoo.com");
        Customer cust5 = new Customer("Steve", "Rogers", "247 Corona Beach", "4328659867", "rodgerSteveCapAmerica@gmail.com");
        Customer cust6 = new Customer("Barack", "Obama", "250 Presidental St", "9012326793", "ObamaFoundations@gmail.com");
        Customer cust7 = new Customer("Lebron", "James", "12 ShowTime Dr", "1103467234", "King_James@aol.com");
        Customer cust8 = new Customer("Yao", "Ming", "7 Shanghai road ", "2117830945", "rocket_Yao@gmail.com");

        ArrayList<Customer> CustomerList = new ArrayList<Customer>();
        CustomerList.add(cust1);
        CustomerList.add(cust2);
        CustomerList.add(cust3);
        CustomerList.add(cust4);
        CustomerList.add(cust5);
        CustomerList.add(cust6);
        CustomerList.add(cust7);
        CustomerList.add(cust8);

        Contractor contract1 = new Contractor("John", "Adams", "249 Michigan Avenue", "3017459873", "adam_John@gmail.com", "John Adams and Sons", "125 Devon Lane");
        Contractor contract2 = new Contractor("George", "Washington", "150 Virginia Drive", "2113765789", "Washington_George@gmail.com", "George Washington INC.", "150 South Main St");
        Contractor contract3 = new Contractor("Thomas", "Jefferson", "203 Charolottesville street", "1239938403", "Thomas_Jeff@gmail.com", "Jefferson's Solutions", "78 Port Republic Road");
        Contractor contract4 = new Contractor("James", "Madison", "250 Harrisonburg avenue", "8727861285", "Mad_James@gmail.com", "Madison's Solutions", "12 North High St");

        ArrayList<Contractor> ContractorList = new ArrayList<Contractor>();
        ContractorList.add(contract1);
        ContractorList.add(contract2);
        ContractorList.add(contract3);
        ContractorList.add(contract4);

        Vendor vendor1 = new Vendor("Better Buy", "150 King Street", "");
        Vendor vendor2 = new Vendor("City Circut", "92 Loud Main Avenue", "");
        Vendor vendor3 = new Vendor("Wally World", "45 Carytown Drive", "");

        ArrayList<Vendor> VendorList = new ArrayList<Vendor>();
        VendorList.add(vendor1);
        VendorList.add(vendor2);
        VendorList.add(vendor3);

        Item item1 = new Item("ps4", 2.65, 199.95, 250, "1 TB ps4 Pro", vendor1, 10);
        Item item2 = new Item("xboxOne", 3.42, 299.95, 325, "1 TB xboxOne", vendor2, 8);
        Item item3 = new Item("TV", 12, 450, 599.96, "72 Inch smart tv", vendor3, 10);
        Item item4 = new Item("Laptop", 4.3, 1250.95, 2000, "15 inch Dell XPS", vendor2, 23);
        Item item5 = new Item("Microwave", 3.8, 24.76, 75, "Johnson and Johnson portable microwave", vendor1, 15);
        Item item6 = new Item("Keyboard", 1.5, 99.90, 149, "Anne Pro 2, Mechanical Keyboard", vendor2, 19);
        Item item7 = new Item("Headphones", .26, 60, 100, "Air Pod v2 blutooth headphones", vendor3, 45);
        Item item8 = new Item("Mac Book Pro", 4.98, 1950.25, 2985, "13 inch Retnia Mac Book Pro", vendor1, 56);
        Item item9 = new Item("iphone", .98, 800, 1000, "iphone X plus", vendor3, 27);
        Item item10 = new Item("GPS", 1.1, 250.45, 350, "Garmin travel gpa", vendor2, 80);

        ArrayList<Item> ItemList = new ArrayList<Item>();
        ItemList.add(item1);
        ItemList.add(item2);
        ItemList.add(item3);
        ItemList.add(item4);
        ItemList.add(item5);
        ItemList.add(item6);
        ItemList.add(item7);
        ItemList.add(item8);
        ItemList.add(item9);
        ItemList.add(item10);

        Sale sale1 = new Sale(item1, 6, "1/21/18", cust1);
        Sale sale2 = new Sale(item3, 3, "3/11/18", cust1);
        Sale sale3 = new Sale(item5, 8, "5/13/18", cust3);
        Sale sale4 = new Sale(item7, 20, "7/31/18", cust5);
        Sale sale5 = new Sale(item9, 16, "9/7/18", cust8);

        ArrayList<Sale> SaleList = new ArrayList<Sale>();
        SaleList.add(sale1);
        SaleList.add(sale2);
        SaleList.add(sale3);
        SaleList.add(sale4);
        SaleList.add(sale5);

        //Create Buttons to be used for main menu Control
        Button btnCustomerDetails = new Button("Customer Details");
        Button btnEnterSale = new Button("Enter Sale");
        Button btnPrintReceipt = new Button("Print Receipt");
        Button btnVendorDetails = new Button("Vendor Details");
        Button btnPrintReport = new Button("Print Report");
        Button btnExit = new Button("Exit");

        Label welcomeLabel = new Label("Welcome to Valley Depot");
        welcomeLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 30));
        Label mainLabel = new Label("Main Menu");
        mainLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
        Label sideLabel = new Label("(Please select one of the options)");
        sideLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 10));

        // Main Menu Pane   
        GridPane mainPane = new GridPane();
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setHgap(10);
        mainPane.setVgap(5);

        //Add Buttons to main menu pane     
        mainPane.add(welcomeLabel, 0, 0);
        mainPane.add(mainLabel, 0, 2, 2, 1);
        mainPane.add(sideLabel, 0, 3);
        mainPane.add(btnCustomerDetails, 0, 4);
        mainPane.add(btnEnterSale, 0, 5);
        mainPane.add(btnPrintReceipt, 0, 6);
        mainPane.add(btnVendorDetails, 0, 7);
        mainPane.add(btnPrintReport, 0, 8);
        mainPane.add(btnExit, 0, 9);

        //main menu scene     
        Scene mainScene = new Scene(mainPane, 400, 400);

        btnExit.setOnAction(f -> {
            primaryStage.close();
        });

        primaryStage.setScene(mainScene);
        primaryStage.show();

        //Option 1 code Block //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Click Customer Details and bring up the option for customer or contractor     
        btnCustomerDetails.setOnAction(a -> {
            GridPane optionOneSelectionPane = new GridPane();

            Scene optionOneSelectionScene = new Scene(optionOneSelectionPane, 400, 400);
            optionOneSelectionPane.setAlignment(Pos.CENTER);
            optionOneSelectionPane.setHgap(10);
            optionOneSelectionPane.setVgap(5);

            Button btnCustomer = new Button("Customer Options");
            Button btnContractor = new Button("Contractor Options");
            Button btnBackToMain = new Button("Back");

            Label customerDetailsMainLabel = new Label("Customer/Contractor Menu");
            customerDetailsMainLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 40));

            Label customerDetailsSideLabel = new Label("(Please select one of the options)");
            customerDetailsMainLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));

            optionOneSelectionPane.add(customerDetailsMainLabel, 0, 0);
            optionOneSelectionPane.add(customerDetailsSideLabel, 0, 2);

            optionOneSelectionPane.add(btnCustomer, 0, 3);
            optionOneSelectionPane.add(btnContractor, 0, 4);
            optionOneSelectionPane.add(btnBackToMain, 0, 5);

            primaryStage.setScene(optionOneSelectionScene);
            primaryStage.show();

            // return to main menu
            btnBackToMain.setOnAction(f -> {
                primaryStage.setScene(mainScene);
                primaryStage.show();
            });

           // Add or edit Cusotmer Options       
            btnCustomer.setOnAction(b -> {
                GridPane customerPane = new GridPane();
                Scene customerScene = new Scene(customerPane, 400, 400);

                customerPane.setAlignment(Pos.CENTER);
                customerPane.setHgap(10);
                customerPane.setVgap(5);

                Button btnAddCustomer = new Button("Add A Customer");
                Button btnEditCustomer = new Button("Edit A Customer");
                Button btnBack = new Button("Back");

                customerPane.add(btnAddCustomer, 0, 0);
                customerPane.add(btnEditCustomer, 0, 1);
                customerPane.add(btnBack, 0, 2);

                primaryStage.setScene(customerScene);
                primaryStage.show();

                btnBack.setOnAction(g -> {

                    primaryStage.setScene(optionOneSelectionScene);
                    primaryStage.show();

                });

                // ADD a Customer 
                btnAddCustomer.setOnAction(c -> {

                    GridPane addCustomerPane = new GridPane();
                    Scene addCustomerScene = new Scene(addCustomerPane, 400, 400);

                    addCustomerPane.setAlignment(Pos.CENTER);
                    addCustomerPane.setHgap(10);
                    addCustomerPane.setVgap(5);

                    Label lblFirstName = new Label("FirstName");
                    Label lblLastName = new Label("LastName");
                    Label lblAddress = new Label("Address");
                    Label lblPhoneNumber = new Label("Phone Number");
                    Label lblEmail = new Label("Email");

                    TextField txtFirstName = new TextField();
                    TextField txtLastName = new TextField();
                    TextField txtAddress = new TextField();
                    TextField txtPhoneNumber = new TextField();
                    TextField txtEmail = new TextField();

                    Button btnBack1 = new Button("Back");
                    Button btnAddACustomer = new Button("Add Customer");

                    addCustomerPane.add(lblFirstName, 0, 0);
                    addCustomerPane.add(lblLastName, 0, 1);
                    addCustomerPane.add(lblAddress, 0, 2);
                    addCustomerPane.add(lblPhoneNumber, 0, 3);
                    addCustomerPane.add(lblEmail, 0, 4);

                    addCustomerPane.add(txtFirstName, 1, 0);
                    addCustomerPane.add(txtLastName, 1, 1);
                    addCustomerPane.add(txtAddress, 1, 2);
                    addCustomerPane.add(txtPhoneNumber, 1, 3);
                    addCustomerPane.add(txtEmail, 1, 4);

                    addCustomerPane.add(btnBack, 0, 6);
                    addCustomerPane.add(btnAddACustomer, 0, 5);

                    primaryStage.setScene(addCustomerScene);
                    primaryStage.show();

                    btnAddACustomer.setOnAction(j -> {
                        String custFirstName = "";
                        String custLastName = "";
                        String custAddress = "";
                        String custPhone = "";
                        String custEmail = "";

                        custFirstName = txtFirstName.getText();
                        custLastName = txtLastName.getText();
                        custAddress = txtAddress.getText();
                        custPhone = txtPhoneNumber.getText();
                        custEmail = txtEmail.getText();

                        Customer somecustomer = new Customer(custFirstName, custLastName, custAddress, custPhone, custEmail);
                        CustomerList.add(somecustomer);
                        
                        txtFirstName.clear();
                        txtLastName.clear();
                        txtAddress.clear();
                        txtPhoneNumber.clear();
                        txtEmail.clear();

                    });

                    btnBack1.setOnAction(h -> {
                        primaryStage.setScene(customerScene);
                        primaryStage.show();

                    });
                });

                // Edit A customer  
                btnEditCustomer.setOnAction(k -> {
                    GridPane editCustomerPane = new GridPane();
                    Scene editCustomerScene = new Scene(editCustomerPane, 800, 400);

                    editCustomerPane.setAlignment(Pos.TOP_LEFT);
                    editCustomerPane.setHgap(10);
                    editCustomerPane.setVgap(5);

                    RadioButton rdoFirstName = new RadioButton("Edit First Name");
                    RadioButton rdoLastName = new RadioButton("Edit Last Name");
                    RadioButton rdoAddress = new RadioButton("Edit Address");
                    RadioButton rdoPhoneNumber = new RadioButton("Edit Phone Number");
                    RadioButton rdoEmail = new RadioButton("Edit Email");
                    RadioButton rdoNotes = new RadioButton("Edit Notes");
                    TextArea currentText = new TextArea();
                    ToggleGroup btnGroup = new ToggleGroup();
                    TextField txtEdit = new TextField();
                    Button btnEdit = new Button("Edit");
                    Button btnBack1 = new Button("Back");
                    rdoFirstName.setToggleGroup(btnGroup);
                    rdoLastName.setToggleGroup(btnGroup);
                    rdoAddress.setToggleGroup(btnGroup);
                    rdoPhoneNumber.setToggleGroup(btnGroup);
                    rdoEmail.setToggleGroup(btnGroup);
                    rdoNotes.setToggleGroup(btnGroup);

                    ObservableList custList = FXCollections.observableArrayList();
                    ComboBox comboList = new ComboBox(custList);

                    for (int i = 0; i < CustomerList.size(); i++) {
                        custList.add(CustomerList.get(i));
                    }

                    editCustomerPane.add(comboList, 3, 1);
                    editCustomerPane.add(rdoFirstName, 3, 2);
                    editCustomerPane.add(rdoLastName, 3, 3);
                    editCustomerPane.add(rdoAddress, 3, 4);
                    editCustomerPane.add(rdoPhoneNumber, 3, 5);
                    editCustomerPane.add(rdoEmail, 3, 6);
                    editCustomerPane.add(txtEdit, 3, 7);
                    editCustomerPane.add(btnEdit, 2, 9);
                    editCustomerPane.add(btnBack1, 2, 10);
                    editCustomerPane.add(currentText, 0, 0, 10, 1);
                    editCustomerPane.add(rdoNotes, 3, 8);

                    comboList.setOnAction(f -> {
                        currentText.clear();

                        String userEdit = " ";
                        String IDString = "";
                        int custIDCheck = 0;
                        int custToEdit = 0;
                        userEdit = txtEdit.getText();

                        IDString = comboList.getValue().toString();

                        custIDCheck = IDString.indexOf(" ");
                        IDString = IDString.substring(0, custIDCheck);
                        custToEdit = Integer.parseInt(IDString);

                        for (int i = 0; i < CustomerList.size(); i++) {
                            if (CustomerList.get(i).getID() == custToEdit) {
                                currentText.appendText(CustomerList.get(i).toString2());
                            }
                        }
                    });

                    btnEdit.setOnAction(v -> {

                        String userEdit = " ";
                        String IDString = "";
                        int custIDCheck = 0;
                        int custToEdit = 0;
                        userEdit = txtEdit.getText();

                        System.out.println(comboList.getValue());
                        IDString = comboList.getValue().toString();

                        custIDCheck = IDString.indexOf(" ");
                        IDString = IDString.substring(0, custIDCheck);
                        custToEdit = Integer.parseInt(IDString);

                        for (int i = 0; i < CustomerList.size(); i++) {
                            if (CustomerList.get(i).getID() == custToEdit) {
                                if (rdoFirstName.isSelected()) {
                                    CustomerList.get(i).firstName = userEdit;
                                }
                                if (rdoLastName.isSelected()) {
                                    CustomerList.get(i).lastName = userEdit;
                                }
                                if (rdoAddress.isSelected()) {
                                    CustomerList.get(i).address = userEdit;
                                }
                                if (rdoPhoneNumber.isSelected()) {
                                    CustomerList.get(i).phoneNumber = userEdit;
                                }
                                if (rdoEmail.isSelected()) {
                                    CustomerList.get(i).email = userEdit;
                                }
                                if (rdoNotes.isSelected()) {
                                    CustomerList.get(i).notes = userEdit;
                                }
                            }
                        }
                        currentText.clear();
                        for (int i = 0; i < CustomerList.size(); i++) {
                            if (CustomerList.get(i).getID() == custToEdit) {
                                currentText.appendText(CustomerList.get(i).toString2());
                            }
                        }
                        txtEdit.clear();
                    });

                    btnBack1.setOnAction(v -> {

                        primaryStage.setScene(customerScene);
                        primaryStage.show();

                    });

                    primaryStage.setScene(editCustomerScene);
                    primaryStage.show();
                });

            });
            //Add or Edit A Contractor
            btnContractor.setOnAction(d -> {

                GridPane contractorPane = new GridPane();
                Scene contractorScene = new Scene(contractorPane, 400, 400);
                contractorPane.setAlignment(Pos.CENTER);
                contractorPane.setHgap(10);
                contractorPane.setVgap(5);

                Button btnAddContractor = new Button("Add A Contractor");
                Button btnEditContractor = new Button("Edit A Contractor");
                Button btnBack = new Button("Back");

                contractorPane.add(btnAddContractor, 0, 0);
                contractorPane.add(btnEditContractor, 0, 1);
                contractorPane.add(btnBack, 0, 2);

                primaryStage.setScene(contractorScene);
                primaryStage.show();

                btnBack.setOnAction(I -> {
                    primaryStage.setScene(optionOneSelectionScene);
                    primaryStage.show();
                });

                // Add a Contractor 
                btnAddContractor.setOnAction(e -> {

                    GridPane addContractorPane = new GridPane();
                    Scene addContractorScene = new Scene(addContractorPane, 400, 400);

                    addContractorPane.setAlignment(Pos.CENTER);
                    addContractorPane.setHgap(10);
                    addContractorPane.setVgap(5);

                    Label lblFirstName = new Label("FirstName");
                    Label lblLastName = new Label("LastName");
                    Label lblAddress = new Label("Address");
                    Label lblPhoneNumber = new Label("Phone Number");
                    Label lblEmail = new Label("Email");
                    Label lblBusinessAddress = new Label("Business Address");
                    Label lblBusinessName = new Label("Business Name");

                    TextField txtFirstName = new TextField();
                    TextField txtLastName = new TextField();
                    TextField txtAddress = new TextField();
                    TextField txtPhoneNumber = new TextField();
                    TextField txtEmail = new TextField();
                    TextField txtBusinessName = new TextField();
                    TextField txtBusinessAddress = new TextField();

                    Button btnBack1 = new Button("Back");
                    Button btnAddAContractor = new Button("Add Contractor");

                    addContractorPane.add(lblFirstName, 0, 0);
                    addContractorPane.add(lblLastName, 0, 1);
                    addContractorPane.add(lblAddress, 0, 2);
                    addContractorPane.add(lblPhoneNumber, 0, 3);
                    addContractorPane.add(lblEmail, 0, 4);
                    addContractorPane.add(lblBusinessAddress, 0, 5);
                    addContractorPane.add(lblBusinessName, 0, 6);

                    addContractorPane.add(txtFirstName, 1, 0);
                    addContractorPane.add(txtLastName, 1, 1);
                    addContractorPane.add(txtAddress, 1, 2);
                    addContractorPane.add(txtPhoneNumber, 1, 3);
                    addContractorPane.add(txtEmail, 1, 4);
                    addContractorPane.add(txtBusinessAddress, 1, 5);
                    addContractorPane.add(txtBusinessName, 1, 6);

                    addContractorPane.add(btnBack1, 0, 8);
                    addContractorPane.add(btnAddAContractor, 0, 7);

                    primaryStage.setScene(addContractorScene);
                    primaryStage.show();

                    btnAddAContractor.setOnAction(y -> {

                        String contFirstName = "";
                        String contLastName = "";
                        String contAddress = "";
                        String contPhone = "";
                        String contEmail = "";
                        String contBusinessAddress = "";
                        String contBusinessName = "";

                        contFirstName = txtFirstName.getText();
                        contLastName = txtLastName.getText();
                        contAddress = txtAddress.getText();
                        contPhone = txtPhoneNumber.getText();
                        contEmail = txtEmail.getText();
                        contBusinessAddress = txtBusinessAddress.getText();
                        contBusinessName = txtBusinessName.getText();

                        Contractor somecontractor = new Contractor(contFirstName, contLastName,
                                contAddress, contPhone, contEmail, contBusinessName, contBusinessAddress);

                        ContractorList.add(somecontractor);
                        
                        //clear text fields
                        txtFirstName.clear();
                        txtLastName.clear();
                        txtAddress.clear();
                        txtPhoneNumber.clear();
                        txtEmail.clear();
                        txtBusinessAddress.clear();
                        txtBusinessName.clear();
                        
                        
                        

                    });

                    btnBack1.setOnAction(j -> {
                        primaryStage.setScene(contractorScene);
                        primaryStage.show();
                    });

                });

                // Edit Contractor //////////////////////////////////////////////////////////////////
                btnEditContractor.setOnAction(e -> {

                    GridPane editContractorPane = new GridPane();
                    Scene editContractorScene = new Scene(editContractorPane, 800, 400);
                    editContractorPane.setHgap(10);
                    editContractorPane.setVgap(5);

                    RadioButton rdoFirstName = new RadioButton("Edit First Name");
                    RadioButton rdoLastName = new RadioButton("Edit Last Name");
                    RadioButton rdoAddress = new RadioButton("Edit Address");
                    RadioButton rdoPhoneNumber = new RadioButton("Edit Phone Number");
                    RadioButton rdoEmail = new RadioButton("Edit Email");
                    RadioButton rdoBusinessAddress = new RadioButton("Business Address");
                    RadioButton rdoBusinessName = new RadioButton("Business Name");
                    RadioButton rdoNotes = new RadioButton("Notes");
                    ToggleGroup btnGroup = new ToggleGroup();
                    TextField txtEdit = new TextField();
                    Button btnEdit = new Button("Edit");
                    Button btnBack1 = new Button("Back");
                    TextArea currentText = new TextArea();

                    rdoFirstName.setToggleGroup(btnGroup);
                    rdoLastName.setToggleGroup(btnGroup);
                    rdoAddress.setToggleGroup(btnGroup);
                    rdoPhoneNumber.setToggleGroup(btnGroup);
                    rdoEmail.setToggleGroup(btnGroup);
                    rdoBusinessAddress.setToggleGroup(btnGroup);
                    rdoBusinessName.setToggleGroup(btnGroup);
                    rdoNotes.setToggleGroup(btnGroup);

                    ObservableList contList = FXCollections.observableArrayList();
                    ComboBox comboList = new ComboBox(contList);

                    for (int i = 0; i < ContractorList.size(); i++) {
                        contList.add(ContractorList.get(i));
                    }

//                    ObservableList somethingElse = FXCollections.observableArrayList();
//                    ListView what = new ListView(somethingElse);
//
//                    for (int i = 0; i < ContractorList.size(); i++) {
//                        somethingElse.add(ContractorList.get(i));
//                    }
                    //editContractorPane.add(what, 0, 0, 2, 1);
                    editContractorPane.add(comboList, 1, 1);
                    editContractorPane.add(rdoFirstName, 1, 2);
                    editContractorPane.add(rdoLastName, 1, 3);
                    editContractorPane.add(rdoAddress, 1, 4);
                    editContractorPane.add(rdoPhoneNumber, 1, 5);
                    editContractorPane.add(rdoEmail, 1, 6);
                    editContractorPane.add(rdoBusinessAddress, 1, 7);
                    editContractorPane.add(rdoBusinessName, 1, 8);
                    editContractorPane.add(txtEdit, 1, 10);
                    editContractorPane.add(btnEdit, 0, 11);
                    editContractorPane.add(rdoNotes, 1, 9);
                    editContractorPane.add(btnBack1, 0, 12);
                    editContractorPane.add(currentText, 0, 0, 2, 1);

                    comboList.setOnAction(f -> {
                        currentText.clear();

                        String userEdit = " ";
                        String IDString = "";
                        int custIDCheck = 0;
                        int custToEdit = 0;
                        userEdit = txtEdit.getText();

                        IDString = comboList.getValue().toString();

                        custIDCheck = IDString.indexOf(" ");
                        IDString = IDString.substring(0, custIDCheck);
                        custToEdit = Integer.parseInt(IDString);

                        for (int i = 0; i < ContractorList.size(); i++) {
                            if (ContractorList.get(i).getID() == custToEdit) {
                                currentText.appendText(ContractorList.get(i).toString2());
                            }
                        }
                    });

                    btnEdit.setOnAction(v -> {
                        String userEdit = " ";
                        String IDString = "";
                        int contIDCheck = 0;
                        int contToEdit = 0;
                        userEdit = txtEdit.getText();

                        System.out.println(comboList.getValue());
                        IDString = comboList.getValue().toString();

                        contIDCheck = IDString.indexOf(" ");
                        IDString = IDString.substring(0, contIDCheck);
                        contToEdit = Integer.parseInt(IDString);
                        for (int i = 0; i < ContractorList.size(); i++) {
                            if (ContractorList.get(i).getID() == contToEdit) {
                                if (rdoFirstName.isSelected()) {
                                    ContractorList.get(i).firstName = userEdit;
                                }
                                if (rdoLastName.isSelected()) {
                                    ContractorList.get(i).lastName = userEdit;
                                }
                                if (rdoAddress.isSelected()) {
                                    ContractorList.get(i).address = userEdit;
                                }
                                if (rdoPhoneNumber.isSelected()) {
                                    ContractorList.get(i).phoneNumber = userEdit;
                                }
                                if (rdoEmail.isSelected()) {
                                    ContractorList.get(i).email = userEdit;
                                }
                                if (rdoEmail.isSelected()) {
                                    ContractorList.get(i).email = userEdit;
                                }
                                if (rdoNotes.isSelected()) {
                                    ContractorList.get(i).notes = userEdit;

                                }
                                if (rdoBusinessAddress.isSelected()) {
                                    ContractorList.get(i).businessAddress = userEdit;
                                }
                                if (rdoBusinessName.isSelected()) {
                                    ContractorList.get(i).businessName = userEdit;
                                }

                            }
                        }
                        txtEdit.clear();
                    });

                    btnBack1.setOnAction(v -> {

                        primaryStage.setScene(contractorScene);
                        primaryStage.show();

                    });
                    primaryStage.setScene(editContractorScene);
                    primaryStage.show();

                });

            });
        });
        // End of option 1 ////////////////////////////////////////////////////////////////////////////////////////////////////
        // option 2 (Enter Sale) ////////////////////////////////////////////////////////////////////////////////////////////////////****************

        btnEnterSale.setOnAction(a -> {
            GridPane EnterSalepane = new GridPane();
            Scene EnterSaleScene = new Scene(EnterSalepane, 500, 500);

            EnterSalepane.setAlignment(Pos.TOP_LEFT);
            EnterSalepane.setHgap(10);
            EnterSalepane.setVgap(5);

            //create buttons 
            Button btnBack = new Button("Back");
            Button btnEnter = new Button("Enter Sale");

            //create textboxes 
            TextField txtQuantity = new TextField();
            TextField txtDate = new TextField();
            TextField txtItem = new TextField();
            TextField txtCustomer = new TextField();

            //create labels 
            Label selectItemLabel = new Label("Select Item");
            Label selectCustomer = new Label("Select Customer");
            Label enterQuantity = new Label("Enter Quantity");
            Label enterDate = new Label("Enter Date of Sale");

            //create a combo list for item names and quantity
            ObservableList observableItemsList = FXCollections.observableArrayList();
            ComboBox ItemComboList = new ComboBox(observableItemsList);
            //add item names to the list 
            for (int i = 0; i < ItemList.size(); i++) {
                observableItemsList.add(ItemList.get(i).itemName);
            }

            //create a comboList for customer first name and last name
            ObservableList observableCustomerList = FXCollections.observableArrayList();
            ComboBox CustomerComboList = new ComboBox(observableCustomerList);
            //add customers first and last names to the list 
            for (int i = 0; i < CustomerList.size(); i++) {
                observableCustomerList.add(CustomerList.get(i).getID() + " " + CustomerList.get(i).firstName + " " + CustomerList.get(i).lastName);
            }

            //add to the pane 
            EnterSalepane.add(selectItemLabel, 0, 1);
            EnterSalepane.add(ItemComboList, 1, 1);

            EnterSalepane.add(selectCustomer, 0, 2);
            EnterSalepane.add(CustomerComboList, 1, 2);

            EnterSalepane.add(enterQuantity, 0, 4);
            EnterSalepane.add(txtQuantity, 1, 4);

            EnterSalepane.add(enterDate, 0, 5);
            EnterSalepane.add(txtDate, 1, 5);

            EnterSalepane.add(btnBack, 0, 9);
            EnterSalepane.add(btnEnter, 0, 8);

            //add action to the enter button 
            btnEnter.setOnAction(s -> {
                //creates a temporary empty vendor object 
                Vendor tempVendor = new Vendor("", "", "");

                //creates a temporary item object 
                Item tempItem = new Item("", 0.0, 0.0, 0.0, "", tempVendor, 0);

                //creates a temporary customer object 
                Customer tempCustomer = new Customer("", "", "", "", "");
                String IDString = " ";
                int check = 0;
                int ID = 0;
                IDString = CustomerComboList.getValue().toString();

                check = IDString.indexOf(" ");
                IDString = IDString.substring(0, check);
                ID = Integer.parseInt(IDString);

                //loop through customerList and match name selected with the object 
                for (int i = 0; i < CustomerList.size(); i++) {
                    if (ID == CustomerList.get(i).getID()) {
                        tempCustomer = CustomerList.get(i);
                    }
                }
                //Loop through the item list and match the item selected with an item in item list 
                for (int i = 0; i < ItemList.size(); i++) {
                    if ((ItemList.get(i).itemName) == ItemComboList.getValue()) {
                        tempItem = ItemList.get(i);
                    }
                }

                //turn value of quantity textfield into an Integer 
                txtQuantity.getText();
                int quantityInt = 0;
                quantityInt = Integer.parseInt(txtQuantity.getText());

                //create new sale object 
                Sale aSale = new Sale(tempItem, quantityInt, txtDate.getText(), tempCustomer);

                //add the new sale to the saleList 
                SaleList.add(aSale);

                //take customer, quantity(entry box-amount entered),  
                //create a new sale object w item selected
                //Sale aSale = new Sale(item,quantity, date, customer);
            });

            //set action for the back button
            btnBack.setOnAction(b -> {
                primaryStage.setScene(mainScene);
                primaryStage.show();
            });

            primaryStage.setScene(EnterSaleScene);
            primaryStage.show();

        });

        // option3 (print receipt)/////////////////////////////////////////////////////////////////////////////////////////////////*************** 
        btnPrintReceipt.setOnAction(a -> {

            GridPane ReceiptPane = new GridPane();
            Scene ReceiptScene = new Scene(ReceiptPane, 700, 500);
            ReceiptPane.setHgap(10);
            ReceiptPane.setVgap(5);

            ObservableList somethingElse = FXCollections.observableArrayList();
            ListView what = new ListView(somethingElse);
            Button btnCheck = new Button("Print Receipt");
            TextField results = new TextField();
            Button back = new Button("Back");

            ObservableList contList = FXCollections.observableArrayList();
            ComboBox comboList = new ComboBox(contList);

            for (int i = 0; i < SaleList.size(); i++) {
                contList.add(SaleList.get(i));
            }

            for (int i = 0; i < SaleList.size(); i++) {
                somethingElse.add(SaleList.get(i));
            }

            ReceiptPane.add(what, 0, 0);
            ReceiptPane.add(comboList, 0, 1);
            ReceiptPane.add(btnCheck, 0, 2);
            ReceiptPane.add(results, 0, 3, 16, 1);
            ReceiptPane.add(back, 0, 4);

            btnCheck.setOnAction(b -> {
                System.out.println(comboList.getValue());
                int saleChoice = 0;
                int saleChoice1 = 0;

                String userEdit = " ";
                String IDString = "";
                String IDString2 = "";
                int contToEdit = 0;

                IDString = comboList.getValue().toString();

                saleChoice = IDString.indexOf(" ");
                saleChoice = saleChoice + 1;
                saleChoice1 = IDString.indexOf("Item");
                saleChoice1 = saleChoice1 - 1;
                IDString = IDString.substring(saleChoice, saleChoice1);
                contToEdit = Integer.parseInt(IDString);
                System.out.println(contToEdit);

                for (int i = 0; i < SaleList.size(); i++) {
                    if (SaleList.get(i).getID() == contToEdit) {
                        System.out.println("check");
                        System.out.println(SaleList.get(i).toString2());
                        results.setText(SaleList.get(i).toString2());
                    }
                }

            });

            //return to the previous page 
            back.setOnAction(w -> {
                primaryStage.setScene(mainScene);
                primaryStage.show();
            });

            primaryStage.setScene(ReceiptScene);
            primaryStage.show();

        });

        //option 4-Vendor Details ////////////////////////////////////////////////////////////////////////////////////////////*****************
        btnVendorDetails.setOnAction(z -> {
            GridPane optionFourSelectionPane = new GridPane();
            Scene optionFourSelectionScene = new Scene(optionFourSelectionPane, 400, 400);
            optionFourSelectionPane.setAlignment(Pos.CENTER);
            optionFourSelectionPane.setHgap(10);
            optionFourSelectionPane.setVgap(5);

            Button btnAddVendor = new Button("Add Vendor");
            Button btnEditVendor = new Button("Edit Vendor");
            Button backToMain = new Button("Back");

            optionFourSelectionPane.add(btnAddVendor, 0, 0);
            optionFourSelectionPane.add(btnEditVendor, 0, 1);
            optionFourSelectionPane.add(backToMain, 0, 2);

            primaryStage.setScene(optionFourSelectionScene);
            primaryStage.show();

            // return to main menu
            backToMain.setOnAction(f -> {
                primaryStage.setScene(mainScene);
                primaryStage.show();
            });

            //Add a Vendor 
            btnAddVendor.setOnAction(y -> {

                GridPane AddVendorPane = new GridPane();
                Scene AddVendorScene = new Scene(AddVendorPane, 400, 400);

                AddVendorPane.setAlignment(Pos.CENTER);
                AddVendorPane.setHgap(10);
                AddVendorPane.setVgap(5);

                Button AddAVendor = new Button("Add");
                Button back = new Button("Back");

                //create labels 
                Label lblVendorName = new Label("Vendor Name");
                Label lblVendorAddress = new Label("Vendor Address");
                Label lblVendorPhoneNumber = new Label("Vendor Phone Number");

                //create text fields
                TextField txtVendorName = new TextField();
                TextField txtVendorAddress = new TextField();
                TextField txtVendorPhoneNumber = new TextField();

                //add labels to the pane 
                AddVendorPane.add(lblVendorName, 0, 0);
                AddVendorPane.add(lblVendorAddress, 0, 1);
                AddVendorPane.add(lblVendorPhoneNumber, 0, 2);

                //add text fields to the pane 
                AddVendorPane.add(txtVendorName, 1, 0);
                AddVendorPane.add(txtVendorAddress, 1, 1);
                AddVendorPane.add(txtVendorPhoneNumber, 1, 2);

                //Add the add button to the pane 
                AddVendorPane.add(AddAVendor, 0, 3);

                //add back button to the pane 
                AddVendorPane.add(back, 0, 4);

                primaryStage.setScene(AddVendorScene);
                primaryStage.show();

                //add vendor button
                AddAVendor.setOnAction(x -> {
                    String VendorName = "";
                    String VendorAddress = "";
                    String VendorPhone = "";

                    VendorName = txtVendorName.getText();
                    VendorAddress = txtVendorAddress.getText();
                    VendorPhone = txtVendorPhoneNumber.getText();

                    Vendor someVendor = new Vendor(VendorName, VendorAddress, VendorPhone);
                    VendorList.add(someVendor);
                });

                //return to the previous page 
                back.setOnAction(w -> {
                    primaryStage.setScene(optionFourSelectionScene);
                    primaryStage.show();
                });
            });

            //EDIT A Vendor
            btnEditVendor.setOnAction(a -> {
                GridPane EditVendorPane = new GridPane();
                Scene EditVendorScene = new Scene(EditVendorPane, 800, 600);

                EditVendorPane.setHgap(10);
                EditVendorPane.setVgap(5);

                //create radio buttons for edit vendor 
                RadioButton rdoVendorName = new RadioButton("Edit Vendor Name");
                RadioButton rdoVendorAddress = new RadioButton("Edit Vendor Address");
                RadioButton rdoVendorPhone = new RadioButton("Edit Vendor Phone");
                ToggleGroup btnGroup = new ToggleGroup();

                rdoVendorName.setToggleGroup(btnGroup);
                rdoVendorAddress.setToggleGroup(btnGroup);
                rdoVendorName.setToggleGroup(btnGroup);

                TextArea currentText = new TextArea();
                TextField txtEdit = new TextField();
                Button btnEdit = new Button("Edit");
                Button btnBack = new Button("Back");

                //create observable list and combo list 
                ObservableList venList = FXCollections.observableArrayList();
                ComboBox comboListVendor = new ComboBox(venList);
                //loop through vendor list and add to ven list
                for (int i = 0; i < VendorList.size(); i++) {
                    venList.add(VendorList.get(i));
                }

                EditVendorPane.add(comboListVendor, 3, 1);
                EditVendorPane.add(rdoVendorName, 3, 2);
                EditVendorPane.add(rdoVendorAddress, 3, 3);
                EditVendorPane.add(rdoVendorPhone, 3, 4);
                EditVendorPane.add(txtEdit, 3, 5);
                EditVendorPane.add(btnEdit, 2, 6);
                EditVendorPane.add(btnBack, 2, 7);
                EditVendorPane.add(currentText, 0, 0, 10, 1);

                comboListVendor.setOnAction(f -> {
                    currentText.clear();
                    int ID = 0;
                    int Space = 0;
                    String IDString = "";
                    IDString = comboListVendor.getValue().toString();
                    Space = IDString.indexOf(" ");
                    IDString = IDString.substring(0, Space);
                    System.out.println(IDString);
                    ID = Integer.parseInt(IDString);

                    for (int i = 0; i < VendorList.size(); i++) {
                        if (VendorList.get(i).getVendorID() == ID) {
                            currentText.appendText(VendorList.get(i).toString());
                        }
                    }
                });
                btnEdit.setOnAction(b -> {
                    currentText.clear();
                    String userEdit = " ";
                    String IDString = "";
                    int VendorIDCheck = 0;
                    int VendorToEdit = 0;
                    userEdit = txtEdit.getText();

                    System.out.println(comboListVendor.getValue());
                    IDString = comboListVendor.getValue().toString();

                    VendorIDCheck = IDString.indexOf(" ");
                    IDString = IDString.substring(0, VendorIDCheck);
                    VendorToEdit = Integer.parseInt(IDString);
                    for (int i = 0; i < VendorList.size(); i++) {
                        if (VendorList.get(i).getVendorID() == VendorToEdit) {
                            if (rdoVendorName.isSelected()) {
                                VendorList.get(i).vendorName = userEdit;
                            } else if (rdoVendorAddress.isSelected()) {
                                VendorList.get(i).vendorAddress = userEdit;
                            } else if (rdoVendorPhone.isSelected()) {
                                VendorList.get(i).vendorPhone = userEdit;
                            }
                        }

                    }
                    for (int i = 0; i < VendorList.size(); i++) {
                        if (VendorList.get(i).getVendorID() == VendorToEdit) {
                            currentText.appendText(VendorList.get(i).toString());
                        }
                    }
                    currentText.clear();

                });

                //return to the previous page 
                btnBack.setOnAction(w -> {
                    primaryStage.setScene(optionFourSelectionScene);
                    primaryStage.show();
                });

                primaryStage.setTitle("Valley Depot");
                primaryStage.setScene(EditVendorScene);
                primaryStage.show();

            });

        });

        // reports 
        btnPrintReport.setOnAction(y -> {

            GridPane reportsPane = new GridPane();
            Scene reportsScene = new Scene(reportsPane, 400, 400);
            reportsPane.setAlignment(Pos.CENTER);
            reportsPane.setHgap(10);
            reportsPane.setVgap(5);

            Button btnCustomerPurchaseHistory = new Button("Customer Purchase History");
            Button btnItemPurchaseHistory = new Button("Item Purchase History");
            Button btnInventoryLevels = new Button("Inventory Levels");
            Button btnBack = new Button("Back");

            reportsPane.add(btnCustomerPurchaseHistory, 0, 0);
            reportsPane.add(btnItemPurchaseHistory, 0, 1);
            reportsPane.add(btnInventoryLevels, 0, 2);
            reportsPane.add(btnBack, 0, 3);

            btnBack.setOnAction(w -> {
                primaryStage.setScene(mainScene);
                primaryStage.show();
            });

            primaryStage.setScene(reportsScene);
            primaryStage.show();

            //Cusotmer Purchase History ///////////////
            btnCustomerPurchaseHistory.setOnAction(e -> {

                GridPane customerPurchaseHistoryPane = new GridPane();
                Scene customerPurchaseHistoryScene = new Scene(customerPurchaseHistoryPane, 700, 500);
                customerPurchaseHistoryPane.setAlignment(Pos.CENTER_LEFT);
                customerPurchaseHistoryPane.setHgap(10);
                customerPurchaseHistoryPane.setVgap(5);

                ObservableList contList = FXCollections.observableArrayList();
                ComboBox comboList = new ComboBox(contList);
                Button btnPrintCustomerList = new Button("Print The Customer's History");
                Button btnBack1 = new Button("Back");
                TextArea txtOutput = new TextArea();

                for (int i = 0; i < CustomerList.size(); i++) {
                    contList.add(CustomerList.get(i));
                }

                for (int i = 0; i < ContractorList.size(); i++) {
                    contList.add(ContractorList.get(i));
                }

//                ObservableList somethingElse = FXCollections.observableArrayList();
//                ListView what = new ListView(somethingElse);
//
//                for (int i = 0; i < CustomerList.size(); i++) {
//                    somethingElse.add(CustomerList.get(i));
//                }
//
//                for (int i = 0; i < ContractorList.size(); i++) {
//                    somethingElse.add(ContractorList.get(i));
//                }
                //  customerPurchaseHistoryPane.add(what, 0, 0);
                customerPurchaseHistoryPane.add(comboList, 0, 1);
                customerPurchaseHistoryPane.add(btnPrintCustomerList, 0, 2);
                customerPurchaseHistoryPane.add(btnBack1, 0, 4);
                customerPurchaseHistoryPane.add(txtOutput, 0, 3);

                btnPrintCustomerList.setOnAction(c -> {
                    txtOutput.clear();
                    int ID = 0;
                    int Space = 0;
                    String IDString = "";
                    IDString = comboList.getValue().toString();
                    Space = IDString.indexOf(" ");
                    IDString = IDString.substring(0, Space);
                    ID = Integer.parseInt(IDString);

                    for (int i = 0; i < SaleList.size(); i++) {
                        if (SaleList.get(i).customerSold.getID() == ID) {
                            txtOutput.appendText("Item Name:" + SaleList.get(i).itemSold.itemName + " Quantity: " + SaleList.get(i).quantity
                                    + " Total Purchase Cost: " + (SaleList.get(i).quantity * SaleList.get(i).itemSold.getCost())
                                    + " Date: " + SaleList.get(i).date + "\n");
                        }
                    }

                });

                btnBack1.setOnAction(w -> {
                    primaryStage.setScene(reportsScene);
                    primaryStage.show();
                });

                primaryStage.setScene(customerPurchaseHistoryScene);
                primaryStage.show();

            });
            //Item Purchase History
            btnItemPurchaseHistory.setOnAction(e -> {

                GridPane itemPurchaseHistoryPane = new GridPane();
                Scene itemPurchaseHistoryScene = new Scene(itemPurchaseHistoryPane, 700, 500);
                itemPurchaseHistoryPane.setAlignment(Pos.CENTER_LEFT);
                itemPurchaseHistoryPane.setHgap(10);
                itemPurchaseHistoryPane.setVgap(5);

                ObservableList contList = FXCollections.observableArrayList();
                ComboBox comboList = new ComboBox(contList);
                Button btnPrintItemList = new Button("Print The Item's History");
                Button btnBack2 = new Button("Back");
                TextArea txtOutput = new TextArea();

                for (int i = 0; i < ItemList.size(); i++) {
                    contList.add(ItemList.get(i));
                }

//                ObservableList somethingElse = FXCollections.observableArrayList();
//                ListView what = new ListView(somethingElse);
//
//                for (int i = 0; i < ItemList.size(); i++) {
//                    somethingElse.add(ItemList.get(i));
//                }
//
//                itemPurchaseHistoryPane.add(what, 0, 0);
                itemPurchaseHistoryPane.add(comboList, 0, 1);
                itemPurchaseHistoryPane.add(btnPrintItemList, 0, 2);
                itemPurchaseHistoryPane.add(btnBack2, 0, 4);
                itemPurchaseHistoryPane.add(txtOutput, 0, 3);

                btnPrintItemList.setOnAction(c -> {
                    txtOutput.clear();
                    int ID = 0;
                    int Space = 0;
                    String IDString = "";
                    IDString = comboList.getValue().toString();
                    Space = IDString.indexOf(" ");
                    IDString = IDString.substring(0, Space);
                    ID = Integer.parseInt(IDString);

                    for (int i = 0; i < SaleList.size(); i++) {
                        if (SaleList.get(i).itemSold.getID() == ID) {
                            txtOutput.appendText("Name:" + SaleList.get(i).customerSold.firstName + " " + SaleList.get(i).customerSold.lastName
                                    + " Date: " + SaleList.get(i).date + " Quantity Purchased: " + SaleList.get(i).quantity);
                        }
                    }

                });

                btnBack2.setOnAction(w -> {
                    primaryStage.setScene(reportsScene);
                    primaryStage.show();
                });

                primaryStage.setScene(itemPurchaseHistoryScene);
                primaryStage.show();
            });

            //Inventory Levels 
            btnInventoryLevels.setOnAction(a -> {

                GridPane inventoryLevelPane = new GridPane();
                Scene inventoryLevelScene = new Scene(inventoryLevelPane, 400, 400);
                inventoryLevelPane.setAlignment(Pos.CENTER);
                inventoryLevelPane.setHgap(10);
                inventoryLevelPane.setVgap(5);

                TextArea inventoryLevels = new TextArea();
                Button btnBack1 = new Button("Back");

                for (Item item : ItemList) {
                    inventoryLevels.appendText("Item ID: " + item.getID()
                            + " Item Name: " + item.itemName + "Item Quantity: " + item.quantity + "\n");
                }

                inventoryLevelPane.add(inventoryLevels, 0, 0);
                inventoryLevelPane.add(btnBack1, 0, 1);

                primaryStage.setScene(inventoryLevelScene);
                primaryStage.show();

                btnBack1.setOnAction(w -> {
                    primaryStage.setScene(reportsScene);
                    primaryStage.show();
                });

            });

        });

        primaryStage.setTitle("Valley Depot");
        primaryStage.setScene(mainScene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
