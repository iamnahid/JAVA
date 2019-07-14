class Account{
	private  String accName;
	private String accId;
	protected double balance;
	
	
	Account(){
				
	System.out.println("Account CLass");
	
		}
	Account(String accName,String accId, double balance){
			this.accName=accName;
			this.accId=accId;
			this.balance=balance;
			
	}
public	void deposit(int accAmount)
	{
			balance=balance-accAmount;
	}
	
public	boolean withdraw(int accAmount)
	{
		if (balance > accAmount)
		{
			balance=balance-accAmount;
			return true;
		}
		else return false;
	}
	
public	void show(){
			System.out.println(accName);
			System.out.println(accId);
			System.out.println(balance);
	}
	
	}


class OverDraftAccount extends Account{

	 int overDraftLimit;
	
	OverDraftAccount(){
				
	System.out.println("OverDraftAccount CLass");
	
		}
		
	OverDraftAccount(String accName,String accId, double balance,int overDraftLimit){
				
		super(accName,accId,balance);
		this.overDraftLimit=overDraftLimit;
	
		}

	public boolean withdraw(int amount)
	{
		
		
		if (balance >= amount  &&  amount < overDraftLimit)
		{
			balance = balance - amount;
			
			return true;
			}
			
		else 
			return false;
			
		}
	
}

class SavingsAccount extends Account{
	
	
	SavingsAccount()
	{
		
			System.out.println("Savings Account");
		
	}
	
	SavingsAccount(String accName,String accId, double balance){
				
		super(accName,accId,balance);
			
		}
	
	public boolean withdraw(int amount)
	{
		
		double totalBalance;
		
		totalBalance = (balance * 0.8);
		if (totalBalance > amount)
			{
				
				balance=totalBalance - amount;
			
				return true;
			}
			
		else 
			return false;
		
			
	}
		
	
			}
			
class CurrentAccount extends Account{
	
	CurrentAccount()
	{
		System.out.println("Current Account");
	}
	
	CurrentAccount(String accName,String accId, double balance){
				
		super(accName,accId,balance);
			
		}
	
	
	public boolean withdraw(int amount)
	{
		
		
		if (balance >= amount)
		{
			balance = balance - amount;
			
			return true;
			}
			
		else 
			return false;
			
		}
	
}

class Main {

	public static void main(String arg[]){
			
			Account objectAccount1 =new Account("ACCOUNT","A14-27856-3",200000.0);
			OverDraftAccount objectOver =new OverDraftAccount("OVER","O14-27656-3",100000.0,15000);
			SavingsAccount objectSavings = new SavingsAccount("SAVINGS","S14-555-9",50000.0);
			CurrentAccount objectCurrent = new CurrentAccount("CURRENT","S14-999-9",45000.0);

			Account objectAccount2 =new OverDraftAccount("ACCOUNT1","14-27856-3",20000.0,15000);
			OverDraftAccount objectOver1=new OverDraftAccount("OVER1","14-27656-3",30000.0,15000);
			Account objectSavings1 = new SavingsAccount("SAVINGS1","S14-555-9",55000.0);
			Account objectCurrent1= new CurrentAccount("ACCOUNT2","A14-999-9",40000.0);
			Account objectAccount3 =new SavingsAccount("ACCOUNT3","A14-27856-3",2000.0);
			Account objectAccount4 =new CurrentAccount("ACCOUNT4","A14-27856-3",3000.0);
			

		//objectAccount1.show();
		//	objectOver.show();
		   //     objectSavings.show();
			//objectCurrent.show();
			
			objectOver.withdraw(16000);
			objectOver.show();
		
			objectOver1.withdraw(14000);
			objectOver1.show();
		
			objectSavings.withdraw(50000);
			objectSavings.show();
			
			objectCurrent.withdraw(45000);
			objectCurrent.show();
			
			objectSavings1.withdraw(50000);
			objectSavings1.show();
			
			objectSavings1.withdraw(30000);
			objectSavings1.show();
			
			objectCurrent1.withdraw(39000);
			objectCurrent1.show();
			
			objectAccount2.withdraw(50000);
			objectAccount2.show();
			
			objectAccount3.withdraw(350);
			objectAccount3.show();
			
			objectAccount4.withdraw(360);
			objectAccount4.show();



			
			}


	}