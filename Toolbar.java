import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {  //ActionListener is a built-in Interface
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private StringListener textListener;             // Now, there's is no reference about the text area.  This is only have reference to the StringListener and the toolbar 
	                                                 // only cares about the method called textEmitted so that the toolbar can call that method when a button is clicked.
	public Toolbar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT)); //added FlowLayout.LEFT so that the buttons will set there. It's optional, you can always put like setLayout(new FlowLayout());
		//FloyLayout cannot be aligned vertically unfortunately.
		
		add(helloButton);
		add(goodbyeButton);
	}
	
    public void setStringListener (StringListener listener) {
    	this.textListener = listener;
    }
    
    public void actionPerformed(ActionEvent e) {
    		JButton clicked = (JButton)e.getSource();
    		
    		if(clicked == helloButton) {
    			if(textListener != null) {
    				textListener.textEmitted("Hello\n");
    				
    			}
    			
    		}
    		else if(clicked == goodbyeButton) {
    			if(textListener != null) {
    				textListener.textEmitted("Goodbye\n");
    			}
    		}
    }


}

