package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class JavaWarmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "src/org/howard/edu/lsp/assignment2/words.txt";
		Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
		try {
			
			FileReader file = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(file);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String lineLower = line.toLowerCase();
				String arr[]= lineLower.split(" ");
                System.out.println(line);
                for(int i=0;i<arr.length;i++)
                {
                	String word = arr[i];
                	if (word.length() > 3) {
                		if (isNumeric(word) == false) {
                			if(wordFrequency.containsKey(word))
                				{
                					wordFrequency.put(word, wordFrequency.get(word)+1);
                				}
                			else
                				{
                				wordFrequency.put(word,1);
                				}
                		}
                	}
                }
            }
			
			bufferedReader.close();
            file.close();
            for(Map.Entry<String,Integer> entry: 
            	wordFrequency.entrySet())
    {
        System.out.println(entry.getKey()+
                " "+entry.getValue());
    }
		}
		catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}

}
