package CS586.outPut;

import CS586.data.*;

public abstract class DisplayMenu {
	DataStore ds;
	
	public DisplayMenu(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void displayMenu();

}
