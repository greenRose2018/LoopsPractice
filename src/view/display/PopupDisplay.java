package view.display;

import javax.swing.JOptionPane;

public class PopupDisplay
{
	// loop up listPractice for help
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	public String getResponse(String questionAsked)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, questionAsked);
		
		return response;
	}
	
}