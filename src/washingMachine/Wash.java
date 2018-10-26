//Nathan Hebert 3/7/2018
package washingMachine;

public class Wash implements State{

	WashingMachine washingMachine;
	
	public Wash(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}
	
	//State code for inserting quarters
	public void insertQuarter() {
		System.out.println("Washing Machine is going, you cannot insert a quarter now");		
	}

	//State code for ejecting quarters
	public void ejectQuarter() {
		System.out.println("Washing Machine is going, you cannot eject a quarter now");		
	}

	//State code for starting loads
	public void startLoad() {
		System.out.println("Spin/Drain now started");
		washingMachine.setState(washingMachine.getSpinDrain());
	}

	//State code for canceling wash
	public void cancel() {
		System.out.println("Wash canceled, please insert new quarters.");
		washingMachine.setState(washingMachine.getNotFullyPaid());
	}

	//State code for out of order
	public void exception() {
		// TODO Auto-generated method stub		
	}

}
