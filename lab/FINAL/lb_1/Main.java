 abstract class Department {
	
	 String deptName;
	 int creditFee;
	
	Department(){}
		
	Department (String deptName, int creditFee)
		{
			this.deptName = deptName;
			this.creditFee = creditFee;
		}
	
	public void showInfo()
		{
			System.out.println("Deptname: "+deptName);
			System.out.println("Credit FEE: "+creditFee);	
		}
		
	public void calculateSemFee(int credit)
		{
			
		}
	
}


 class CS extends Department{
	
	 int cTotalCredits;
	 double cPerCreditFee = 5000.0;
	
	
	CS(){}
	
	CS (int cTotalCredits, double cPerCreditFee)
		{
			
			this.cTotalCredits = cTotalCredits;
			this.cPerCreditFee = cPerCreditFee;			
			
		}
		
	public  void calculateSemFee(int credit)
		{
				double semFee = credit * cPerCreditFee;
				
				System.out.println("Total Fee: "+semFee);
				
			
		}
		}
	
	


 class BBA extends Department{
	
	
	 int bTotalCredits;
	 double bPerCreditFee = 4500;
	
	
	BBA(){}
	
	BBA (int bTotalCredits, double bPerCreditFee)
		{
			this.bTotalCredits = bTotalCredits;
			this.bPerCreditFee = bPerCreditFee;			
			
		}
		
	public  void calculateSemFee(int credit)
		{
				double semFee = credit * bPerCreditFee;
				
				System.out.println("Total Fee: "+semFee);
		}	
			
	
	
}

 class EEE extends Department{
	
	
	 int eTotalCredits;
	 double ePerCreditFee;
	 
	
	
	EEE (){}
	
	EEE  (int eTotalCredits, double ePerCreditFee)
		{
			this.eTotalCredits = eTotalCredits;
			this.ePerCreditFee = ePerCreditFee;			
			
		}
		
	public  void calculateSemFee(int credit)
		{
			double semFee = credit * ePerCreditFee;
				
				System.out.println("Total Fee: "+semFee);
				
			
		}
	
	
	}


 class Student extends Department {
	
	 String sName;
	 String sId;
	 Department dept;
	
	Student (){}
	Student (String sName, String sId)
		{
			this.sName = sName;
			this.sId = sId;
			
		
		}
		
	public void showInfo()
		{
			System.out.println("Name: "+sName);
			System.out.println("ID: "+sId);
			System.out.println("Dept: "+dept);
		}
		
	public void setDept(Department dept)
		{
			this.dept = dept;
		}
		
	public void changeDept(Department dept)
		{
			this.dept = dept;
		}
	
	public void semFee(int totalCredit)
		{
			
			dept.calculateSemFee(totalCredit);
					
		}
	
}

class Main{
	
	public static void main(String arg[]){
		
		Department CS = new CS (149,5000.0);
		Department BBA = new BBA (140,4500.0);
		Department EEE = new EEE (168,5000.0);
		
		System.out.println("\n");
		
		Student oStud = new Student ("Nahid","14-27656-3");
		oStud.setDept(CS);
		oStud.showInfo();
		oStud.semFee(149);
		
		System.out.println("\n");
		
		oStud.changeDept(BBA);
		oStud.showInfo();
		oStud.semFee(148);
		
		System.out.println("\n");
		
		
		System.out.println("\n");
		
		Student oStud1 = new Student ("Naher","14-27959-3");
		oStud1.setDept(EEE);
		oStud1.showInfo();
		oStud1.semFee(146);
		
		System.out.println("\n");
		
		oStud1.changeDept(CS);
		oStud1.showInfo();
		oStud1.semFee(149);
		
		System.out.println("\n");
	}
		
}
		
	
	
	
