package org.eclipse.fx.code.editor.langs.themes;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.fx.ui.services.theme.MultiURLStylesheet;
import org.eclipse.fx.ui.services.theme.Theme;
import org.eclipse.jdt.annotation.NonNull;
import org.osgi.service.component.annotations.Component;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@Component
public class DefaultEditorStylesheets implements MultiURLStylesheet {
	private ObservableList<@NonNull URL> stylesheets;

	public DefaultEditorStylesheets() {
		ObservableList<@NonNull URL> stylesheets = FXCollections.emptyObservableList();

		try {
			stylesheets = FXCollections.observableArrayList(
					  new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/adoc.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/ceylon.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/dart.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/go.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/groovy.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/java.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/js.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/kotlin.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/lua.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/php.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/python.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/rust.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/swift.css")
					, new URL("platform:/plugin/org.eclipse.fx.code.editor.langs/org/eclipse/fx/code/editor/ldef/langs/xml.css")
			);
		} catch (MalformedURLException e) {
		}

		this.stylesheets = stylesheets;
	}

	@Override
	public boolean appliesToTheme(Theme t) {
		return true;
	}

	@Override
	public ObservableList<@NonNull URL> getURL(Theme t) {
		return stylesheets;
	}
}