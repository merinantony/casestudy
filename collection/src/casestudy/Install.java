package casestudy;
import java.util.*;
public class Install {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList list=new ArrayList();
		int flag=0;
do {
	System.out.println("1.Display installed applications");
	System.out.println("2.Install an application");
	System.out.println("3.Uninstall an application");
	System.out.println("4.Quit");
	int a=sc.nextInt();
	switch(a) {
	case 1:
		Iterator itt=list.iterator();
		if(list.isEmpty())
			System.out.println("nothing installed");
		else
		{
			int j=0;
			while(itt.hasNext())
			{
				System.out.println(j+" "+itt.next());
				j++;
			}
		}
		//System.out.println("There is no application installed.\n" + "1.Display installed applications\n" + 
			//	"2.Install an application\n" + "3.Uninstall an application\n" +"4.Quit\n" + "");
		break;
	case 2:{
		Iterator it1=list.iterator();
		System.out.println("enter the app");
		
		String name=sc.next();
		flag=0;
		//list.add(name);
		while(it1.hasNext()) {
			String st= (String)it1.next();
			
		
		if(st.equals(name))
		{
			//System.out.println("Already installed");
			flag=1;
			break;
		}}
		if(flag==1)
		{
			System.out.println("Already installed");
		}
		else
			{
			list.add(name);
			}
	}
		//System.out.println("Application installed successfully.\n" + 
//"1.Display installed applications\r\n" + "2.Install an application\r\n" +"3.Uninstall an application\r\n" +"4.Quit\r\n" +"");
			break;
	case 3:{
		if(list.isEmpty())
			System.out.println("nothing installed");
		else {
		Iterator it=list.iterator();
		for(int i=0;i<a;i++)
		{
			System.out.println(i+" "+it.next());
		}
			System.out.println("Enter the index of application to removed");
		
			int index=sc.nextInt();
			list.remove(index);
			System.out.println("Successfully uninstalled");
		}}
		break;
	case 4:{
		System.out.println("Successfully exited");
		System.exit(0);
		
	}break;
	default:
		System.out.println("invalid input");
	}}
	while(true);

	}}


