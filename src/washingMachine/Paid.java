//Nathan Hebert 3/7/2018
package washingMachine;

public class Paid implements State{

	WashingMachine washingMachine;
	
	public Paid(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}
	
	//State code for inserting quarters
	public void insertQuarter() {
		System.out.println("You already inserted a quarter.");
		
	}

	//State code for ejecting quarters
	public void ejectQuarter() {
		System.out.println("Quarter now ejected.");	
		washingMachine.setState(washingMachine.notFullyPaid);
	}

	//State code for starting loads
	public void startLoad() {
		System.out.println("Rinse now started.");
		washingMachine.setState(washingMachine.getRinse());
	}

	//State code for canceling wash
	public void cancel() {
		System.out.println("You cannot cancel a wash that is not going");
	}

	@Override
	public void exception() {
		// TODO Auto-generated method stub
		
	}

}