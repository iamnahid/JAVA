class OverDraft implements Account{
	
	int balance,overDr;
	
	public OverDraft(int balance){
		this.balance = balance;
		
	}
	public void setOverDraftLimit(int overDr){
		this.overDr = overDr;
		
	}
	public boolean withdraw(int amount)
	{
		balance = balance + overDr;
		System.out.println("Overdrafted limit: "+overDr);
		
		if ( balance >= amount )
		{
			System.out.println("You wanted to withdraw: "+amount);
			balance = balance - amount;
			
			return true;
		}
			
		else 
			System.out.println("Your amount \t"+amount+"/=\t is invalid");
			return false;
	}
		
	public void show(){
			System.out.println("OBalance: "+balance);
	}
	
	public static void main(String arg[]){
		
		OverDraft oDr = new OverDraft(150000);
		
		
		oDr.show();
		oDr.setOverDraftLimit(2000);
		oDr.withdraw(153000);
		oDr.show();
			
	}
}
