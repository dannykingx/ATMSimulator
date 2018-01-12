import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class AccountTest {

	public static void main(String[] args) {
		
		
		
		String input; // to hold the users input
		
		BankAccount  account0 = new BankAccount(); // will set balance to 0.0
		
		BankAccount account1 = new BankAccount(1000.0); // startBalance = 1000.00 (decimal)
		
		BankAccount account2 = new BankAccount("1000.00"); // balance = "1000.00" str (String)
		
		DecimalFormat  dollar = new DecimalFormat("#,###.##");
		
		input = JOptionPane.showInputDialog("What is your " + 
											"account's starting balance?");
		
		BankAccount account = new BankAccount(input); // bank account object
		
		input = JOptionPane.showInputDialog("How much were " + 
											"you paid this month?");
		account.deposit(input);
		
		// Display new balance;
		
		JOptionPane.showMessageDialog(null, 
								"Your pay has been deposited.\n" + 
								"You current balance is $ " + dollar.format(account.getBalance()));

		input = JOptionPane.showInputDialog("How much would " +
											"you like to withdraw? ");
		
		account.withdraw(input);
		
		JOptionPane.showMessageDialog(null,
								"Now your balance is $ " + 
								dollar.format(account.getBalance()));
		
		System.exit(0);
		

	}

}
