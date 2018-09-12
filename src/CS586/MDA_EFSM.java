package CS586;

import CS586.state.*;

public class MDA_EFSM {
	public Output op;
	public int M = 0;	//The price may not be increased
	public GP_State s;
	public GP_State[] GP_LS = new GP_State[9];
	//private DataStore d = new DataStore();
	
	public MDA_EFSM(){
		//list of states in MDA-EFSM
		GP_LS[0] = new Start(this);
		GP_LS[1] = new S0(this);
		GP_LS[2] = new S1(this);
		GP_LS[3] = new S2(this);
		GP_LS[4] = new S3(this);
		GP_LS[5] = new S4(this);
		GP_LS[6] = new S5(this);
		GP_LS[7] = new S6(this);
		GP_LS[8] = new S8(this);
		
		s = GP_LS[0];	//Initialize the current state
	}
	
	public void ChangeState(int ID){
		s = GP_LS[ID];
	}
	
	public void Activate(){
		s.Activate();
	}
	
	public void Start(){
		s.Start();
	}
	
	/*
	 * @param t: t = 1 represents credit card payment type
	 * 			 t = 2 represents cash payment type
	 *           t = 3 represents debt card payment type
	 */
	public void Paytype(int t){
		s.Paytype(t);
	}
	
	public void Reject(){
		s.Reject();
	}
	
	public void Cancel(){
		s.Cancel();
	}
	
	public void Approved(){
		s.Approved();
	}
	
	public void StartPump(){
		s.StartPump();
	}
	
	public void Pump(){
		s.Pump();
	}
	
	public void StopPump(){
		s.StopPump();
	}
	
	/*
	 * @param g: g = 1 represents Regular gas
	 * 			 g = 2 represents Super gas
	 * 			 g = 3 represents Premium gas
	 * 			 g = 4 represents Diesel gas
	 */
	public void SelectGas(int g){
		s.SelectGas(g);
	}
	
	public void Receipt(){
		s.Receipt();
	}
	
	public void NoReceipt(){
		s.NoReceipt();
	}
	
	public void CorrectPin(){
		s.CorrectPin();
	}
	
	public void IncorrectPin(){
		s.IncorrectPin();
	}
	
	public void Continue(){
		s.Continue();
	}

}
