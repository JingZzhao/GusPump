package CS586.outPut;

import CS586.data.*;

public class DisplayMenu1 extends DisplayMenu {
	public DisplayMenu1(DataStore ds){
		super(ds);
	}

	@Override
	public void displayMenu() {
		System.out.println("MENU:");
		System.out.println();
		System.out.println("Select type of gas: ");
		System.out.println("Regular");
		System.out.println("Diesel");
		System.out.println();
	}
}
