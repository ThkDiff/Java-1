/**
 * 
 *
 * 1.Expand the task about cats and plates with food.
 *
 * 2.Make so in the plates can not be negative number of food (for example, in
 * the plate 10 of food, but the appetite of cat is 15-20)
 *
 * 3.You should to add for each cat the satiety field (when we create cat, they 
 * are satiated). If the cat managed to eat (enough food), satiety = true;
 *
 * 4.We counting, if the number of food in the plate far too small, it does not 
 * eat, it can not be partly satiated (this is done to simplify the logic of program)
 *
 * 5.You should to create cats array and plate with food, ask all cats to eat from 
 * this plate and then display information about cats satiety into the console.
 * 
 * 6.Add method in the plate, with wich it would be possible to add food into the 
 * plate.
 *
 *
 *@author Alexandr Kozlov
 *@version Sep 3, 2018
*/

import java.util.Random;

class Homework7{
	
	public static void main(String[] args){
		
		Random r = new Random();
		Plate plate = new Plate(15);
		Cat[] cats = { new Cat("Murka", 10),
		new Cat("Kasper",10), 
		new Cat("Murzik", 3),
		new Cat("Aska", 7),
		new Cat("Mashka", 9)};
		for (Cat cat : cats){
			cat.eat(plate);
			System.out.println(cat.toString() + " " + " " + "Satiety = " + 
			cat.getSatiety());
			plate.increaseFood(r.nextInt(10));
		}
		
		
	}
}

class Plate{
	private int food;
	
	Plate(int food){
		this.food = food;
	}
	
	void decreaseFood(int appetite){
		    this.food -= appetite;
	}
	
	int getFood(){
		return this.food;
	}
	
	
	void increaseFood(int i){
		if (this.food <= 5){
			this.food += i;
		}
	}
	
}

class Cat{
	
	private String name;
	private int appetite;
	private boolean satiety = false;
	
	Cat(String name, int appetite){
		this.name = name;
		this.appetite = appetite;
	}
	
	void eat(Plate plate){
		if(plate.getFood() >= appetite){
		    plate.decreaseFood(appetite);
		    satiety = true;
		}
	}
	
	boolean getSatiety(){
		return satiety;
	}
	
	@Override
	public String toString(){
		return name + " appetite: " + appetite;
	}
}