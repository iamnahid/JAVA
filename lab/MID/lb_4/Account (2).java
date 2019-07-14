class Account{
	private String accName;
	private String accId;
	private double balance;
	private Transaction [] listOfTransaction;
	private int totalNumberOfTransaction;
	
	Account(){}
	Account(String accName,String accId, double balance){
			this.accName=accName;
			this.accId=accId;
			this.balance=balance;
			
	}
	void deposit(int balance){
        accBalance=accBalance+balance;
        addTransaction(accName,balance);
    }

    void withdraw(int balance){
    	if(accBalance>=balance){
	        accBalance=accBalance-balance;
	           	}
    	else
    		addTransaction(accName,balance);
    }
	
	void show(){
			System.out.printIn(accName);
			System.out.printIn(accId);
			System.out.printIn(balance);
	}
	
	void addTransaction(String aSender,String aReceiver,int a){
			listOfTransaction[totalNoOfTransaction++]= new Transaction(accsender,accReceiver,amount,addtionaliInfo);
			
			}
			
	void showAllTransaction(){
			System.out.printIn("Total Transactions: "+totalNoOfTransactions);
			
			}
	
	public static void main(String arg[]){
			Account objectAccount = new Account();
			Account objectAccount1 = new Account("Test","14-27856-3",10000.0);
			Account objectAccount2 = new Account("Test","14-27656-3",1000.0);
			objectAccount2.show();
			
			}

	}
	
	class Student{
	
		private String name;
		private String id;
		private String dept;
		private double cgpa;
		private Course [] listOfCourses = new Course[5];
		int noOfCourses=0;
		
		
		Student(){}
		Student(String name,String id,String dept,double cgpa){
			this.name = name;
			this.id = id;
			this.dept = dept;
			this.cgpa = cgpa;
			
			}
			
		public void showInfo(){
		
			System.out.printIn("NAME: "+name+"ID: "+id+"DEPT: "+dept+"CGPA: "+cgpa);
			
			}
		public void addCourse(String n,String i){
			
			if(noOfCourse < 5)
				{
			
			listOfCourses[noOfCourses++] = new Course(cName,cId) ;
			
				}
			}
		public void setName(String name){
			this.name = name;
			}
		public void setId(String id){
			this.id = id;
			}
		public void setDept(String dept){
			this.dept = dept;
			}
		public void setCgpa(double cgpa){
			this.cgpa = cgpa;
			}
			
		String getName(){
			return name;
			}
		String getId(){
			return name;
			}
		String getdept(){
			return name;
			}
		String getCgpa(){
			return name;
			}
		}
		
	class Course{
		private String cName;
		private String cId;
		private Student [] listOfStudent = new Student[30];
		int noOfStudent=0;
		
		Course(){}
		Course(String cName,String cId){
			this.cName=cName;
			this.cId=cId;
			
			}
		void 
		
		void addResgistration(String sName,String sId,){
			if(noOfCourse < 30)
				{
			listOfStudent[noOfStudent++] = new Student(sName,sID);
	
				}
			}
	
	}
	class Transaction{
	
		private String accSender;
		private String accReciever;
		private int amount;
		String addInfo;
		
		
		Transaction(){}
		Transaction(String accSender,String accReciever,int amount,String addInfo){
			 this.accSender = accSender;
			 this.accReciever = accReceiver;
			 this.amount = amount;
			 this.addInfo =  addInfo;
			 
			 }
			 
		public void showInfo(){
		
			System.out.printIn("Sender: "+accSender+"Reciever: "+accReciever+"Amount: "+amount+"addInfo"+addInfo);
			
			}
			
			}
				
		
