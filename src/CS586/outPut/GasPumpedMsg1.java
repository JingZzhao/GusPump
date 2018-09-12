package CS586.outPut;

import CS586.data.*;

public class GasPumpedMsg1 extends GasPumpedMsg{

	public GasPumpedMsg1(DataStore ds) {
		super(ds);
	}

	@Override
	public void gasPumpedMsg() {
		DS_1 d1 = (DS_1) ds;
		System.out.println("# of gallons pumped: " + d1.G);
		System.out.println("Total: $" + d1.total);
		System.out.println();
	}

}
