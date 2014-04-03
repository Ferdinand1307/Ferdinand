
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
		
	    someDog.setName("Max");     // AAA
	    System.out.println(someDog.name);//Ausgabe:Max
	    someDog2= new Dog("Fifi");  // BBB
	    someDog =someDog2;//Problem ist hier
	    System.out.println(someDog.name);//Ausgabe:Fifi
	    someDog.setName("Rowlf");   // CCC	
	    System.out.println(someDog.name);//Ausgabe:Rowlf
	    System.out.println(someDog2.name);//Ausgabe:Rowlf

	}
}
