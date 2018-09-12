package CS586.outPut;

import CS586.data.*;

public class PumpGasUnit1 extends PumpGasUnit{

	public PumpGasUnit1(DataStore ds) {
		super(ds);
	}

	@Override
	public void pumpGasUnit() {
		DS_1 d1 = (DS_1) ds;
		
		d1.G++;
		d1.total = d1.price * d1.G;
	}
	

}
