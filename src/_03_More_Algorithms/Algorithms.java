package _03_More_Algorithms;

import java.util.Collections;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	int list = 0;
    	for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				list = i;
				break;
			}
		}
        return list;
    }

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 1; j > 0; j--) {
				if (unsortedSequences.get(j).length() < unsortedSequences.get(j - 1).length()) {
					Collections.swap(unsortedSequences, j, j - 1);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		for (int i = 0; i < results.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (results.get(j) < results.get(j - 1)) {
					Collections.swap(results, j, j - 1);
				}
			}
		}
		return results;
	}

	public static Object containsSOS(List<String> message2) {
		// TODO Auto-generated method stub
		boolean vary = false;
		String sos = ".. --- ...";
		int strings = 1;
		for (int i = 0; i < message2.size(); i++) {
			if (message2.get(i) == "/") {
				strings++;
			}
		}
		for (int i = 0; i < strings; i++) {
			if (message2.get(i).contains(sos)) {
				vary = true;
				break;
			}
		}
		return vary;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for (int i = 0; i < words.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (words.get(j).compareTo(words.get(j - 1)) < 0) {
					Collections.swap(words, j, j - 1);
				}
			}
		}
		return words;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int list = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				list++;
			}
		}
		return list;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallestPeep = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallestPeep) {
				tallestPeep = peeps.get(i);
			}
		}
		return tallestPeep;
	}
	public String mult(int num1, int num2) {
		   return num1 + " x " + num2 + " = " + (num1*num2);
	   }
	   
	   public static boolean isPrime(int num) {
		   for(int i = 2; i <= num/2; i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
	   
	   public static boolean isSquare(int num) {
		   for (int i = 1; i * i <= num; i++) { 
	           if ((num % i == 0) && (num / i == i)) { 
	               return true; 
	           } 
	       } 
	       return false; 
	   }
	   
	   public static boolean isCube(int num) {
		   for (int i = 1; i * i * i <= num; i++) { 
	           if ((num % i == 0) && (num / i / i == i)) { 
	               return true; 
	           } 
	       } 
	       return false;
	   }
}
