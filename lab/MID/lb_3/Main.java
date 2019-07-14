class Mobile {
	
	protected String mobileOwnerName;
	protected String mobileNumb;
	protected double mobileBalance;
	protected String mobileOsName;
	protected boolean lock;
	
	
	Mobile (){}
		
	Mobile (String mobileOwnerName, String mobileNumb, double mobileBalance, String mobileOsName, boolean lock)
		{
			this.mobileOwnerName 	= mobileOwnerName;
			this.mobileNumb = mobileNumb;
			this.mobileOwnerName = mobileOwnerName;
			this.mobileBalance = mobileBalance;
			this.mobileOsName = mobileOsName;
			this.lock = lock;
			
		}
		
	public void showInfo()
		
		{	
			if (lock == false )
				
			{
		
				System.out.println("Name: "+mobileOwnerName);
				System.out.println("Number: "+mobileNumb);
				System.out.println("Balance: "+mobileBalance);
				System.out.println("OS: "+mobileOsName);
				System.out.println("Lock Status: "+lock);
					
			}
			
						
		}
		
	public void recharge(int amount)
		{
				
			if (lock == false)
				
			{
		
				mobileBalance = mobileBalance+amount;
					
			}
			
			
			
		}
		
		
	public void callSomeone(int duration)
		
		{
			if (lock == false)
				
			{
		
				if (duration == 60)
					{
					
						mobileBalance = mobileBalance - 1;	
						
					}
					
			}				
			
		}
}


class Book{
	
	private String bName;
	private String bAuthor;
	private String bId;
	private String bType;
	private int aQuan;
	
	
	Book(){}
	Book(String bName,String bAuthor,String bId,String bType,int aQuan)
		{
			
				this.bName = bName;
				this.bAuthor = bAuthor;
				this.bId = bId;
				this.bType = bType;
				this.aQuan = aQuan;
			
		}
		
		
	public  void showInfo()
		
		{
				System.out.println(bName);
				System.out.println(bAuthor);
				System.out.println(bId);
				System.out.println(bType);
				System.out.println(aQuan);
		}
		
	public  void addBookCopy(String bName,String bId,int aQuan)
		
		{
				this.bName = bName;
				this.bId = bId;
				this.aQuan = aQuan;
		}
	
}


class Contact{
	
	private String name;
	private String id;
	private String mNo;
	private int age;
	private char gender;
	
	Contact(){}
	Contact(String name,String id,String mNo,int age,char gender)
		{
			
			this.name = name;
			this.id = id;
			this.mNo = mNo;
			this.age = age;
			this.gender = gender;
	
		}
		
	public void showInfo()
		{
			System.out.println(name);
			System.out.println(id);
			System.out.println(mNo);
			System.out.println(age);
			System.out.println(gender);
			
		}
		
	public void detectOperater(String name,String no)
		{
			if (no == "017")
				
			{
				System.out.println("GP");
			}
			
			if (no == "016")
				
			{
				System.out.println("AIRTEL");
			}
			
			if (no == "019")
				
			{
				System.out.println("BANGLALINK");
			}
			
			if (no == "018")
				
			{
				System.out.println("ROBI");
			}
			
			else
			{
					
				System.out.println("INVALID");
			}
			
		}
		
	}
	
	
	class Library extends Book {
		
		protected String libName;
		protected String libAddress;
		protected Book[] listBook;
		protected int totalBookList;
		
		
		Library(){}
		Library ( String libName, String libAddress, int totalBookList){
			
			this.libName = libName;
			this.libAddress = libAddress;
			this.totalBookList = totalBookList;
			
			
		}
		
		public void showInfo()
		{
			System.out.println("Name: "+libName);
			System.out.println("Address: "+libAddress);
			System.out.println("TotalList: "+totalBookList);
			System.out.println("bInfo: "+book.showInfo());
			
		}
	}