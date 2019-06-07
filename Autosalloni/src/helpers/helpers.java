package helpers;

import java.util.ArrayList;

public class helpers {

	public static String formatSentence(String message, int length) {
		ArrayList<String> a = new ArrayList<String>();
		while (true) {
			if (message.length() > length) {
				try {
					for (int i = 0; i < message.length(); i++) {
						if (message.charAt(length + i) == ' ') {
							a.add(message.substring(0, length + i).trim());
							message = message.substring(length + i).trim();
							break;
						}
					}
				} catch (StringIndexOutOfBoundsException e) {
					a.add(message);
					break;
				}

			} else {
				a.add(message);
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (String s : a) {
			sb.append(s);
			sb.append("\n");
		}

		return sb.toString();
	}
	
	public static int returnId(String str) {
		
		str = str.replaceAll("[^\\d+]", "");
		int id = Integer.parseInt(str);
		return id;
	}
	public static Boolean convertToBoolean(Object str) {
		
	return Boolean.valueOf(String.valueOf(str));

	}
	
	
	
}
