package stepDefinations;

public class StringSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "prajakta";
		String t="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			t = t+s.charAt(i);
		}
		
		System.out.println(t);
		
		boolean equal = s.equals(t);
		
		if(equal==true)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}

}
