/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.snippets;

/*
 * example snippet: create a table (lazy)
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 */
import org.eclipse.fx.runtime.swtutil.SWTUtil;
import org.eclipse.fx.runtime.swtutil.SWTUtil.BlockCondition;
import org.eclipse.fx.runtime.swtutil.SWTUtil.SWTAppStart;
import org.eclipse.swt.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;

public class Snippet7 implements SWTAppStart {

	public static void main(String[] args) {
		SWTUtil.getInstance().bootstrap(new Snippet7());
	}

	@Override
	public BlockCondition createApp(final Display display) {
		final Image image = new Image(display, 16, 16);
		GC gc = new GC(image);
		gc.setBackground(display.getSystemColor(SWT.COLOR_RED));
		gc.fillRectangle(image.getBounds());
		gc.dispose();
		final Shell shell = new Shell(display);
		shell.setText("Lazy Table");
		shell.setLayout(new FillLayout());
		final Table table = new Table(shell, SWT.BORDER | SWT.MULTI);
		table.setSize(200, 200);
		Thread thread = new Thread() {
			public void run() {
				for (int i = 0; i < 20000; i++) {
					if (table.isDisposed())
						return;
					final int[] index = new int[] { i };
					display.syncExec(new Runnable() {
						public void run() {
							if (table.isDisposed())
								return;
							TableItem item = new TableItem(table, SWT.NONE);
							item.setText("Table Item " + index[0]);
							item.setImage(image);
						}
					});
				}
			}
		};
		thread.start();
		shell.setSize(200, 200);
		SWTUtil.getInstance().openBlocking(shell);
		image.dispose();
		return null;
	}
}