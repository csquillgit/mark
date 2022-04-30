package myrcpapp;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {

  @Override
	public void createPartControl(final Composite parent) {
	  Text text = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
    text.setText("Hello, world!");
	}

  @Override
	public void setFocus() {
	}
}