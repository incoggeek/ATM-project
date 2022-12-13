package atmmachine;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AtmDriverCode{

	public static List<Customer> server=new ArrayList<Customer>();
	public static void main(String[] args) {
		
		//ATM details
		AtmDetails atmDetails1 = new AtmDetails(86510178,789,"23/09/2026",987, 000123);
		AtmDetails atmDetails2 = new AtmDetails(18638346,729,"11/09/2026",982, 000123);
		AtmDetails atmDetails3 = new AtmDetails(88382423,719,"23/11/2026",937, 000123);
		AtmDetails atmDetails4 = new AtmDetails(86243838,780,"22/09/2027",997, 000123);
		AtmDetails atmDetails5 = new AtmDetails(86534338,785,"23/12/2024",927, 000123);
		
		//Customer details
		Customer customer1 = new Customer("Md Shamim","Male");
		Customer customer2 = new Customer("Masira Zainab","Female");
		Customer customer3 = new Customer("Naila Wangnoo","Female");
		Customer customer4 = new Customer("Kiran Maurya","Female");
		Customer customer5 = new Customer("Mohd Abbas", "Male");
		
		//Adding respective details into array
		ArrayList<AtmDetails> atmArray1 = new ArrayList<AtmDetails>();
		atmArray1.add(atmDetails1);
		
		ArrayList<AtmDetails> atmArray2 = new ArrayList<AtmDetails>();
		atmArray2.add(atmDetails2);
		
		ArrayList<AtmDetails> atmArray3 = new ArrayList<AtmDetails>();
		atmArray3.add(atmDetails3);
		
		ArrayList<AtmDetails> atmArray4 = new ArrayList<AtmDetails>();
		atmArray4.add(atmDetails4);
		
		ArrayList<AtmDetails> atmArray5 = new ArrayList<AtmDetails>();
		atmArray5.add(atmDetails5);
		
		//Setting details to respective customers
		customer1.setAtmArray(atmArray1);
		customer2.setAtmArray(atmArray2);
		customer3.setAtmArray(atmArray3);
		customer4.setAtmArray(atmArray4);
		customer5.setAtmArray(atmArray5);
		
		//Adding into one array for validation
		
		server.add(customer1);
		server.add(customer2);
		server.add(customer3);
		server.add(customer4);
		server.add(customer5);

		AtmInterface atmOperation = new AtmOperation();
		
		long cardNo =  Long.parseLong(JOptionPane.showInputDialog("Enter your card no:"));
		short pin =  Short.parseShort(JOptionPane.showInputDialog("Enter your pin"));
		
		Customer toValidate=null;
		
		for(Customer c:server) {
			if((c.getAtmArray().get(0).getCardNo()==cardNo&&(c.getAtmArray().get(0).getPin()==pin))) {
				toValidate=c;
			break;
			}
		}
		
		//Validation
		if (toValidate!=null) {

			JOptionPane.showMessageDialog(null,"Validation sucessfull !");

			while (true) {
				
				//ATM menu
				JOptionPane.showMessageDialog(null,"1.View Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Mini Statement\n5.Fund Transfer\n6.Exit\n");
				
				short choice =  Short.parseShort(JOptionPane.showInputDialog("Enter your choice"));

				switch (choice) {
					case 1:
						// View Balance
						atmOperation.viewBalance();
						break;

					case 2:
						// Withdrawal
						int withdrawAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount"));
						atmOperation.withdrawal(withdrawAmount);
						break;

					case 3:
						// Deposit
						int depAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount"));
						atmOperation.deposit(depAmount);
						break;
					case 4:
						// Mini Statement
						break;
					case 5:
					    int beneficiaryCardNo = Integer.parseInt(JOptionPane.showInputDialog("Enter Beneficiary Card no"));
					    int ifscCode = Integer.parseInt(JOptionPane.showInputDialog("Enter IFSC code"));
						int transferAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount"));
						atmOperation.fundTransfer(beneficiaryCardNo, ifscCode, transferAmount);

					case 6:
						System.exit(0);

					default:
					    System.out.println("Invalid choice!");
						break;
				}
			}

		}else {
			//System.err.println("Incorrect details!!");
			JOptionPane.showMessageDialog(null,"Incorrect details !");
		}
	}

}
