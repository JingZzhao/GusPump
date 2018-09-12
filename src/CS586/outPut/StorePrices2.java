package CS586.outPut;

import CS586.data.*;

public class StorePrices2 extends StorePrices {

	public StorePrices2(DataStore ds) {
		super(ds);
	}

	@Override
	public void storePrices() {
		DS_2 d2 = (DS_2)ds;
		d2.Rprice = d2.temp_a;
		d2.Sprice = d2.temp_b;		
		d2.Pprice = d2.temp_c;
		System.out.println("GAS PUMP IS ACTIVATED");
		System.out.println();
	}
	
}
