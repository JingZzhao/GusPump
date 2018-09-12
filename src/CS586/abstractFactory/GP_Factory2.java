package CS586.abstractFactory;

import CS586.data.DS_2;
import CS586.data.DataStore;
import CS586.outPut.*;

public class GP_Factory2 extends GP_Factory{
	private DataStore ds;
	
	public GP_Factory2(){
		this.ds = new DS_2();
	}

	@Override
	public DataStore GetDataStore() {
		return this.ds;
	}

	@Override
	public StorePrices GetStorePrices() {
		return new StorePrices2(this.ds);
	}

	@Override
	public PayMsg GetPayMsg() {
		return new PayMsg2();
	}

	@Override
	public StoreCash GetStoreCash() {
		return new StoreCash1(this.ds);
	}

	@Override
	public DisplayMenu GetDispalyMenu() {
		return new DisplayMenu2(this.ds);
	}

	@Override
	public RejectMsg GetRejectMsg() {
		return new RejectMsg2();
	}

	@Override
	public SetPrice GetSetPrice() {
		return new SetPrice2(this.ds);
	}

	@Override
	public ReadyMsg GetReadyMsg() {
		return new ReadyMsg2();
	}

	@Override
	public SetInitialValues GetSetInitialValues() {
		return new SetInitialValues2(this.ds);
	}

	@Override
	public PumpGasUnit GetPumpGasUnit() {
		return new PumpGasUnit2(this.ds);
	}

	@Override
	public GasPumpedMsg GetGasPumpedMsg() {
		return new GasPumpedMsg2(this.ds);
	}

	@Override
	public StopMsg GetStopMsg() {
		return new StopMsg2();
	}

	@Override
	public PrintReceipt GetPrintReceipt() {
		return new PrintReceipt2(this.ds);
	}

	@Override
	public CancelMsg GetCancelMsg() {
		return new CancelMsg1();
	}

	@Override
	public ReturnCash GetReturnCash() {
		return new ReturnCash2(this.ds);
	}

	@Override
	public WrongPinMsg GetWrongPinMsg() {
		return null;
	}

	@Override
	public StorePin GetStorePin() {
		return null;
	}

	@Override
	public EnterPinMsg GetEnterPinMsg() {
		return null;
	}

	@Override
	public InitializeData GetInitializeData() {
		return new InitializeData2(this.ds);
	}

}
