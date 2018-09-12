package CS586.outPut;

import CS586.data.*;

public class SetInitialValues2 extends SetInitialValues {

	public SetInitialValues2(DataStore ds) {
		super(ds);
	}

	@Override
	public void setInitialValues() {
		DS_2 d2 = (DS_2)ds;
		d2.L = 0;
		d2.total = 0;
	}	

}