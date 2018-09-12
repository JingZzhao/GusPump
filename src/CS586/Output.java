package CS586;

import CS586.abstractFactory.*;
import CS586.outPut.*;
import CS586.data.*;

public class Output {
	private StorePrices StorePrices;
	private PayMsg PayMsg;
	private StoreCash StoreCash;
	private DisplayMenu DispalyMenu;
	private RejectMsg RejectMsg;
	private SetPrice SetPrice;
	private ReadyMsg ReadyMsg;
	private SetInitialValues SetInitialValues;
	private PumpGasUnit PumpGasUnit;
	private GasPumpedMsg GasPumpedMsg;
	private StopMsg StopMsg;
	private PrintReceipt PrintReceipt;
	private CancelMsg CancelMsg;
	private ReturnCash ReturnCash;
	private WrongPinMsg WrongPinMsg;
	private StorePin StorePin;
	private EnterPinMsg EnterPinMsg;
	private InitializeData InitializeData;
		
	public Output(GP_Factory af){
		this.CancelMsg = af.GetCancelMsg();
		this.DispalyMenu = af.GetDispalyMenu();
		this.EnterPinMsg = af.GetEnterPinMsg();
		this.GasPumpedMsg = af.GetGasPumpedMsg();
		this.InitializeData = af.GetInitializeData();
		this.PayMsg = af.GetPayMsg();
		this.PrintReceipt = af.GetPrintReceipt();
		this.PumpGasUnit = af.GetPumpGasUnit();
		this.ReadyMsg = af.GetReadyMsg();
		this.RejectMsg = af.GetRejectMsg();
		this.ReturnCash = af.GetReturnCash();
		this.SetInitialValues = af.GetSetInitialValues();
		this.SetPrice = af.GetSetPrice();
		this.StopMsg = af.GetStopMsg();
		this.StoreCash = af.GetStoreCash();
		this.StorePin = af.GetStorePin();
		this.StorePrices = af.GetStorePrices();
		this.WrongPinMsg = af.GetWrongPinMsg();
	}
		
	
	public void StorePrices(){
		this.StorePrices.storePrices();		
	}
	
	public void PayMsg(){
		this.PayMsg.payMsg();
	}
	
	public void StoreCash(){
		this.StoreCash.storeCash();
	}
	
	public void DisplayMenu(){
		this.DispalyMenu.displayMenu();
	}
	
	public void RejectMsg(){
		this.RejectMsg.rejectMsg();
	}
	
	public void SetPrice(int g, int M){
		this.SetPrice.setPrice(g, M);
	}
	
	public void ReadyMsg(){
		this.ReadyMsg.readyMsg();
	}
	
	public void SetInitialValues(){
		this.SetInitialValues.setInitialValues();
	}
	
	public void PumpGasUnit(){
		this.PumpGasUnit.pumpGasUnit();
	}
	
	public void GasPumpedMsg(){
		this.GasPumpedMsg.gasPumpedMsg();
	}
	
	public void StopMsg(){
		this.StopMsg.stopMsg();
	}
	
	public void PrintReceipt(){
		this.PrintReceipt.printReceipt();
	}
	
	public void CancelMsg(){
		this.CancelMsg.cancelMsg();
	}
	
	public void ReturnCash(){
		this.ReturnCash.returnCash();
	}
	
	public void WrongPinMsg(){
		this.WrongPinMsg.wrongPinMsg();
	}
	
	public void StorePin(){
		this.StorePin.storePin();
	}
	
	public void EnterPinMsg(){
		this.EnterPinMsg.enterPinMsg();
	}
	
	public void InitializeData(){
		this.InitializeData.initializeData();
	}
}
