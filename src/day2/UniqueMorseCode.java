package day2;

import java.util.HashSet;

public class UniqueMorseCode {
	public static int uniqueMorseRepresentations(String[] words) {
        String []morseStrings = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> wordafterSet = new HashSet<String>();
        for(int i =0; i < words.length; i++){
        	String temp = "";
        	String concatenateString = words[i];
        	char[] concatenate = concatenateString.toCharArray();
        	for(int j = 0; j < concatenateString.length(); j++){
        		temp += morseStrings[concatenate[j] - 'a'];
        	}
        	wordafterSet.add(temp);
        }
        return wordafterSet.size();
	}

	public static void main(String[] args) {
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}
}
