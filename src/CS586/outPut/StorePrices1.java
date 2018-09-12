package CS586.outPut;

import CS586.data.*;

public class StorePrices1 extends StorePrices {

	public StorePrices1(DataStore ds) {
		super(ds);
	}

	@Override
	public void storePrices() {
		DS_1 d1 = (DS_1)ds;
		d1.Rprice = d1.temp_a;
		d1.Dprice = d1.temp_b;		
	}
	
}
