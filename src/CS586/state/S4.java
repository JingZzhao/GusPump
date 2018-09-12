package CS586.state;
import CS586.MDA_EFSM;

public class S4 extends GP_State {

	public S4(MDA_EFSM mda_efsm) {
		super(mda_efsm);
	}

	@Override
	public void StartPump() {
		if(mda_efsm.s == mda_efsm.GP_LS[5]){
			mda_efsm.ChangeState(6);
			mda_efsm.op.SetInitialValues();
			mda_efsm.op.ReadyMsg();
		}
	}	

}