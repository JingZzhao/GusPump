package CS586.outPut;

import CS586.data.*;

public class StorePin1 extends StorePin {
	
	public StorePin1(DataStore ds){
		super(ds);
	}

	@Override
	public void storePin() {
		DS_1 d1 = (DS_1) ds;
		d1.pin = d1.temp_p;
		System.out.println();
	}
}
