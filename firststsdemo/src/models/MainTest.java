package models;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		
		
		Pokemon mew = new Pokemon("MewToo", 5, 10, 7, 7, false);
		Pokemon jaRule = new Pokemon("jaRule", 4, 2, 9, 5, false);
		
		
		System.out.println(jaRule.getAttack());
		
	}

}
