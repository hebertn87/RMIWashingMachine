//Nathan Hebert 3/7/2018
package washingMachine;

public class SpinDrain implements State {

	WashingMachine washingMachine;
	
	public SpinDrain(WashingMachine washingMachine) {
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
			System.out.println("Wash now finished, have a nice day!");
			washingMachine.setState(washingMachine.getNotFullyPaid());
		}

		//State code for canceling wash
		public void cancel() {
			System.out.println("Wash canceled, please insert new quarters.");
			washingMachine.setState(washingMachine.getNotFullyPaid());

		}

	@Override
	public void exception() {
		// TODO Auto-generated method stub
		
	}
}
