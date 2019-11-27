package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Encapsuls_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		n=sc.nextInt();
		ArrayList al=new ArrayList();
		Employeee[] emp=new Employeee[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			name=sc.next();
			System.out.println("enter the age");
			age=sc.nextInt();
			emp[i]=new Employeee();
			emp[i].setAge(age);
			emp[i].setName(name);
			al.add(emp[i]);
			
		}
		Iterator<Employeee> itr=al.iterator();
		while(itr.hasNext())
		{
			Employeee e=itr.next();
			System.out.println(e.getName()+" "+e.getAge());
		}
		sc.close();
	}

}
