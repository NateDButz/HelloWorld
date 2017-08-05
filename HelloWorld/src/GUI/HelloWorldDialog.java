package GUI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HelloWorldDialog {

	public HelloWorldDialog() {
		//Create instance of HelloWorldDialog
	}
	
	public void createDialog() {
		String st = "";
		Display disp = new Display ();
		Shell shl = new Shell(disp);
		shl.setLayout(new RowLayout());
		
		Label helloWrd = new Label(shl,SWT.NONE);
		helloWrd.setText("Hello Nate!");
		helloWrd.pack();
		Text msg = new Text(shl,SWT.NONE);
		msg.pack();
		
		shl.pack();
		shl.open ();
		while (!shl.isDisposed ()) {
			st = msg.getText();
			if(!disp.readAndDispatch ()) disp.sleep ();
			
		}
		disp.dispose ();
		System.out.println("Hello World! - "+ st);
	}
}
