package CS586.state;
import CS586.MDA_EFSM;

public class S5 extends GP_State {

	public S5(MDA_EFSM mda_efsm) {
		super(mda_efsm);
	}

	@Override
	public void Pump() {
		if(mda_efsm.s == mda_efsm.GP_LS[6]){
			mda_efsm.op.PumpGasUnit();
			mda_efsm.op.GasPumpedMsg();
		}
	}

	@Override
	public void StopPump() {
		if(mda_efsm.s == mda_efsm.GP_LS[6]){
			mda_efsm.ChangeState(7);
			mda_efsm.op.StopMsg();
		}
	}
	
	

}
