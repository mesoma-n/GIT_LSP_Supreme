package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
	/**
     * Encrypts a message by separating letters and digits based on even and odd indices,
     * ignoring punctuation and whitespace.
     *
     * @param text The message to encrypt (String).
     * @return The encrypted message (String).
     */

	    public static String encrypt(String  text) {
	        StringBuilder encrypted = new StringBuilder();

	        // Filter out non-alphanumeric characters before processing
	        StringBuilder filtered = new StringBuilder();
	        for (int i = 0; i <  text.length(); i++) {
	            char ch =  text.charAt(i);
	            if (Character.isLetterOrDigit(ch)) {
	                filtered.append(ch);
	            }
	        }

	        // Separate even and odd characters from the filtered message
	        StringBuilder evenChars = new StringBuilder();
	        StringBuilder oddChars = new StringBuilder();
	        for (int i = 0; i < filtered.length(); i++) {
	            char ch = filtered.charAt(i);
	            if (i % 2 == 0) {
	                evenChars.append(ch);
	            } else {
	                oddChars.append(ch);
	            }
	        }

	        // Clear the original StringBuilder and append the encrypted result
	        encrypted.setLength(0);
	        encrypted.append(evenChars).append(oddChars);
	        return encrypted.toString();
	    }
    }
		
	


