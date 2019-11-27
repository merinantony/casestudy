package linkedlist;
import java.util.*;
public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int n=sc.nextInt();
LinkedList<String> list=new LinkedList<String>();
for(int i=0;i<n;i++)
{
	System.out.println("Enter the name");
	String name=sc.next();
	list.add(name);
}
System.out.println("Enter the name");
String str1=sc.next();
System.out.println("Size of list :"+list.size());
System.out.println("list is "+list.isEmpty());
sc.close();//DAISY//DAISY//DAISY//DAISY//DAISY//DAISY//DAISY//DAISY//DAISY//DAISY
	}

}
