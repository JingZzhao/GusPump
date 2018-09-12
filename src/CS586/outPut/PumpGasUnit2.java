package CS586.outPut;

import CS586.data.*;

public class PumpGasUnit2 extends PumpGasUnit{

	public PumpGasUnit2(DataStore ds) {
		super(ds);
	}

	@Override
	public void pumpGasUnit() {
		DS_2 d2 = (DS_2) ds;
		
		d2.L++;
		d2.total = d2.price * d2.L;
	}
	

}