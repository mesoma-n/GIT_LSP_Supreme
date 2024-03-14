package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {

	public static String encrypt (String text) {
		// TODO Auto-generated method stub
		StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                encrypted.append(ch);
            }
        }

        String filtered = encrypted.toString();
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

        encrypted.setLength(0); // Clear the StringBuilder
        encrypted.append(evenChars).append(oddChars);
        return encrypted.toString();
    }
		
	}


