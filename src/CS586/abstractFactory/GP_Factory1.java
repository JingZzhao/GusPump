package CS586.abstractFactory;

import CS586.data.DS_1;
import CS586.data.DataStore;
import CS586.outPut.*;

public class GP_Factory1 extends GP_Factory{
	private DataStore ds;
	
	public GP_Factory1(){
		this.ds = new DS_1();
	}

	@Override
	public DataStore GetDataStore() {		
		return this.ds;
	}

	@Override
	public StorePrices GetStorePrices() {
		return new StorePrices1(this.ds);
	}

	@Override
	public PayMsg GetPayMsg() {
		return new PayMsg1();
	}

	@Override
	public StoreCash GetStoreCash() {
		return null;
	}

	@Override
	public DisplayMenu GetDispalyMenu() {
		return new DisplayMenu1(this.ds);
	}

	@Override
	public RejectMsg GetRejectMsg() {
		return new RejectMsg1();
	}

	@Override
	public SetPrice GetSetPrice() {
		return new SetPrice1(this.ds);
	}

	@Override
	public ReadyMsg GetReadyMsg() {
		return new ReadyMsg1();
	}

	@Override
	public SetInitialValues GetSetInitialValues() {
		return new SetInitialValues1(this.ds);
	}

	@Override
	public PumpGasUnit GetPumpGasUnit() {
		return new PumpGasUnit1(this.ds);
	}

	@Override
	public GasPumpedMsg GetGasPumpedMsg() {
		return new GasPumpedMsg1(this.ds);
	}

	@Override
	public StopMsg GetStopMsg() {
		return new StopMsg1();
	}

	@Override
	public PrintReceipt GetPrintReceipt() {
		return new PrintReceipt1(this.ds);
	}

	@Override
	public CancelMsg GetCancelMsg() {
		return new CancelMsg1();
	}

	@Override
	public ReturnCash GetReturnCash() {
		return new ReturnCash1();
	}

	@Override
	public WrongPinMsg GetWrongPinMsg() {
		return new WrongPinMsg1();
	}

	@Override
	public StorePin GetStorePin() {
		return new StorePin1(this.ds);
	}

	@Override
	public EnterPinMsg GetEnterPinMsg() {
		return new EnterPinMsg1();
	}

	@Override
	public InitializeData GetInitializeData() {
		return new InitializeData1(this.ds);
	}

}
