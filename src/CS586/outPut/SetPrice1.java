package CS586.outPut;

import CS586.data.*;

public class SetPrice1 extends SetPrice{

	public SetPrice1(DataStore ds) {
		super(ds);
	}

	@Override
	public void setPrice(int g, int M) {
		//if M = 1, the price may be increased
		DS_1 d1 = (DS_1)ds;
		if(g == 1){//Regular gas
			d1.price = d1.Rprice;
			System.out.println("Regular gas is selected:");
		}
		else if(g == 4){//Diesel gas
			d1.price = d1.Dprice;
			System.out.println("Diesel gas is selected:");
		}
		
	}

}
