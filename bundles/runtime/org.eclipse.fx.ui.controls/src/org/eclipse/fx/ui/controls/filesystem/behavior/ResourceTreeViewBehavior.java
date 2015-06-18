/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ui.controls.filesystem.behavior;

import java.util.Collections;

import javafx.event.Event;

import org.eclipse.fx.ui.controls.filesystem.DirectoryTreeView;
import org.eclipse.fx.ui.controls.filesystem.ResourceEvent;
import org.eclipse.fx.ui.controls.filesystem.ResourceTreeView;

import com.sun.javafx.scene.control.behavior.BehaviorBase;

/**
 * Behavior for {@link DirectoryTreeView}
 *
 * @since 1.2
 */
@SuppressWarnings("restriction")
public class ResourceTreeViewBehavior extends BehaviorBase<ResourceTreeView> {

	/**
	 * Create a new behavior
	 *
	 * @param control
	 *            the control
	 */
	public ResourceTreeViewBehavior(ResourceTreeView control) {
		super(control, Collections.emptyList());
	}

	/**
	 * Fire an event to open resources
	 */
	public void openSelectedResources() {
		Event.fireEvent(getControl(), ResourceEvent.createOpenResource(
				getControl(), getControl().getSelectedItems()));
	}
}
