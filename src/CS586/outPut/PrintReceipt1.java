package CS586.outPut;

import CS586.data.*;

public class PrintReceipt1 extends PrintReceipt{

	public PrintReceipt1(DataStore ds) {
		super(ds);
	}

	@Override
	public void printReceipt() {
		DS_1 d1 = (DS_1) ds;
		System.out.println();
		System.out.println("Receipt: ");
		System.out.println("# of Gallons: " + d1.G);
		System.out.println("Total: $" + d1.total);
		System.out.println();
	}

}
