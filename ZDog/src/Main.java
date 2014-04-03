
public class Main {

	/**
	 * @param args
	 */
	static Dog someDog2;
	public static void main(String[] args) {

		Dog myDog = new Dog("Rover");
		System.out.println(myDog.name);//Ausgabe:Rover
		foo(myDog);
		System.out.println(myDog.name);//Ausgabe:Max

		


	}
	
	public static void foo(Dog someDog) {
		
	    someDog.setName("Max"); 
	    System.out.println(someDog.name);
	    someDog2= new Dog("Fifi");  
	    someDog =someDog2;
	    System.out.println(someDog.name);
	    someDog.setName("Rowlf");   
	    System.out.println(someDog.name);
	    System.out.println(someDog2.name);

	}
}
