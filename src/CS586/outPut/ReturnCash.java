package CS586.outPut;

import CS586.data.*;

public abstract class ReturnCash {
	DataStore ds;
	
	//GasPump1 doesn't need to shared data structure
	public ReturnCash(){
		
	}
	
	public ReturnCash(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void returnCash();

}
