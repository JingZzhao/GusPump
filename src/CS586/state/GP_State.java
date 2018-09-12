package CS586.state;
import CS586.MDA_EFSM;

public abstract class GP_State {
	MDA_EFSM mda_efsm;
	
	public GP_State(MDA_EFSM mda_efsm){
		this.mda_efsm = mda_efsm;
	}
	
	public void Activate(){
		
	}
	public void Start(){
		
	}
	public void Paytype(int t){
	
	}
	public void Reject(){
		
	}
	public void Cancel(){
		
	}
	public void Approved(){
		
	}
	public void StartPump(){
		
	}
	public void Pump(){
	
	}
	public void StopPump(){
		
	}
	public void SelectGas(int g){
		
	}
	public void Receipt(){
		
	}
	public void NoReceipt(){
		
	}
	public void CorrectPin(){
		
	}
	public void IncorrectPin(){
		
	}
	public void Continue(){
		
	}
}
