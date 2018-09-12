package CS586.state;
import CS586.MDA_EFSM;

public class S0 extends GP_State {

	public S0(MDA_EFSM mda_efsm) {
		super(mda_efsm);
	}

	@Override
	public void Start() {
		if(mda_efsm.s == mda_efsm.GP_LS[1]){
			mda_efsm.ChangeState(2);
			mda_efsm.op.PayMsg();
			mda_efsm.op.InitializeData();
			mda_efsm.M = 1;
		}
	}
		

}
