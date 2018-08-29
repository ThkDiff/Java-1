/**
 * 
 *
 * 1.Create classes Cat and Dog that inherit from class Animal.
 *
 * 2.Animals can perform actions run, swim, jump over obstacles. Value is passed
 * to each method as a parameter that means either lenght of obstacles
 * (for running or swimming) or height (for jumping).
 *
 * 3.Each animal has restrictions on actions (run: cat 200m, dog 500m; jump: cat 2m,
 * dog 0,5m; swim: cat can not swim, dog 10m).
 *
 * 4.When animal try to perform one of these actions it has to display result into
 * the console (For example: dog1.run(150); -> result: run: true).
 *
 *
 * @author Alexandr Kozlov
 * @version Aug 29, 2018
 */

class Homework6{
	public static void main (String[] args){

		Animal[] animals = {
			new Cat("Murka", "white", 3),
		    new Dog("Bobik", "brown", 7)};
		for (Animal animal : animals){
			System.out.println(animal.toString());
			animal.run(300);
			animal.jump(1.5);
			animal.swim(5);
			
		}
	}
}

class Cat extends Animal {
	
	private final int maxRun = 200;
	private final double maxJump = 2;
	
	Cat(String name, String color, int age){
		super(name,color,age);
	}
	
	@Override
	public void run(int lengthOfRun){
		if (lengthOfRun >= 0 && lengthOfRun <= maxRun)
			System.out.println("cat.run = " + lengthOfRun + " -> run:true");
		else
			System.out.println("cat.run = " + lengthOfRun + " -> run:false");
	}
	
	@Override
	public void jump(double heightOfJump){
		if (heightOfJump >= 0 && heightOfJump <= maxJump)
			System.out.println("Cat.jump = " + heightOfJump + " -> jump:true");
		else
			System.out.println("Cat.jump = " + heightOfJump + " -> jump:false");
	}
	
	@Override
	public void swim(int lengthOfSwim){
		System.out.println("Cat can not swim");
	}
}

class Dog extends Animal {
	
	private final int maxRun = 500;
	private final double maxJump = 0.5;
	private final int maxSwim = 10;
	
	Dog(String name, String color, int age){
		super(name,color,age);
	}
	
	@Override
	public void run(int lengthOfRun){
		if (lengthOfRun >= 0 && lengthOfRun <= maxRun)
			System.out.println("dog.run = " + lengthOfRun + " -> run:true");
		else
			System.out.println("dog.run = " + lengthOfRun + " -> run:false");
	}
	
	@Override
	public void jump(double heightOfJump) {
		if (heightOfJump >= 0 && heightOfJump <= maxJump)
			System.out.println("dog.jump = " + heightOfJump + " -> jump:true");
		else 
			System.out.println("dog.jump = " + heightOfJump + " -> jump:false");
	}
	
	@Override
	public void swim(int lengthOfSwim){
		if (lengthOfSwim >= 0 && lengthOfSwim <= maxSwim)
			System.out.println("dog.swim = " + lengthOfSwim + " -> swim:true");
		else 
			System.out.println("dog.swim = " + lengthOfSwim + " -> swim:false");
	}
	
}

interface IAnimal{
	abstract void run(int lengthOfRun);
	abstract void jump(double heightOfJump);
	abstract void swim(int lengthOfSwim);
}

abstract class Animal implements IAnimal{
	
	String name;
	String color;
	private int age;
	
	private final int maxRun = 0;
	private final int maxSwim = 0;
	private final double maxJump = 0;
	
	Animal(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	@Override
	public String toString(){
		return name + ", " + color + ", " + age;
	}
	
}