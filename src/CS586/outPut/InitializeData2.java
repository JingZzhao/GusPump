package CS586.outPut;

import CS586.data.*;

public class InitializeData2 extends InitializeData{

	public InitializeData2(DataStore ds) {
		super(ds);
	}

	@Override
	public void initializeData() {
		DS_2 d2 = (DS_2)ds;
		d2.price = 0;
		d2.cash = 0;
	}

}
