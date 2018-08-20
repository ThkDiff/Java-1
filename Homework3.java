/**
 *
 *
 * 1.Write a program that guesses a random number from 0 to 9, and the user is 
 * given 3 attempts to guess this number. Every time you try, the computer must 
 * tell you whether the number specified by the user is more than the one conceived, 
 * or less. After winning or losing a request is displayed - "Repeat the game again? 
 * 1 - yes / 0 - no »(1 - repeat, 0 - no).
 * 
 * 2.Create array from the words: String[] words = {"apple", "orange", "lemon", "banana", 
 * apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
 * "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
 * "pumpkin", "potato"}; 
 * When the program is ran, the computer guess a word, asks the user for an answer,compares 
 * it with the hidden word and tells whether the user answered correctly. If the word is not 
 * guessed, the computer displays the letters that are in place. 
 * apple - hidden;
 * apricot - user answer;
 * ap############# (15 symbols so that the user can not know the length of the word);
 * To compare the two words character by character, you can use:
 * String str = "apple";
 * str.charAt(0); the method returns the char that is located in the word str in the 
 * first position;
 * Play till the user do not guess the word.
 * Use just small letters.
 *
 *
 *@author Alexandr Kozlov
 *@version Aug 20, 2018
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Homework3{
	public static void main(String[] args){
		
		// Task number 2.
		System.out.println("Task number 2.");
		programm2();
		
		// Task number 1.
		System.out.println("Task number 1.");
		programm();
		
	}
	
	public static void programm(){
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int x = 1;
		while ( x == 1){
			int y = random.nextInt(10);
			for (int i = 0; i < 3; i++){
				System.out.println("Try to guess the number.");
				int z = sc.nextInt();
				if (z > y)
					System.out.println("It is not true.Your number is bigger.");
				if (z < y)
					System.out.println("It is not true.Your number is smaller.");
				if (z == y){
					System.out.println("Correct!Do you want to play again?");
				    break;
				}
				if (i == 2){
					System.out.println("Correct number is " + y + "." + 
					"Do you want to play again?");
					break;
				}
			}
			x = sc.nextInt();
		}
		
	}
	
	public static void programm2(){
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String[] words = {"apple", "orange", "lemon", "banana", "apricot",
		"avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
		"leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
		"pear", "pepper", "pineapple", "pumpkin", "potato"};
		String yourWord;
		System.out.println(Arrays.toString(words));
		int x = random.nextInt(words.length);
		char[] chNew = new char[15]; // For tips
		char[] ch = words[x].toCharArray(); // Variable to set a length of a word
		System.out.println("Proggram made up the word.Try to to guess it.");
		for (int i = 0; i < 15; i++){
			chNew[i] = '#';
		}
		while(true){
			yourWord = sc.next();
			if (yourWord.equals(words[x])){
				System.out.println("Correct!");
				break;
			}
			else{
				System.out.println("Wrong.");
				char[] ch2 = yourWord.toCharArray();//Variable to set a length of a word.
				for (int i = 0; i < ch.length; i++){
					if ( i >= ch2.length)
						break;
					if (words[x].charAt(i) == yourWord.charAt(i))
						chNew[i] = words[x].charAt(i);
				}
				System.out.println(chNew);
		    }
	    }
		
    }
}