class Account{
	private String accName;
	private String accId;
	private double balance;
	
	
	Account(){}
	Account(String accName,String accId, double balance){
			this.accName=accName;
			this.accId=accId;
			this.balance=balance;
			
	}
	void deposit(int accAmount)
	{
			
				
				balance =balance + accAmount;
	
				
			
	}
	
	void withdraw(int accAmount)
	{
			if ( balance > accAmount)
				
			{
				
				balance =balance - accAmount;
	
				
				}
				
	}
	
	
	void show(){
			System.out.println("\n"+accName);
			System.out.println(accId);
			System.out.println(balance);
	}
	
	
	void transferMoney(int amount,String id)
	{		
			if (balance > amount)
				
			{
				
				balance =balance - amount;
	
				
				}
				
			
	}
	}
	
class Student{
	
	private String sname;
	private String sid;
	private String dept;
	private double cgpa;
		
	Student(){}
	Student(String sname, String sid, String dept, double cgpa)
		{
			this.sname=sname;
			this.sid=sid;
			this.dept=dept;
			this.cgpa=cgpa;
		}
		
	void show(){
			System.out.println(sname);
			System.out.println(sid);
			System.out.println(dept);
			System.out.println(cgpa);
	}
	
	public void setName(String name)
	{
		this.sname=name;
		
	}
	
	public void setId(String sid)
	{
		this.sid=sid;
		
	}
	
	public void setDept(String dept)
	{
		this.dept=dept;
		
	}
	
	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
		
	}
	
	String getName(String name)
	{
			return name;
	}
	
	String getId(String id)
	{
			return id;
	}
	
	String getDept(String dept)
	{
			return dept;
	}
	
	double getCgpa(double cgpa)
	{
			return cgpa;
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


class Main{
		
	public static void main(String arg[])
	{
			Account oAcc = new Account ("NAHID","14-27656-3",100000);
			Account oAcc1 = new Account ("GOKU","14-27696-3",150000);
			oAcc.show();
			oAcc1.show();
			oAcc.deposit(10000);
			oAcc.show();
			oAcc1.deposit(10000);
			oAcc1.show();
			
		
			Student oStudent = new Student ();
			Student oStudent1 = new Student ("NahiD","14-27656-3","CSSE",3.48);
			Student oStudent2 = new Student ("Goku","14-27686-3","CSE",4.00);
			oStudent1.show();
	}
	
}