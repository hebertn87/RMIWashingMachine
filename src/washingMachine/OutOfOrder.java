//Nathan Hebert 3/7/2018
package washingMachine;

public class OutOfOrder implements State {

WashingMachine washingMachine;
	
	public OutOfOrder(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}
	
	@Override
	public void insertQuarter() {
		//Do Nothing
		
	}

	@Override
	public void ejectQuarter() {
		//Do Nothing
	}

	@Override
	public void startLoad() {
		//Do Nothing
	}

	@Override
	public void cancel() {
				
	}

	@Override
	public void exception() {
		//Do Nothing
	}

}
