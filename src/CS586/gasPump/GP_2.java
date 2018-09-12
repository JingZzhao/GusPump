package CS586.gasPump;

import CS586.MDA_EFSM;
import CS586.Output;
import CS586.data.*;
import CS586.abstractFactory.*;

public class GP_2 {
	MDA_EFSM m;
	DS_2 d2;
	public float temp_a;
	public float temp_b;
	public float temp_c;
	
	public GP_2(GP_Factory af){
		this.d2 = (DS_2)af.GetDataStore();
		this.m = new MDA_EFSM();
		this.m.op = new Output(af);
	}
	
	public void printMenu(){
		System.out.println(
				""
				);
	}
	
	public void checkActivate(){
		if(d2.temp_a == 0 || d2.temp_b == 0 || d2.temp_c == 0){
			System.out.println("No activate the gas pump");
		}
	}
	
	public void Activate(float a, float b, float c){
		if(a >0 && b>0 && c > 0){
			d2.temp_a = a;
			d2.temp_b = b;
			d2.temp_c = c;
			m.Activate();
		}
	}
	
	public void PayCash(float c){
		checkActivate();
		if(c > 0){
			d2.temp_cash = c;
			m.Start();
			m.Paytype(2);
		}
	}
	
	public void PayCredit(){
		checkActivate();
		m.Start();
		m.Paytype(1);
	}
	
	public void Reject(){
		checkActivate();
		m.Reject();
	}
			
	public void Cancel(){
		checkActivate();
		m.Cancel();
	}
	
	public void Approved(){
		checkActivate();
		m.Approved();
	}
	
	public void Super(){
		checkActivate();
		m.SelectGas(2);
		m.Continue();
	}
	
	public void Regular(){
		checkActivate();
		m.SelectGas(1);
		m.Continue();
	}
	
	public void Premium(){
		checkActivate();
		m.SelectGas(3);
		m.Continue();
	}
	
	public void StartPump(){
		checkActivate();
		m.StartPump();
	}
	
	public void PumpLiter(){
		checkActivate();
		if((d2.cash > 0) && (d2.cash < d2.price * (d2.L + 1))){
			m.StopPump();
		}
		else
			m.Pump();
	}
	
	public void Stop(){
		checkActivate();
		m.StopPump();
	}
	
	public void Receipt(){
		checkActivate();
		m.Receipt();
	}
	
	public void NoReceipt(){
		checkActivate();
		m.NoReceipt();
	}

}