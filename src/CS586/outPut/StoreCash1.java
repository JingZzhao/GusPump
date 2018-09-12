package CS586.outPut;

import CS586.data.*;

public class StoreCash1 extends StoreCash {
	
	public StoreCash1(DataStore ds){
		super(ds);
	}

	@Override
	public void storeCash() {
		DS_2 d2 = (DS_2) ds;
		d2.cash = d2.temp_cash;
		System.out.println("Amount of cash inserted: $" + d2.cash);
		System.out.println();
	}
}
