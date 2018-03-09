//Nathan Hebert 3/7/2018
package washingMachine;

public class WashingMachine {
	
	State notFullyPaid;
	State paid;
	State rinse;
	State wash;
	State spinDrain;
	State outOfOrder;
	
	State state;
 
	public WashingMachine() {
		notFullyPaid = new NotFullyPaid(this);
		paid = new Paid(this);
		rinse = new Rinse(this);
		wash = new Wash(this);
		spinDrain = new SpinDrain(this);
		
		state = notFullyPaid;
	}
	
	void setState(State state) {
		this.state = state;
	}
 
    public State getState() {
        return state;
    }
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void startLoad() {
		state.startLoad();
	}
	
	public void cancelWash() {
		state.cancel();
	}

    public State getNotFullyPaid() {
        return notFullyPaid;
    }

    public State getPaid() {
        return paid;
    }

    public State getRinse() {
        return rinse;
    }

    public State getWash() {
        return wash;
    }

    public State getSpinDrain() {
        return spinDrain;
    }
}
