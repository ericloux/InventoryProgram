package inventoryProgram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;

import java.io.Console;

public class Controller {

	static Model inv_model;
	static View inv_view;
	
	private static class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {

			switch (e.getActionCommand())
			{
			case "Status":
				inv_view.setStatusPanel();
				break;
				
			case "Add PO":
				inv_view.setPOPanel();
				break;

			case "Receive":
				inv_view.setShipmentPanel();
				break;

			case "New Job":
				inv_view.setOrderFrame();
				break;

			case "Scrap":
				inv_view.setScrapFrame();
				break;

			case "Database":
				inv_view.setDatabaseFrame();
				break;
			}
	   	}		
	}

	public static void main(String[] args) {
		
	    String[] arguments = new String[] {""};
	    View.main(arguments);

		inv_model = new Model();
		inv_view = new View();
		ActionListener buttonListener = new ButtonClickListener();
		inv_view.prepareGUI(buttonListener);
		
		String database_path = "C:\\Users\\Loux\\git\\InventoryProgram\\src\\inventoryProgram\\";
		try {
			FileReader reader = new FileReader(database_path+"product_database");
			
			while (reader.ready())
			{
				int input = reader.read();
				System.out.print((char) input);
			}
			
			System.out.print(reader.read());
			reader.close();
		} catch (IOException e) {
            e.printStackTrace();
        }
	}
}
