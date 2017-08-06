package GUI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;


public class SelectLaguage {
	public void setLang() {
		
		Display display = new Display ();
		Shell shell = new Shell(display);
		shell.setLayout(new RowLayout(SWT.VERTICAL));
		shell.setText("Language");
		int x = 150;
		int y = 170;
		
		Label set = new Label(shell,SWT.NONE);
		set.setText("Select Language");
		set.pack();
		//Group
		Group LangGroup = new Group(shell,SWT.NONE);
		LangGroup.setLayout(new RowLayout(SWT.VERTICAL));
		//English
		Button English = new Button(LangGroup,SWT.RADIO);
		English.setText("English");
		//German
		Button Germ = new Button(LangGroup,SWT.RADIO);
		Germ.setText("German");
		//French
		Button French = new Button(LangGroup,SWT.RADIO);
		French.setText("French");
		
		Button cont = new Button(shell,SWT.PUSH);
		cont.setText("Next");
		cont.setSize(x, 0);
		
		shell.setSize(x, y);
		//shell.pack();
		
		shell.open ();
		
		
		
		while (!shell.isDisposed ()) {
			//st = msg.getText();
			if(!display.readAndDispatch ()) display.sleep ();
			
			
			
		}
		display.dispose ();
		//HelloWorldDialog dialog = new HelloWorldDialog();
		//dialog.createDialog();
	}

}
