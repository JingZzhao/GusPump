package CS586.outPut;

import CS586.data.*;

public class InitializeData1 extends InitializeData{

	public InitializeData1(DataStore ds) {
		super(ds);
	}

	@Override
	public void initializeData() {
		DS_1 d1 = (DS_1)ds;
		d1.price = 0;
	}

}
