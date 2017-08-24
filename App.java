import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				 new MainFrame();  //object is created
		           //These 4 lines is added to MainFrame class 
		          //1  JFrame frame = new JFrame("Hello World"); // new JFrame is a constructor, and in that constructor we are passing a string called hello world
		          //2  frame.setSize(600,500);
		          //3  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //if this is commented, the program just closes but not actually exit.
		          //4  frame.setVisible(true);  //to make JFrame visible
		          
		          //summary...this is now a very simple main method
			}
		});

	}

}
