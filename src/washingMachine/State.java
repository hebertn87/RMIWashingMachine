//Nathan Hebert 3/7/2018
package washingMachine;

public interface State {
	public void insertQuarter();
	public void ejectQuarter();
	public void startLoad();
	public void cancel();
	
	public void exception();
}