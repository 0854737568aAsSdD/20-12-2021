package com.dmt.utills;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	private String hashpass = "";

	public String getHashPass(String password) throws NoSuchAlgorithmException {

		String plainText = password;
		System.out.println(plainText);
		MessageDigest mdAlgorithm = MessageDigest.getInstance("MD5");
		mdAlgorithm.update(plainText.getBytes());
	
		byte[] digest = mdAlgorithm.digest();
		StringBuffer hexString = new StringBuffer();

		for (int i = 0; i < digest.length; i++) {
			plainText = Integer.toHexString(0xFF & digest[i]);

			if (plainText.length() < 2) {
				plainText = "0" + plainText;
			}

			hexString.append(plainText);
		}
		hashpass = hexString.toString();

		return hashpass;
	}

}


