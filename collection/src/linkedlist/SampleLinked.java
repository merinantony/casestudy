package linkedlist;
import java.util.*;
public class SampleLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
LinkedList<String> list=new LinkedList<String>();
for(int i=0;i<n;i++)
{
	String name=sc.next();
	list.add(name);
}
String str1=sc.next();
System.out.println("Size of list :"+list.size());
System.out.println("list is "+list.isEmpty());
	}

}
