package CS586.outPut;

import CS586.data.*;

public abstract class StorePrices {
	DataStore ds;
	
	public StorePrices(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void storePrices();

}
