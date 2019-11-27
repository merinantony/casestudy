package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FreshGrad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
	    list.add("Hai");
	    list.add("Welcome");
	    list.add("Face");
	    ArrayList<String> list1=new ArrayList<String>();
	    list1.add("java");
	    list1.add("program");
	    list.addAll(list1);
	    Iterator<String> itr1=list.iterator();
	    while(itr1.hasNext()) {
	   System.out.println(itr1.next());
	    sc.close();
	}

	}

}
