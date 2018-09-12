package CS586.state;
import CS586.MDA_EFSM;

public class S3 extends GP_State {

	public S3(MDA_EFSM mda_efsm) {
		super(mda_efsm);
	}

	@Override
	public void Cancel() {
		if(mda_efsm.s == mda_efsm.GP_LS[4]){
			mda_efsm.ChangeState(1);
			mda_efsm.op.ReturnCash();
			mda_efsm.op.CancelMsg();
		}
	}

	@Override
	public void SelectGas(int g) {
		if(mda_efsm.s == mda_efsm.GP_LS[4]){
			mda_efsm.op.SetPrice(g, mda_efsm.M);
		}
	}

	@Override
	public void Continue() {
		if(mda_efsm.s == mda_efsm.GP_LS[4]){
			mda_efsm.ChangeState(5);
		}
	}
	
	

}
