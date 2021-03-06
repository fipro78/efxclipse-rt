/*******************************************************************************
 * Copyright (c) 2016 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.text.rules;

import java.util.function.IntPredicate;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

@SuppressWarnings("restriction")
public class ColumnStartRule implements IRule {
	private final IRule rule;
	private final IntPredicate columnCheck;

	public ColumnStartRule(IRule rule, IntPredicate columnCheck) {
		this.rule = rule;
		this.columnCheck = columnCheck;
	}

	@Override
	public final IToken evaluate(ICharacterScanner scanner) {
		if( columnCheck.test(scanner.getColumn()) ) {
			return rule.evaluate(scanner);
		}
		return Token.UNDEFINED;
	}

}
