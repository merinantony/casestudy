package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
HashSet<String>set=new HashSet<String>();
set.add("Antony");
set.add("Daisy");
set.add("merin");
set.add("Abin");
set.add("Mebin");
set.add("clint");
set.add("merin");
set.add("Daisy");
Iterator<String>itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
