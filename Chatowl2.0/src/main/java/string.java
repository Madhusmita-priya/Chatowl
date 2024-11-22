
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1="Madhusmita";
 String s2="Priya";
 //System.out.println("To retrive the char from the given string");
 for(int i=0;i<s1.length();i++)
 {
	 System.out.println(s1.charAt(i));
 }
 System.out.println("Find the length of the string is"+s1.length());
/* System.out.println("To retrive the char from the given chararray");
 char[]ch=s2.toCharArray();
 for(int i=0;i<ch.length;i++)
 {
	 System.out.println(ch[i]); */
 System.out.println("Find the index of given string is"+s1.indexOf('m'));
 System.out.println("Find the madhusmita given index is 2,6 is"+s1.substring(2,6));
 System.out.println("To replace the old char to new char on s1"+s1.replace('s','m'));
 System.out.println(s1.compareTo(s2));
 String[] j=s2.split(s1);
 for(int i=0;i<j.length;i++)
 {
	 System.out.println(j[i]); 
 }


	}
		 
	}

