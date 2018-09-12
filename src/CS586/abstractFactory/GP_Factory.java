package CS586.abstractFactory;

import CS586.outPut.*;
import CS586.data.*;

public abstract class GP_Factory {
	
	public abstract DataStore GetDataStore();
	
	public abstract StorePrices GetStorePrices();
	
	public abstract PayMsg GetPayMsg();
	
	public abstract StoreCash GetStoreCash();
	
	public abstract DisplayMenu GetDispalyMenu();
	
	public abstract RejectMsg GetRejectMsg();
	
	public abstract SetPrice GetSetPrice();
	
	public abstract ReadyMsg GetReadyMsg();
	
	public abstract SetInitialValues GetSetInitialValues();
	
	public abstract PumpGasUnit GetPumpGasUnit();
	
	public abstract GasPumpedMsg GetGasPumpedMsg();
	
	public abstract StopMsg GetStopMsg();
	
	public abstract PrintReceipt GetPrintReceipt();
	
	public abstract CancelMsg GetCancelMsg();
	
	public abstract ReturnCash GetReturnCash();
	
	public abstract WrongPinMsg GetWrongPinMsg();
	
	public abstract StorePin GetStorePin();
	
	public abstract EnterPinMsg GetEnterPinMsg();
	
	public abstract InitializeData GetInitializeData();

}
