/**
 * 
 * 
 * 1.Create a class "Employee" with fields: name, position, email, phone, salary,
 * age;
 *
 * 2.Class constructor have to fill these fields when the object is created.
 *
 * 3.Inside the "Employee" class, write method that displays information about 
 * the object in the console.
 *
 * 4.Create an array of 5 employees.
 * Example:
 * Person[] persArray = new Person[5]; // Firstly, we declare an array of objects
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 
 * "892312312", 30000, 30); // Then for each cell of the array we define object
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 *
 * 5.Display information only about employees older than 40 using loop.
 *
 *
 *@author Alexandr Kozlov
 *@version Aug 27, 2018
*/

class Homework5{
	public static void main(String[] args){
		Worker[] worker = new Worker[5];
		worker[0] = new Worker("Alex Alex", "Scientist", "Alex@mail.ru", 
		"89165442332", 500000,55);
		worker[1] = new Worker("Igor Igor", "Businessman", "Igor@mail.ru",
		"89237864545", 3, 30);
		worker[2] = new Worker("Ivan Ivan","Engineer", "Ivan@mail.ru",
		"89567456353", 40000, 21);
		worker[3] = new Worker("Travis Travis", "Manager", "Travis@mail.ru",
		"89107156444", 50000, 63);
		worker[4] = new Worker("Vladimir Vladimir", "Farmer", "Vladimir@mail.ru",
		"9156438873", 70000, 70);
		for (int i = 0; i < 5; i++){
			if(worker[i].age > 40){
			    System.out.println("worker number " + (i + 1) + ":");
			    worker[i].displayInformation();
			}
		}
		
		System.out.println();
		// Example of using of method toString();
		System.out.println(worker[3].toString());
	}
}

class Worker{
	String FIO;
	String Post;
	String email;
	String phoneNumber;
	int salary;
	int age;
	
	Worker(String FIO, String Post, String email, String phoneNumber, int salary, 
	int age){
		this.FIO = FIO;
		this.Post = Post;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.age = age;
	}
	
	void displayInformation(){
		System.out.println(FIO + ", " + Post + ", " + email + ", " + phoneNumber 
		+ ", " + salary + ", " + age);
	}
	
	/** Я же правильно понял, в задание со звездочкой нужно метод toString() 
	класса Object переопределить в моем классе Worker, и использовать для
	выводы инвормации о сотрудниках.
	*/
	public String toString(){
		return "FIO: " + FIO + ", " + "Position: " + Post + ", " + "email: " 
		+ email + ", " + "Phone Number: " + phoneNumber + ", " + "Salary: " + salary
		+ ", " + "Age: " + age;
	}
	
}