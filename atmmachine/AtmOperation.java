package atmmachine;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AtmOperation implements AtmInterface {

	AtmMachine atmMachine = new AtmMachine();

	@Override
	public void viewBalance() {
		JOptionPane.showMessageDialog(null,"Your available balance is " + atmMachine.getCurrentBalance());

	}

	@Override
	public void deposit(int depAmount) {
		JOptionPane.showMessageDialog(null,"Amount " + depAmount + " has been deposited sucessfully!");
		atmMachine.setCurrentBalance(atmMachine.getCurrentBalance() + depAmount);
		viewBalance();
	}

	@Override
	public void withdrawal(int withdrawAmount) {
		if (withdrawAmount <= atmMachine.getCurrentBalance()) {
			JOptionPane.showMessageDialog(null,"Amount " + withdrawAmount + " has been withdrawn sucessfully!");
			atmMachine.setCurrentBalance(atmMachine.getCurrentBalance() - withdrawAmount);
		}

		else {
			JOptionPane.showMessageDialog(null,"Insufficient Balance !");
		}
		viewBalance();
	}

	@Override
	public void miniStatement() {

	}

	@Override
	public void fundTransfer(int beneficiaryCardNo, int ifscCode, int transferAmount) {
		
		Customer toValidate_beneficiary=null;
		
		for(Customer beneficiary:AtmDriverCode.server) {
			if((beneficiary.getAtmArray().get(0).getCardNo()==beneficiaryCardNo&&(beneficiary.getAtmArray().get(0).getIfscCode())==ifscCode)) {
				toValidate_beneficiary=beneficiary;
			break;
			}
		}

		if (toValidate_beneficiary!=null ) {
			JOptionPane.showMessageDialog(null,"Validation sucessfull !");
            atmMachine.setCurrentBalance(atmMachine.getCurrentBalance() + transferAmount);
			
		}
		else {
			System.out.println("Invalid Beneficiary !");
		}
		
	}

}