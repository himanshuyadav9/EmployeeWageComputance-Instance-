public class EmployeeWage
{
 private final int isFullTime;
	    private final int isPartTime;
	    private final int empRatePerHour;
	    
	    public PartTime(int isFullTime ,int isPartTime, int empRatePerHour)
	    {
	    	this.isFullTime=isFullTime;
	    	this.isPartTime=isPartTime;
	    	this.empRatePerHour=empRatePerHour;
	    }
	    
	    public void empWage()
	    {
	    	int empWage;
	    	int empHour=0;

	    	double empCheck = (int) ((Math.random()*10)%3);
	    	if(empCheck==isFullTime)
	    	{
	    		System.out.println("Employee is Present for Full time");
	    		empHour=8;
	    	}
	    	else if(empCheck==isPartTime)
	    	{
	    		System.out.println("Employee is Present for Part Time");
	    		empHour=4;
	    	}
	    	else
	    	{
	    		System.out.println("Employee is Absent");
	    	}
	    	empWage=empHour*empRatePerHour;
	    	System.out.println("Employee Wage: " + empWage);
	    	
	    }
	    public static void main(String[] args) {
	    	PartTime emp = new PartTime(1,2, 20);
	    	emp.empWage();
			
		}
}
