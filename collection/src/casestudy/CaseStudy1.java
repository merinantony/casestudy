package casestudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import arrays.Employee;

public class CaseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String name,address,email,proof,proofid;
double con;
int i=1;
System.out.println("Enter the size");
int n=sc.nextInt();
ArrayList al=new ArrayList();
Employee[] emp=new Employee[n];
for(i=0;i<n;i++) {
System.out.println("Enter the name");
 name=sc.next();
System.out.println("Enter the Address");
 address=sc.next();
System.out.println("Contact Number");
 con=sc.nextDouble();
System.out.println("Email id");
 email=sc.next();
System.out.println("Enter the proof type");
 proof=sc.next();
System.out.println("proof id");
 proofid=sc.next();

emp[i]=new Employee();
emp[i].setName(name);
emp[i].setAddress(address);
emp[i].setCon(con);
emp[i].setEmail(email);
emp[i].setProof(proof);
emp[i].setProofid(proofid);
System.out.println("Thank you for registering \n Your id is " +i);
//System.out.println("Do you want to continue registration? (y/n)");
//String yes=sc.next();
//if(yes.equals("n"))
//{
	System.out.println("Do you want to update the email id?(y/n)");
	String c=sc.next();
	String cc=c.toLowerCase();
	if(c.equals("yes"))
	{
		System.out.println("Enter the updated email");
		String uemail=sc.next();
		emp[i].setEmail(uemail);
		emp[i].setName(name);
		emp[i].setAddress(address);
	}
	else
	{
		emp[i].setName(name);	
		emp[i].setEmail(email);
	}
	al.add(emp[i]);
	}
Iterator<Employee> itr=al.iterator();
int j=1;
while(itr.hasNext())
{
	Employee e=itr.next();
	System.out.println("Employee details"+j);
	System.out.println("****************");
	System.out.println("name :"+e.getName());
	System.out.println("email :"+e.getEmail());
	System.out.println("contact :"+e.getCon());
	System.out.println("prooftype :"+e.getProof());
	System.out.println("proof id :"+e.getProofid());
	System.out.println("");
	j++;
	
}

}}