package CS586.state;
import CS586.MDA_EFSM;

public class Start extends GP_State{
	public Start(MDA_EFSM mda_efsm){
		super(mda_efsm);
	}

	@Override
	public void Activate() {
		if(mda_efsm.s == mda_efsm.GP_LS[0]){
			mda_efsm.ChangeState(1);		
			mda_efsm.op.StorePrices();
		}
	}

}
