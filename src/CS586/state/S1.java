package CS586.state;
import CS586.MDA_EFSM;


public class S1 extends GP_State {

	public S1(MDA_EFSM mda_efsm) {
		super(mda_efsm);
	}
	

	@Override
	public void Paytype(int t) {
		if(mda_efsm.s == mda_efsm.GP_LS[2]){
			if(t == 1){
				mda_efsm.ChangeState(3);
			}
			else if(t == 2){
				mda_efsm.ChangeState(4);
				mda_efsm.op.StoreCash();
				mda_efsm.op.DisplayMenu();
				mda_efsm.M = 0;
			}
			else if(t == 3){
				mda_efsm.ChangeState(8);
				mda_efsm.op.EnterPinMsg();
				mda_efsm.op.StorePin();
			}
		}

	}
	
	

}