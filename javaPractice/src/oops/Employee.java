package oops;

public class Employee {
	int empid;
	String empname;
	int salary;
	int deptno;
	
	Employee(int id,String name,int sal,int dno)
	{
		 empid = id;
		 empname =name;
		 salary =sal;
		 deptno =dno;
	}
	
	void display() 
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	 public static void main (String args[]) 
	 {
		 /*Employee e = new Employee();
		 e.empid=1;
		 e.empname="asd";
		 e.salary=10000;
		 e.deptno=10;
		 e.display();
		 
		 Employee e1 = new Employee();
		 e1.empid=2;
		 e1.empname="John";
		 e1.salary=20000;
		 e1.deptno=20;
		 e1.display();*/
		 Employee e = new Employee(1,"Raj",10000,10);
		 e.display();
		 
		 Employee e1 = new Employee(2,"John",20000,20);
		 e1.display();
		 
	 }

}
