import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
//import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Display disp = new Display ();
		Shell shl = new Shell(disp);
		
		Label helloWrd = new Label(shl,SWT.NONE);
		helloWrd.setText("Hello World!");
		helloWrd.pack();
		
		shl.pack();
		shl.open ();
		while (!shl.isDisposed ()) {
			if(!disp.readAndDispatch ()) disp.sleep ();
		}
		disp.dispose ();
			System.out.println("Hello World!");
	}

}
