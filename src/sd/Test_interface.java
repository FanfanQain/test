package sd;
interface Animal{
	public void changeweight(int a);
	public void sound();
}
class Pig implements Animal{
	int currentweight=100;
	public void changeweight(int weight) {
		currentweight=currentweight+weight;
		System.out.println("Pig's currentweight is:"+currentweight);
	}
	public void sound() {
		System.out.println("Pig's sound is: ho,ho,ho!");
	}
}
class Cat implements Animal{
	int currentweight=15;
	public void changeweight(int weight) {
		currentweight=currentweight+weight;
		System.out.println("Cat's currentweight is:"+currentweight);
	}
	public void sound() {
		System.out.println("Cat's sound is: mia,mia,mia!");
	}
}
class Dog implements Animal{
	int currentweight=20;
	public void changeweight(int weight) {
		currentweight=currentweight+weight;
		System.out.println("Dog's currentweight is:"+currentweight);
	}
	public void sound() {
		System.out.println("Dog's sound is: wang,wang,wang!");
	}
}
public class Test_interface {
	public static void main(String[]args) {
		//pig
		Pig pig=new Pig();
		pig.changeweight(10);
		pig.sound();
		//cat
		Cat cat=new Cat();
		cat.changeweight(5);
		cat.sound();
		//dog
		Dog dog=new Dog();
		dog.changeweight(5);
		dog.sound();
		
	}

}
