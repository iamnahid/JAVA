class Current implements Account{
	
	int balance;
	
	public Current(int balance){
		this.balance = balance;
		
	}
	
	public boolean withdraw(int accAmount)
	{
		if ( balance >= accAmount )
				
			{
				
				balance = balance - accAmount;
				return true;
				
			}
		else 
			System.out.println("Your amount \t"+accAmount+"/=\t is invalid");
			return false;
	}
	
	public void show(){
	
		System.out.println("CBalance: "+balance);
	}
	
	
		
	public static void main(String arg[]){
		
		Current c = new Current(100000);
		
		
		c.show();
		c.withdraw(120000);
		c.show();
			
	}
}
