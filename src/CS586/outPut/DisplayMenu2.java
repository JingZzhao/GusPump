package CS586.outPut;

import CS586.data.DataStore;

public class DisplayMenu2 extends DisplayMenu {

	public DisplayMenu2(DataStore ds) {
		super(ds);
	}

	@Override
	public void displayMenu() {
		//DS_1 d1 = (DS_1) data;
		System.out.println("MENU:");		
		System.out.println("SELECT TYPE OF GAS:");
		System.out.println();
		System.out.println("REGULAR");
		System.out.println("PREMIUM");
		System.out.println("SUPER");
		System.out.println();
	}
}
