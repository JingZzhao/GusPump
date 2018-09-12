package CS586.outPut;

public class RejectMsg1 extends RejectMsg{

	@Override
	public void rejectMsg() {
		System.out.println("Credit Card is not Approved");
		System.out.println("The Transition is Cancelled");
		System.out.println();
	}

}
