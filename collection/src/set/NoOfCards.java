package set;

import java.util.*;


public class NoOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String symbol;
int num,count=0;
Set<NewCard>set=new TreeSet<NewCard>(new Symbol());
NewCard[] c=new NewCard[40];
int n=sc.nextInt();
while(set.size()<n)
{
	symbol=sc.next();
	num=sc.nextInt();
	c[count]=new NewCard();
	c[count].setSymbol(symbol);
    c[count].setNum(num);
     set.add(c[count]);
count++;
//int m=sc.nextInt();	
}
System.out.println(n+" symbols gathered in "+count+" Cards.");
System.out.println("Cards are ");
Iterator<NewCard>itr=set.iterator();
while(itr.hasNext())
{
	NewCard ca=(NewCard)itr.next();
	System.out.println(ca.getSymbol()+" "+ca.getNum());
}
sc.close();
	}

}
