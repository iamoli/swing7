import java.awt.BorderLayout;

import javax.swing.JFrame;

//MainFrame here is the controller (M-V-C).  MainFrame is holding the components and telling them what to do.
public class MainFrame extends JFrame { // creating a class from parent class JFrame - built-in class

	private TextPanel textPanel;
	private Toolbar toolBar;

	public MainFrame() {

		super("Hello World"); // super means calling the super class constructor

		setLayout(new BorderLayout());

		toolBar = new Toolbar();
		textPanel = new TextPanel();

		toolBar.setStringListener (new StringListener () {     // the trick is to set or add  a Listener in the component to the controller, in this case, 
             public void textEmitted(String text) {            // it's the Mainframe acts as the controller.
				textPanel.appendText(text);                   //  This is to have a central communication. The switchboard or  controller listens and tell the 
			}                                                 // components (ex. toolbar) what to do.
		});                                                   // public void textEmitted(String text) - The mainframe intercepts this method calls so that when the button
		                                                      // is clicked the toolbar is calling the textEmitted method in this unanimous class and then append the text.

		add(toolBar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
