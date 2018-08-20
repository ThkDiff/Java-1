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