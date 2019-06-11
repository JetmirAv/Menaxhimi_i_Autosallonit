package helpers;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import view.Main;

public class JWT {

	private static final String SECRET_KEY = "SomeSuperSecretKeyToHandleLogin";

	public static String generateJWTToken(int id, int roleId, String name, String surname, String email) throws RuntimeException {

		String secretKey = SECRET_KEY;
		String header = "{\"typ\":\"JWT\",\"alg\":\"HS256\"}";
		String base64UrlHeader = Base64.getUrlEncoder().withoutPadding().encodeToString(header.getBytes());

		// JWT token expires 60 seconds from now
		long timeSecs = (System.currentTimeMillis() / 1000) + 12*60;

		String payload = "{\"id\":\""+ id + "\","
				+ "\"roleId\":\""+  roleId + "\"," 
				+ "\"name\":\""+  name + "\","
				+ "\"surname\":\""+  surname + "\","
 				+ "\"email\":\""+  email + "\"}";
		
		String base64UrlPayload = Base64.getUrlEncoder().withoutPadding().encodeToString(payload.getBytes());

		try {
			String base64UrlSignature = hmacEncode(base64UrlHeader + "." + base64UrlPayload, secretKey);

			return base64UrlHeader + "." + base64UrlPayload + "." + base64UrlSignature;
		} catch (Exception e) {
			throw new RuntimeException("Unable to generate a JWT token.");
		}
	}

	public static String hmacEncode(String data, String key) throws Exception {
		Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		SecretKeySpec secret_key = new SecretKeySpec(key.getBytes(), "HmacSHA256");
		sha256_HMAC.init(secret_key);

		return Base64.getUrlEncoder().withoutPadding().encodeToString(sha256_HMAC.doFinal(data.getBytes()));
	}
	
	public static String decodeBase64(String data) {
		byte[] decodedBytes = Base64.getDecoder().decode(data);
		String result = new String(decodedBytes);
		return result;
	}
	
	public static void decodeJWT(String hash) {
	
		ArrayList<Integer> info1 = new ArrayList<Integer>();
		ArrayList<String> info2 = new ArrayList<String>();
		String payload = hash.split("\\.")[1];
		String decoded = decodeBase64(payload);
		decoded = decoded.substring(1, decoded.length() -1);
		String[] parts = decoded.split("\\,");
		System.out.println(decoded);
		
		
		for (String string : parts) {
			string = string.split(":")[1];
			string = string.substring(1, string.length()-1);
			try {
				int num = Integer.parseInt(string);
				info1.add(num);
//				System.out.println(num);
			} catch (NumberFormatException e) {
				info2.add(string);
//				System.out.println(string);
			}
		}
		
		Main.loggedId = info1.get(0);
		Main.loggedRole = info1.get(1);
		Main.loggedName = info2.get(0);
		Main.loggedSurname = info2.get(1);
		Main.loggedEmail = info2.get(2);
	}
	

//	public static void main(String[] args) {
//		
//		String hash = generateJWTToken(1, 1, "Jetmir", "Avdullahu", "jetmir99@hotmail.com");
//		
//		decodeJWT(hash);		
//	}
}
