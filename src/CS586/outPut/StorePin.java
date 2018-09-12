package CS586.outPut;

import CS586.data.DataStore;

public abstract class StorePin {
	DataStore ds;	
	
	public StorePin(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void storePin();

}
