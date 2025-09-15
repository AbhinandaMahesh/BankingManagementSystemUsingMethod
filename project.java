import java.util.*;
public class project {
	static double deposit(double balance, double amount) {
		return balance + amount;
	}
	
	//cheq deposite
	static double deposit(double balance, double amount, String cheqno) {
		System.out.println("chequ no: "+cheqno+" deposited");
		return balance + amount;
	}
	
	
	static double withdraw(double balance, double amount) {
		if(balance <= amount) {
			balance -= amount;
			System.out.println("withdraw successful");
		}else {
			System.out.println("insufficient balance");
		}
		return balance;
	}
	
	public static void main(String[] args) {
		//cash deposite
		
		
		Scanner sc = new Scanner(System.in);
		String name = "Abhinanda";
		double balance = 1000.0;
		long accountnumber = (long)(Math.random() * 100000);
		boolean isloggedIn = true;
		
		
		System.out.println("Welcome "+name);
		System.out.println("your account number: "+accountnumber);
		
		int choice;
		do {
			System.out.println("==== My ATM ====");
			System.out.println("1. Deposit cash");
			System.out.println("2. Deposit cheque");
			System.out.println("3. WithDraw");
			System.out.println("4. Check Balance");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 1:
				System.out.println("Deposite money through cash");
				double cash = sc.nextInt();
				balance = deposit(balance, cash);
				break;
			case 2:
				System.out.println("enter amount to deposite..");
				double cheque_amount = sc.nextDouble();
				sc.nextLine();
				System.out.println("enter the cheque number ");
				String cheque_number = sc.nextLine();
				balance = deposit(balance, cheque_amount, cheque_number);
				break;
			case 3:
				System.out.println("enter amount to withdraw: ");
				double withdraw = sc.nextDouble();
				balance = withdraw(balance, withdraw);
				break;
			case 4:
				System.out.println("current balance: "+balance);
				break;
			case 5:
				System.out.println("thank you for using ATM");
				break;
			
				default:
					System.out.println("invalid choice");
					
			}
		}while (choice != 5);
			
		}
		
		
	}


