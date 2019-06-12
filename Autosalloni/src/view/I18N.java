package view;

import java.util.List;

import java.util.Locale;
import java.util.ResourceBundle;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class I18N {

	public static ObjectProperty<Locale> locale;

	static {
		locale = new SimpleObjectProperty<>(getDefaultLocale());
	}

	public static List<Locale> getLanguages() {
		return new ArrayList<Locale>(Arrays.asList(Locale.ENGLISH, new Locale("al", "AL")));
	}

	public static Locale getDefaultLocale() {
		return Locale.ENGLISH;
	}

	public static Locale getLocale() {
		return locale.get();
	}

	public static void setLocale(Locale locale) {
		localProperty().set(locale);
	}

	public static ObjectProperty<Locale> localProperty() {
		return locale;
	}

	public static String get(String key, Object... args) throws IOException {
		String current = new java.io.File(".").getCanonicalPath();

		ResourceBundle bundle = ResourceBundle.getBundle("Translates.translate", getLocale()); // wrong path

		return MessageFormat.format(bundle.getString(key), args);
	}

	public static StringBinding createStringBinding(String key, Object... args) {
		return Bindings.createStringBinding(() -> get(key, args), locale);
	}

	public static Label getLabel(String key, Object... args) {
		Label label = new Label();
		label.textProperty().bind(createStringBinding(key, args));
		return label;
	}

	public static Button getButton( String key, Object... args) {
		Button button = new Button();
		button.textProperty().bind(createStringBinding(key, args));
		return button;
	}

	public static Text getText(final String key,  Object... args) {
		Text text = new Text();
		text.textProperty().bind(createStringBinding(key, args));
		return text;
	}
	
//	public static String getString( String key,  Object... args) {
//		String string = new Label();
//		string.textProperty().bind(createStringBinding(key, args));
//		return string;
//	}


//	public static Button buttonForKey(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
