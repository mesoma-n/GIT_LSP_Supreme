package org.howard.edu.lsp.midterm.question1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I love CSCI363";
        String encryptedMessage = SecurityOps.encrypt(text);

        System.out.println("Original Message: " + text);
        System.out.println("Encrypted Message: " + encryptedMessage);
    }

	}


