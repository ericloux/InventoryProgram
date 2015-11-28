package inventoryProgram;

import java.awt.*;
import java.awt.event.*;

public class View {

   private Frame frame; 
   private Frame POFrame;
   private Frame shipmentFrame;
   private Frame orderFrame;
   private Frame stagingFrame;
   private Frame scrapFrame;
   private Panel navigationPanel;

   public View(){

   }

   public static void main(String[] args){
	   
   }

   public void prepareGUI(ActionListener buttonListener){
      frame = new Frame("Loux Inventory System");
      frame.setSize(640,480);
      frame.setLayout(new GridLayout(3, 1));
      
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    

      navigationPanel = new Panel();
      navigationPanel.setLayout(new FlowLayout());
      
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
      
      Button stagedButton = new Button("Mark Job Staged");
      stagedButton.setActionCommand("Mark Staged");
      stagedButton.addActionListener(buttonListener);
      navigationPanel.add(stagedButton);
      
      Button scrapButton = new Button("Scrap Out Ware");
      scrapButton.setActionCommand("Scrap");
      scrapButton.addActionListener(buttonListener);
      navigationPanel.add(scrapButton);
      
      frame.add(navigationPanel);
      frame.setVisible(true);
   }
   
   public void setPOPanel() {
	   frame.removeAll();
	   frame.add(navigationPanel);
   }
}
