package CS586.outPut;

import CS586.data.*;

public abstract class SetInitialValues {
	DataStore ds;
	
	public SetInitialValues(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void setInitialValues();

}
