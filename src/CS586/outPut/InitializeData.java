package CS586.outPut;

import CS586.data.*;

public abstract class InitializeData {
	
	DataStore ds;
	
	public InitializeData(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void initializeData();

}
