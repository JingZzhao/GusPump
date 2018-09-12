package CS586.outPut;

import CS586.data.*;

public abstract class PrintReceipt {
	DataStore ds;
	
	public PrintReceipt(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void printReceipt();

}
