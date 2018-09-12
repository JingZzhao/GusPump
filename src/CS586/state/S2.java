package CS586.state;
import CS586.MDA_EFSM;

public class S2 extends GP_State {

	public S2(MDA_EFSM mda_efsm) {
		super(mda_efsm);
	}

	@Override
	public void Approved() {
		if(mda_efsm.s == mda_efsm.GP_LS[3]){
			mda_efsm.ChangeState(4);
			mda_efsm.op.DisplayMenu();
		}
	}

	@Override
	public void Reject() {
		if(mda_efsm.s == mda_efsm.GP_LS[3]){
			mda_efsm.ChangeState(1);
			mda_efsm.op.RejectMsg();
		}
	}

	

}