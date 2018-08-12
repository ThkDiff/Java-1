/**
 * Java. Level 1. Lesson 1. Homework 1.
 *
 *
 * 1.Create variables of all passed data types and initialize theit values;
 *
 * 2.Write method, that calculate: a * (b + c / d), and return result, where a,b,c,d is an input parameters of this method.
 *
 * 3.Write method that accept two numbers for input and check that their amount is between 10 and 20(inclusive), if yes - return true, otherwise - false.
 *
 * 4.Write method that get integer as a parameter, method have to print to console whethere positive or negative number was passed. Comment: Zero is considered a positive number.
 *
 * 5.Write method that get integer as a parameter, method have to return true if the number is negative.
 *
 * 6.Write method that get line as a parameter, that denoting name, method have to output to the console message: "Hellow, specified name".
 *
 * 7. Write method that define whether this year is a leap and output to the console message. Every fourth year is a leap, except for every hundredth, at the same time every four hundredth is a leap.
 *
 *
 * @author Alexandr Kozlov
 * @version Aug 11, 2018
 */
 






class Homework1 {
   public static void main(String[] args){
	   
		Task2();
	   System.out.println(Task3(5,7,90,127));
	   System.out.println(Task4(10,10));
	   Task5(-7);
	   System.out.println(Task6(-4));
	   Task7("Alex");
	   Task8(100);
	  
	 
	   
   }
   public static void Task2(){
	   int a = 7;
	   byte b = 15;
	   short s = 28;
	   long l = 400000000L;
	   float f = 10.0f;
	   double d = 167.2345;
		char ch = 'FFF';
	   boolean j = true;
	  
	   
	
   }
   public static int Task3 (int a, int b, int c, int d){
	   
	   return a * (b + (c / d));
   }
   
   public static boolean Task4(int a, int b){
	   
	   if((10 <= a + b) && (a + b <= 20)){
		   return true;
	   }
	   
	   else {
		  
		   return false;
	   }
   }
   
   public static void Task5(int a){
	   if(a >= 0){
		   System.out.println("Number is positive");
		   }
		else{
			System.out.println("Number is negative");
		}
   }
    
	// Task6 said that I should return true if the number is negative. However, if the number is positive, it does not go inside "if". Neveretheless method should return something, so I decide to add "else" for that matter.
   public static boolean Task6(int x){
	   if(x < 0){
		   return true;
	   }
	   else{
		   return false;
	   }
	   
   }
   
   public static void Task7(String s){
	   System.out.println("Hellow, " + s);
   }
  
  public static void Task8(int y){
	  if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)){
		  System.out.println("Leap year");
	  }
	 else{
		 System.out.println("Not leap");
		  
	  }  
  }
   
   
}