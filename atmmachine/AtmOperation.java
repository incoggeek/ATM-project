package atmmachine;
import javax.swing.JOptionPane;

public class AtmOperation implements AtmInterface {

	AtmMachine atmMachine = new AtmMachine();

	@Override
	public void viewBalance() {
		//System.out.println("Your available balance is " + atmMachine.getCurrentBalance());
		JOptionPane.showMessageDialog(null,"Your available balance is " + atmMachine.getCurrentBalance());

	}

	@Override
	public void deposit(int depAmount) {
		//System.out.println("Amount " + depAmount + " has been deposited sucessfully!");
		JOptionPane.showMessageDialog(null,"Amount " + depAmount + " has been deposited sucessfully!");
		atmMachine.setCurrentBalance(atmMachine.getCurrentBalance() + depAmount);
		viewBalance();
	}

	@Override
	public void withdrawal(int withdrawAmount) {
		if (withdrawAmount <= atmMachine.getCurrentBalance()) {
			//System.out.println("Amount " + withdrawAmount + " has been withdrawn sucessfully!");
			JOptionPane.showMessageDialog(null,"Amount " + withdrawAmount + " has been withdrawn sucessfully!");
			atmMachine.setCurrentBalance(atmMachine.getCurrentBalance() - withdrawAmount);
		}

		else {
			//System.out.println("Insufficient Balance!!");
			JOptionPane.showMessageDialog(null,"Insufficient Balance!!");
		}
		viewBalance();
	}

	@Override
	public void miniStatement() {

	}

}