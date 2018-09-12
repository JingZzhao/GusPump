package CS586.outPut;

import CS586.data.*;

public abstract class PumpGasUnit {
	DataStore ds;
	
	public PumpGasUnit(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void pumpGasUnit();

}
