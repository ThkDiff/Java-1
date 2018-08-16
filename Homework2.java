/**
 * Java. Level 1. Lesson 2. Homework 2.
 *
 *
 * 1.Create integer array that consist 0 and 1. For example:[1, 1, 0, 0, 1, 0,
 * 1, 1, 0, 0].Change 0 to 1, 1 to 0 using loop.
 *
 * 2.Create empty integer array of size 8. Fill this array with values: 
 * [0, 3, 6, 9, 12, 15, 18, 21] using loop.
 * 
 * 3.Create array: [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] pass on him using loop,
 * and the numbers that is lower than 6, multiply by 2.
 *
 * 4.Create square two-dimensional integer array ( the number of row and column is the same ) and 
 * fill its diagonal elements with 1 using loop.
 *
 * 5.Create one-dimensional array and find in this array min and max elements (without 
 * using Internet).
 *
 * 6.Write method to which not empty integer array is passed, method have to
 * return true if in this array there is a place, where sum of the left and 
 * right part of the array is the same. For example: checkBalance([1, 1, 1, 
 * || 2, 1]) --> true, checkBalance ([2, 1, 1, 2, 1]) --> false, checkBalance
 * ([10, || 10]) --> true, border is shown by symbols ||, this symbols are not a 
 * part of this array.
 *
 * 7.
 *
 *
 * @author Alexandr Kozlov
 * @version Aug 16, 2018
*/
class Homework2{
    public static void main(String[] args){
		
		// The name of the task № 1.
		changeValues();
		
		// The name of the task № 2.
		fillMassiv();
		
		// The name of the task № 3.
		multiplyNumbersBy2();
		
		// The name of the task № 4.
		fillDiagonals();
		
		// The name of the task № 5.
		findHighAndLow();

	}
	
	// Task № 1.
	public static void changeValues(){
		
		System.out.println("Task number 1.");
		System.out.println("Befor changing:");
		int[] t1 = {0, 1, 1, 0, 0, 1, 1};
		for(int i = 0; i < t1.length; i++){
			System.out.print(t1[i] + "\t");
		}
		System.out.println();
		System.out.println("After changing:");
		for (int i = 0; i < t1.length; i++){
			if (t1[i] == 0){
				t1[i] = 1;
				System.out.print(t1[i] + "\t");
			}
			else{
				t1[i] = 0;
				System.out.print(t1[i] + "\t");
			}
		}
		System.out.println();
		
	}
	
	// Task № 2.
	public static void fillMassiv() {
		
		// For share task.
		System.out.println("Task number 2."); 
		int[] t2 = new int[8];
		for (int i = 0, j = 0; i < 8; i++, j+=3){
			t2[i] = j;
			System.out.print(t2[i] + "\t");
		}
		System.out.println();
		
	}
	
	// Task № 3.
	public static void multiplyNumbersBy2(){
		
		System.out.println("Task number 3:");
		int[] t3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		System.out.println("Before multiplication:");
		for(int i = 0; i < t3.length; i++){
			System.out.print(t3[i] + "\t");
		}
		System.out.println();
		System.out.println("After multiplication:");
		for (int i = 0; i < t3.length; i++){
			if (t3[i] < 6){
				t3[i] *= 2;
			}
			System.out.print(t3[i] + "\t");
		}
		System.out.println();
	}
	
	// Task № 4.
	public static void fillDiagonals(){
		System.out.println("Task number 4.");
        int[][] array = new int[4][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == 0 && j == 0){
					array[i][j] = 1;
				}
				if (i == 1 && j ==1){
					array[i][j] = 1;
				}
				if (i == 2 && j == 2){
					array[i][j] =1;
				}
				if (i == 3 && j ==3){
					array[i][j] = 1;
				}
				if (i == 3 && j == 0){
					array[i][j] = 1;
				}
				if (i == 2 && j == 1){
					array[i][j] = 1;
				}
				if (i == 1 && j == 2){
					array[i][j] = 1;
				}
				if (i == 0 && j == 3){
					array[i][j] = 1;
				}
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	// Task № 5
	public static void findHighAndLow(){
		System.out.println("Task number 5.");
		int max = 0;
		int min = 0;
		int[] t5 = {1, 5, 19, 11, 31, 100, -5};
		for (int i = 0; i < t5.length; i++){
			if (max < t5[i]){
				max = t5[i];
			}
			if (min > t5[i]){
				min = t5[i];
			}
		}
		System.out.println("Max value - " + max);
		System.out.println("Min value - " + min);
	}
	
}

