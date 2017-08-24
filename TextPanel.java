import java.awt.BorderLayout;

//TextPanel is just a JPanel with a scrollpane embedded in it and a textArea embedded in the scrollPane.

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {

	private JTextArea textArea;

	public TextPanel() {              //this is a constructor,similar to method but constructor doesn't have return type
		textArea = new JTextArea();

		setLayout(new BorderLayout()); // setting a layout in the TextPanel not in the MainFrame
		add(textArea, BorderLayout.CENTER); // this textArea here occupies all the JPanel; the solution to have
											// scrollbar is below...
		add(new JScrollPane(textArea), BorderLayout.CENTER);  //added scrollpane and pass it to textArea
	}
	
	public void appendText(String text)	{
		textArea.append(text);
	}
}
