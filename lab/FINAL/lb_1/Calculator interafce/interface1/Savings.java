class Savings implements Account{
	
	double balance;
	
	public Savings(int balance){
		this.balance = balance;
		
	}
	
		
	public boolean withdraw(int accAmount){
		
		double trans = balance * 0.8; 
		if ( trans > accAmount )
				
		{
				
			balance = balance - accAmount;
			return true;
		}
		
		else 
			System.out.println("Your amount \t"+accAmount+"/=\t is invalid");
			return false;
	}
	
	public void show(){
	
		System.out.println("Balance: "+balance);
	}
	
	public static void main(String arg[]){
		
		Savings s = new Savings(100000);
		
		
		s.show();
		s.withdraw(80000);
		s.show();
			
	}
}