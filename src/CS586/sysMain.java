package CS586;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import CS586.abstractFactory.*;
import CS586.data.*;
import CS586.gasPump.*;

public class sysMain {
	
	public static void printOperations(){
		System.out.println();
		System.out.println("  Select Operation:");
		System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-PayDebit,5-Pin,6-Cancel,7-Approved");
		System.out.println("8-Diesel,9-Regular,a-StartPump,b-PumpGallon,c-StopPump,d-FullTank,q-quit");
		System.out.println();
	}
	
	public static void printOperations2(){
		System.out.println();
		System.out.println("  Select Operation:");
		System.out.println("0-Activate,1-PayCash,2-PayCredit,3-Approved,4-Reject,5-Cancel,6-Premium,");
		System.out.println("7-Regular,8-Super,9-StartPump,a-PumpLiter,b-Stop,c-Receipt,d-NoReceipt,q-quit");
		System.out.println();
	}
	
	public static void main(String[] args){
		System.out.println("    CS586 Project");
		System.out.println("    Sprint 2018");
		System.out.println();
		System.out.println("     PROJECT");
		System.out.println("      DEMO");
		System.out.println();
		System.out.println();
		System.out.println("Jing Zhao    A20391046");
		System.out.println();
		System.out.println();
		System.out.println("Press any key");
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.println("Select GP-1 or GP-2");
			System.out.println("   1. GP-1");
			System.out.println("   2. GP-2");
			System.out.println();
			System.out.println("Select GP: ");
			System.out.println();
			System.out.println();
			
			int gasPumpType;
			String oper = "ini";
			try{
				gasPumpType = Integer.parseInt(scan.readLine());
				
				switch(gasPumpType){
				case 1:
					GP_Factory1 cf1 = new GP_Factory1();
					GP_1 gp1 = new GP_1(cf1);
					String p = "";
					
					System.out.println("            GasPump-GP1");
					System.out.println("        MENU of Operations");
					System.out.println("   0. Activate(float,float)");
					System.out.println("   1. Start()");
					System.out.println("   2. PayCredit()");
					System.out.println("   3. Reject()");
					System.out.println("   4. PayDebit(string)");
					System.out.println("   5. Pin(string)");
					System.out.println("   6. Cancel()");
					System.out.println("   7. Approved()");
					System.out.println("   8. Diesel()");
					System.out.println("   9. Regular()");
					System.out.println("   a. StartPump()");
					System.out.println("   b. PumpGallon()");
					System.out.println("   c. StopPump()");
					System.out.println("   d. FullTank()");
					System.out.println("   q. Quit the demo program");
					System.out.println("Please make a note of these operations");
					System.out.println();
					System.out.println("   GasPump-1 Execution");
					
					printOperations();				
					
					while(!oper.equals("q")){
						oper = scan.readLine();
						switch(oper){
						case "0": //Activate
							System.out.println("  Operation: Activate(float a, float b)");
							float a, b;
							System.out.println("Enter value of the parameter a:");
							try{
								a = Float.parseFloat(scan.readLine());
								System.out.println("Enter value of the parameter b:");
								b = Float.parseFloat(scan.readLine());
								gp1.Activate(a, b);
								printOperations();
							}
							catch(NumberFormatException e){
								printOperations();
							}
							break;
						case "1": //Start
							System.out.println("  Operation: Start()");
							gp1.Start();
							printOperations();
							break;
						case "2": //PayCredit
							System.out.println("  Operation: PayCredit()");
							System.out.println("");		
							System.out.println("Wait - Checking Credit Card");
							gp1.PayCredit();
							printOperations();
							break;
						case "3": //Reject
							System.out.println("  Operation: Reject()");
							gp1.Reject();
							printOperations();
							break;
						case "4": //PayDebit
							System.out.println("  Operation: PayDebit(string)");							
							System.out.println("Initialize Pin: ");
							p = scan.readLine();
							gp1.PayDebit(p);
							p = scan.readLine();
							printOperations();
							break;
						case "5": //Pin
							System.out.println("  Operation: Pin(string)");
							gp1.Pin(p);
							printOperations();
							break;
						case "6": //Cancel
							System.out.println("  Operation: Cancel()");
							gp1.Cancel();
							printOperations();
							break;
						case "7": //Approved
							System.out.println("  Operation: Approved()");
							gp1.Approved();
							printOperations();
							break;
						case "8": //Diesel
							System.out.println("  Operation: Diesel()");
							gp1.Diesel();
							printOperations();
							break;
						case "9": //Regular
							System.out.println("  Operation: Regular()");
							gp1.Regular();
							printOperations();
							break;
						case "a": //StartPump
							System.out.println("  Operation: StartPump()");
							gp1.StartPump();
							printOperations();
							break;
						case "b": //PumpGallon
							System.out.println("  Operation: PumpGallon()");
							gp1.PumpGallon();
							printOperations();
							break;
						case "c": //StopPump
							System.out.println("  Operation: StopPump()");
							gp1.StopPump();
							printOperations();
							break;
						case "d": //FullTank
							System.out.println("  Operation: FullTank()");
							gp1.FullTank();
							printOperations();
							break;
						case "q": //Quit
							System.exit(0);
							break;
						default:
							printOperations();
							break;							
						}//switch
						
					}//while
					
				case 2:
					GP_Factory2 cf2 = new GP_Factory2();
					GP_2 gp2 = new GP_2(cf2);
					
					System.out.println("            GasPump-GP2");
					System.out.println("        MENU of Operations");
					System.out.println("   0. Activate(float,float,float)");
					System.out.println("   1. PayCash(int)");
					System.out.println("   2. PayCredit()");
					System.out.println("   3. Approved()");
					System.out.println("   4. Reject()");
					System.out.println("   5. Cancel()");
					System.out.println("   6. Premium()");
					System.out.println("   7. Regular()");
					System.out.println("   8. Super()");
					System.out.println("   9. StartPump()");
					System.out.println("   a. PumpLiter()");
					System.out.println("   b. Stop()");
					System.out.println("   c. Receipt()");
					System.out.println("   d. NoReceipt()");
					System.out.println("   q. Quit the program");
					System.out.println("Please make a note of these operations");
					System.out.println();
					System.out.println("   GP-2 Execution");
					
					printOperations2();				
					
					while(!oper.equals("q")){
						oper = scan.readLine();
						switch(oper){
						case "0": //Activate
							System.out.println("  Operation: Activate(float a, float b, float c)");
							float a, b, c;
							System.out.println("Enter value of the parameter a:");
							try{
								a = Float.parseFloat(scan.readLine());
								System.out.println("Enter value of the parameter b:");
								b = Float.parseFloat(scan.readLine());
								System.out.println("Enter value of the parameter c:");
								c = Float.parseFloat(scan.readLine());
								gp2.Activate(a, b, c);
								printOperations2();
							}
							catch(NumberFormatException e){
								printOperations2();
							}
							break;
						case "1": //PayCash
							System.out.println("  Operation: PayCash(float c)");
							float ca;
							System.out.println("Enter value of the parameter c:");
							try{
								ca = Float.parseFloat(scan.readLine());
								gp2.PayCash(ca);
								printOperations2();
							}
							catch(NumberFormatException e){
								printOperations2();
							}
							break;
							
						case "2": //PayCredit
							System.out.println("  Operation: PayCredit()");	
							System.out.println("CHECKING CREDIT CARD - WAIT");
							gp2.PayCredit();
							printOperations2();
							break;
						case "3": //Approved
							System.out.println("  Operation: Approved()");
							gp2.Approved();
							printOperations2();
							break;
						case "4": //Reject
							System.out.println("  Operation: Reject()");
							gp2.Reject();
							printOperations2();
							break;						
						case "5": //Cancel
							System.out.println("  Operation: Cancel()");
							gp2.Cancel();
							printOperations2();
							break;
						case "6": //Premium
							System.out.println("  Operation: Premium()");
							gp2.Premium();
							printOperations2();
							break;
						case "7": //Regular
							System.out.println("  Operation: Regular()");
							gp2.Regular();
							printOperations2();
							break;
						case "8": //Super
							System.out.println("  Operation: Super()");
							gp2.Super();
							printOperations2();
							break;
						case "9": //StartPump
							System.out.println("  Operation: StartPump()");
							gp2.StartPump();
							printOperations2();
							break;
						case "a": //PumpLiter
							System.out.println("  Operation: PumpLiter()");
							gp2.PumpLiter();
							printOperations2();
							break;
						case "b"://Stop
							System.out.println("  Operation: Stop()");
							gp2.Stop();
							printOperations2();
							break;
						case "c": //Receipt
							System.out.println("  Operation: Receipt()");
							gp2.Receipt();
							printOperations2();
							break;
						case "d": //NoReceipt
							System.out.println("  Operation: NoReceipt()");
							gp2.NoReceipt();
							printOperations2();
							break;
						case "q": //Quit
							System.exit(0);
							break;
						default:
							printOperations();
							break;							
						}//switch
						
					}//while
				}
				
			}
			catch(IOException e){
				System.out.println("IO Error. Terminating ...");
				System.exit(1);
			}			
		}//while
	}//main

}
