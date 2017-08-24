
//This interface enables me to separate the toolbar and the textarea component.
// NOw, the toolbar doesn't know about the text area. No reference already.

public interface StringListener {                
	public void textEmitted (String text);

}
