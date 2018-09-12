package CS586.outPut;

import CS586.data.*;

public class PrintReceipt2 extends PrintReceipt{

	public PrintReceipt2(DataStore ds) {
		super(ds);
	}

	@Override
	public void printReceipt() {
		DS_2 d2 = (DS_2) ds;
		System.out.println();
		System.out.println("RECEIPT: ");
		System.out.println("# OF LITERS: " + d2.L);
		System.out.println("Total: $" + d2.total);
		System.out.println();
	}

}
