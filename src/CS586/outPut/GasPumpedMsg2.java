package CS586.outPut;

import CS586.data.*;

public class GasPumpedMsg2 extends GasPumpedMsg{

	public GasPumpedMsg2(DataStore ds) {
		super(ds);
	}

	@Override
	public void gasPumpedMsg() {
		DS_2 d2 = (DS_2) ds;
		System.out.println("LITER PUMPED: " + d2.L);
		System.out.println("TOTAL: $" + d2.total);
		System.out.println();
	}

}
