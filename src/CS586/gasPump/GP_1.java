package CS586.gasPump;

import CS586.MDA_EFSM;
import CS586.Output;
import CS586.data.*;
import CS586.abstractFactory.*;

public class GP_1 {
	MDA_EFSM m;
	DS_1 d1;
	//public float temp_a = 0;
	//public float temp_b = 0;
	
	public GP_1(GP_Factory af){
		this.d1 = (DS_1)af.GetDataStore();
		this.m = new MDA_EFSM();
		this.m.op = new Output(af);
	}
	
	
	public void checkActivate(){
		if(d1.temp_a == 0 || d1.temp_b == 0){
			System.out.println("No activate the gas pump");
		}
	}
	
	public void Activate(float a, float b){
		if(a >0 && b>0){
			d1.temp_a = a;
			d1.temp_b = b;
			m.Activate();
		}
	}
	
	public void Start(){
		checkActivate();
		m.Start();
	}
	
	public void PayCredit(){
		checkActivate();
		m.Paytype(1);
	}
	
	public void Reject(){
		checkActivate();
		m.Reject();
	}
	
	public void PayDebit(String p){
		checkActivate();
		d1.temp_p = p;
		m.Paytype(3);
	}
	
	public void Pin(String x){
		checkActivate();
		if(d1.temp_p.equals("")){
			System.out.println("No initialize pin");
		}
		if(x.equals(d1.temp_p)){
			m.CorrectPin();
		}
		else
			m.IncorrectPin();
	}
	
	public void Cancel(){
		checkActivate();
		m.Cancel();
	}
	
	public void Approved(){
		checkActivate();
		m.Approved();
	}
	
	public void Diesel(){
		checkActivate();
		m.SelectGas(4);
	}
	
	public void Regular(){
		checkActivate();
		m.SelectGas(1);
	}
	
	public void StartPump(){
		checkActivate();
		if(d1.price > 0){
			m.Continue();
			m.StartPump();
		}
	}
	
	public void PumpGallon(){
		checkActivate();
		m.Pump();
	}
	
	public void StopPump(){
		checkActivate();
		m.StopPump();
		m.Receipt();
	}
	
	public void FullTank(){
		checkActivate();
		m.StopPump();
		m.Receipt();
	}

}
