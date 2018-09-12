package CS586.state;
import CS586.MDA_EFSM;

public class S8 extends GP_State {

	public S8(MDA_EFSM mda_efsm) {
		super(mda_efsm);
	}

	@Override
	public void CorrectPin() {
		if(mda_efsm.s == mda_efsm.GP_LS[8]){
			mda_efsm.ChangeState(4);
			mda_efsm.op.DisplayMenu();
		}
	}

	@Override
	public void IncorrectPin() {
		if(mda_efsm.s == mda_efsm.GP_LS[8]){
			mda_efsm.ChangeState(1);
			mda_efsm.op.WrongPinMsg();
		}
	}
	
	

}