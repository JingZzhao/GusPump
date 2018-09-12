package CS586.outPut;

import CS586.data.*;

public class SetInitialValues1 extends SetInitialValues {

	public SetInitialValues1(DataStore ds) {
		super(ds);
	}

	@Override
	public void setInitialValues() {
		DS_1 d1 = (DS_1)ds;
		d1.G = 0;
		d1.total = 0;
	}	

}
