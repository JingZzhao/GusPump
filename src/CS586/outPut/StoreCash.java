package CS586.outPut;

import CS586.data.*;

public abstract class StoreCash {
	DataStore ds;
	
	public StoreCash(){
		
	}
	
	public StoreCash(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void storeCash();

}
