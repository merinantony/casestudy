package map;

import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		String name;
int age;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
Map<Integer,Employee1> map=new HashMap<Integer,Employee1>();
Employee1[]emp=new Employee1[n];
for(i=0;i<n;i++)
{
	name=sc.next();
	age=sc.nextInt();
	emp[i]=new Employee1[];
	emp[i].setAge(age);
	emp[i].setName(name);
	map.put(i,emp[i]);
	
}
for(Map.Entry<Integer,Employee>)
	}

}
