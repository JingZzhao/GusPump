package CS586.outPut;

import CS586.data.*;

public class SetPrice2 extends SetPrice{

	public SetPrice2(DataStore ds) {
		super(ds);
	}

	@Override
	public void setPrice(int g, int M) {
		//if M = 1, the price may be increased
		DS_2 d2 = (DS_2)ds;
		if(g == 1){//Regular gas
			d2.price = d2.Rprice;
			System.out.println("REGULAR GAS IS SELECTED: ");
		}
		else if(g == 2){//Super gas
			d2.price = d2.Sprice;
			System.out.println("SUPER GAS IS SELECTED: ");
		}
		else if(g == 3){//Premium gas
			d2.price = d2.Pprice;
			System.out.println("PREMIUM GAS IS SELECTED: ");
		}
		
	}

}
