package CS586.outPut;

import CS586.data.*;

public class ReturnCash2 extends ReturnCash{
	
	public ReturnCash2(DataStore ds){
		super(ds);
	}

	@Override
	public void returnCash() {
		DS_2 d2 = (DS_2) ds;
		float cash_return = d2.cash - d2.total;
		if(cash_return > 0){
			System.out.println("RETURN $" + cash_return + " " + "of CASH");
		}
		d2.cash = 0;
	}

}
