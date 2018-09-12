package CS586.outPut;

import CS586.data.*;

public abstract class SetPrice {
	DataStore ds;
	
	public SetPrice(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void setPrice(int g, int M);

}
