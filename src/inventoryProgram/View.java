package inventoryProgram;

import java.awt.*;
import java.awt.event.*;

public class View {

    private Frame programFrame; 
    
    private Panel navigationPanel;
    private Panel addProductPanel;

    public View(){

    }

    public static void main(String[] args){
	   
    }

    public void prepareGUI(ActionListener buttonListener){

    	programFrame = new Frame("Loux Inventory System");
    	programFrame.setSize(720,540);
    	programFrame.setLayout(new FlowLayout());
    	
	   	programFrame.addWindowListener(new WindowAdapter() {
	   		public void windowClosing(WindowEvent windowEvent){
	   			System.exit(0);
	   		}        
	   	});    
    	
	   	navigationPanel = new Panel();
      	navigationPanel.setLayout(new FlowLayout());
      
      	Button statusButton = new Button("Status");
      	statusButton.setActionCommand("Status");
      	statusButton.addActionListener(buttonListener);
      	navigationPanel.add(statusButton);
      
      	Button addPOButton = new Button("Add PO");
      	addPOButton.setActionCommand("Add PO");
      	addPOButton.addActionListener(buttonListener);
      	navigationPanel.add(addPOButton);
      
      	Button receiveShipmentButton = new Button("Receive Shipment");
      	receiveShipmentButton.setActionCommand("Receive");
      	receiveShipmentButton.addActionListener(buttonListener);
      	navigationPanel.add(receiveShipmentButton);
      
      	Button newJobButton = new Button("Create New Job");
      	newJobButton.setActionCommand("New Job");
      	newJobButton.addActionListener(buttonListener);
      	navigationPanel.add(newJobButton);
      
      	Button scrapButton = new Button("Scrap Out Ware");
      	scrapButton.setActionCommand("Scrap");
      	scrapButton.addActionListener(buttonListener);
      	navigationPanel.add(scrapButton);
      
      	Button databaseButton = new Button("Database");
      	databaseButton.setActionCommand("Database");
      	databaseButton.addActionListener(buttonListener);
      	navigationPanel.add(databaseButton);
      
      	programFrame.add(navigationPanel);
      	
      	addProductPanel = new Panel();
      	addProductPanel.setLayout(new FlowLayout());
      	
      	
      	
        programFrame.setVisible(true);
    }

    public void setStatusPanel() {

	    programFrame.removeAll();
	    programFrame.add(navigationPanel);
    }
    
    public void setPOPanel() {
    	
	    programFrame.removeAll();
	    programFrame.add(navigationPanel);
    }
    
    public void setShipmentPanel() {

	    programFrame.removeAll();
	    programFrame.add(navigationPanel);
    }
    
    public void setOrderFrame() {

	    programFrame.removeAll();
	    programFrame.add(navigationPanel);
    }
    
    public void setScrapFrame() {

	    programFrame.removeAll();
	    programFrame.add(navigationPanel);
    }
    
    public void setDatabaseFrame() {

	    programFrame.removeAll();
	    programFrame.add(navigationPanel);
    }
}
