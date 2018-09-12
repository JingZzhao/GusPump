package CS586.state;
import CS586.MDA_EFSM;

public class S6 extends GP_State {

	public S6(MDA_EFSM mda_efsm) {
		super(mda_efsm);
	}

	@Override
	public void Receipt() {
		if(mda_efsm.s == mda_efsm.GP_LS[7]){
			mda_efsm.ChangeState(1);
			mda_efsm.op.PrintReceipt();
			mda_efsm.op.ReturnCash();
		}
	}

	@Override
	public void NoReceipt() {
		if(mda_efsm.s == mda_efsm.GP_LS[7]){
			mda_efsm.ChangeState(1);
			mda_efsm.op.ReturnCash();
		}
	}
	
	

}
