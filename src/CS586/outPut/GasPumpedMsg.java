package CS586.outPut;

import CS586.data.*;

public abstract class GasPumpedMsg {
	
	DataStore ds;
	public GasPumpedMsg(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void gasPumpedMsg();
	
}
