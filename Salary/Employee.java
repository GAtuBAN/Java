package Salary;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		
	}
	public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }
	public double bonus() {
		int sum=0;
		int total=0;
		if(this.workHours>40)
			for(int i=41; i<= this.workHours; i++) {
				sum=i - 40;
				total=sum;
			}
		return total * 30;
	}
	public double raiseSalary() {
		double tempSalary=this.salary;
		int totalYear= 2022 - this.hireYear;
		if(totalYear<10) {
			return tempSalary * 0.05;
		}else if(totalYear>9 && totalYear<20){
			return tempSalary * 0.1;
		}else {
			return tempSalary * 0.15;
		}
	}
	@Override
    public String toString() {
        return  "Name: " + this.name + "\n" +
                "Salary: " + this.salary + "\n" +
                "Work Hours: " + this.workHours + "\n" +
                "Hire Year: " + this.hireYear + "\n" +
                "Tax: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Salary increase: " + raiseSalary() + "\n" +
                "Salary with tax and bonus: " + (this.salary - tax() + bonus()) + "\n" +
                "Total Salary: " + (this.salary + raiseSalary() - tax() + bonus());
    }
}