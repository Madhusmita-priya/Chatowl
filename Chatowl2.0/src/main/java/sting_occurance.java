import java.util.Scanner;

public class sting_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Madhusmita majhi";
String s2="";
//Scanner sc=new Scanner(System.in);
//char targetChar=sc.next().charAt(0);
///int countletter=0;
for(int i=0;i<s.length();i++) {
}
int totalcount=s.length(); //total len
int totalcount_afterremove=s.replace("a", "").length();
int count=totalcount-totalcount_afterremove;
System.out.println("Number occurance of a is:"+count);
System.out.println("Count words is s:"+s.length());

	}
}

