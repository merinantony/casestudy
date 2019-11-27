package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		ArrayList list=new ArrayList();//Arraylist class declaration
		//ArrayList<string> list=new ArrayList();
		//ArrayList<Integer> list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name ");
			String name=sc.next();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			list.add(name);
			list.add(age);
		}
		Iterator itr=list.iterator();//IT IS USED TO TRAVERSE A ELEMENT ONE BY ONE
		while(itr.hasNext())//boolean hasNext(): returns true if the iteration has more element
		{
			System.out.println(itr.next());   //returns the next element in the iteration
		}
	}

}
