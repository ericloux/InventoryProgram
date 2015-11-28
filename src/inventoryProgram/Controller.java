package inventoryProgram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	static Model inv_model;
	static View inv_view;
	
	private static class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "Add PO")
			{
				inv_view.setPOPanel();
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
		
	}
}
